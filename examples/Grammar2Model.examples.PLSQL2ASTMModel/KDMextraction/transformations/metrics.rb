# *******************************************************************************
# * Copyright (c) 2010
# * All rights reserved. This program and the accompanying materials
# * are made available under the terms of the Eclipse Public License v1.0
# * which accompanies this distribution, and is available at
# * http://www.eclipse.org/legal/epl-v10.html
# *
# * Contributors:
# *    Javier Canovas (jlcanovas@um.es) 
# *******************************************************************************


use_library 'library://util/query'

Obs = Metrics::Observation.new

decorator Kdm::Code::CallableUnit do  
  def collectActionElements (type)
    result = []
    ext = self.codeElement.select{ |ce| ce.kind_of?(Kdm::Action::ActionElement)}.map { |ae| ae.collectActionElements(type)}
    result << ext.flatten
    return result.flatten
  end
end

decorator Kdm::Action::ActionElement do  
  def collectActionElements (type)
    result = []
    aes = self.actionRelation.select{ |ar| ar.kind_of?(type)}
    ext = self.codeElement.select{ |ce| ce.kind_of?(Kdm::Action::ActionElement)}.map { |ae| ae.collectActionElements(type)}
    result << aes << ext.flatten
    return result.flatten
  end
  
  def isDeclarative 
    if (self.kind == "select" || self.kind == "insert" || self.kind == "update") then
      return true
    else
      if(self.__container__.kind_of?(Kdm::Action::ActionElement)) then
        self.__container__.isDeclarative
      else
        return false
      end
    end    
  end
end

phase 'calculateCouplingLevel' do
top_rule 'couplingLevel' do
  from Kdm::Code::CompilationUnit
  to Metrics::ComplexMeasurement
  mapping do | cu, cm |
    cm.name = "Coupling level"
    
    cm.measurements = cu.codeElement.select{ |ce| ce.kind_of?(Kdm::Code::CallableUnit)}  
    
    Obs.measurements << cm
  end
end

rule 'couplingLevelTrigger' do
  from Kdm::Code::CallableUnit
  to Metrics::ComplexMeasurement
  mapping do | cu, cm |
    cm.name = cu.name
    cm.tag = "trigger"
    
    totalReads = cu.collectActionElements(Kdm::Action::Reads)
    impStatementsReads = totalReads.select{ |r| 
      r.from && !r.from.isDeclarative &&
      r.to && r.to.kind_of?(Kdm::Code::StorableUnit) && r.to.name.downcase.match(/^:/) 
    }
    declStatementsReads = totalReads.select{ |r| 
      r.from && r.from.isDeclarative &&
      r.to && r.to.kind_of?(Kdm::Code::StorableUnit) && r.to.name.downcase.match(/^:/) 
    } 
            
    totalWrites = cu.collectActionElements(Kdm::Action::Writes)
    impStatementsWrites = totalWrites.select{ |w| 
      w.from && !w.from.isDeclarative &&
      w.to && w.to.kind_of?(Kdm::Code::StorableUnit) && w.to.name.downcase.match(/^:/) 
    }     
    declStatementsWrites = totalWrites.select{ |w| 
      w.from && w.from.isDeclarative &&
      w.to && w.to.kind_of?(Kdm::Code::StorableUnit) && w.to.name.downcase.match(/^:/) 
    } 
     
    uiReadImp = Metrics::ComplexMeasurement.new(:name => "Imperative readings", :tag => "imperativeR")
    uiReadImp.measurements << Metrics::ValueMeasurement.new(:name => "Number imperative readings", :tag => "A11_value", :value => impStatementsReads.size)
    uiReadImp.measurements << Metrics::LinkMeasurement.new(:name => "Location of imperative readings", :tag => "location", :elements => impStatementsReads)    
   
    uiWriteImp = Metrics::ComplexMeasurement.new(:name => "Imperative writings", :tag => "imperativeW")
    uiWriteImp.measurements << Metrics::ValueMeasurement.new(:name => "Number imperative writings", :tag => "A12_value", :value => impStatementsWrites.size)
    uiWriteImp.measurements << Metrics::LinkMeasurement.new(:name => "Location of imperative writings", :tag => "location", :elements => impStatementsWrites)  
        
    uiWriteDecl = Metrics::ComplexMeasurement.new(:name => "Declarative writings", :tag => "declarativeW")
    uiWriteDecl.measurements << Metrics::ValueMeasurement.new(:name => "Number declarative writings", :tag => "A2_value", :value => declStatementsWrites.size)
    uiWriteDecl.measurements << Metrics::LinkMeasurement.new(:name => "Location of declarative writings", :tag => "location", :elements => declStatementsWrites)  
    
    uiReadDecl = Metrics::ComplexMeasurement.new(:name => "Declarative readings", :tag => "declarativeR")
    uiReadDecl.measurements << Metrics::ValueMeasurement.new(:name => "Number declarative readings", :tag => "A3_value", :value => declStatementsReads.size)
    uiReadDecl.measurements << Metrics::LinkMeasurement.new(:name => "Location of declarative readings", :tag => "location", :elements => declStatementsReads)  
    
    
    totalReflectives = cu.collectActionElements(Kdm::Action::Calls)
    reflectiveStatements = totalReflectives.select { |ref|
      ref.to.kind_of?(Kdm::Code::MethodUnit) && (ref.to.name.downcase == "name_in" || ref.to.name.downcase == "copy")
    }
    reflective = Metrics::ComplexMeasurement.new(:name => "Reflective calls", :tag => "reflective")
    reflective.measurements << Metrics::ValueMeasurement.new(:name => "Number of reflective calls", :tag => "B_value", :value => reflectiveStatements.size)
    reflective.measurements << Metrics::LinkMeasurement.new(:name => "Location of reflective calls", :tag => "location", :elements => reflectiveStatements)
    
    cm.measurements << uiReadImp
    cm.measurements << uiWriteImp
    cm.measurements << uiWriteDecl  
    cm.measurements << uiReadDecl  
    cm.measurements << reflective
  end
end

end

phase 'resumeCouplingLevel' do
refinement_rule 'resumeCouplingLevel' do
  from Kdm::Code::CompilationUnit
  to Metrics::ComplexMeasurement
  mapping do | cu, cm |
    cmaux = Metrics::ComplexMeasurement.new
    cmaux.name = "Resume"
    cmaux.tag = "resume"
    
    levelA11 = Metrics::ComplexMeasurement.all_objects.select{ 
      |cm| cm.tag == "trigger" && cm.measurements.any?{
        |m| m.kind_of?(Metrics::ComplexMeasurement) && m.tag == "imperativeR" && m.measurements.any?{
          |mm| mm.kind_of?(Metrics::ValueMeasurement) && mm.tag == "A11_value" && mm.value.to_i > 0
        }
      }
    }

    levelA12 = Metrics::ComplexMeasurement.all_objects.select{ 
      |cm| cm.tag == "trigger" && cm.measurements.any?{
        |m| m.kind_of?(Metrics::ComplexMeasurement) && m.tag == "imperativeW" && m.measurements.any?{
          |mm| mm.kind_of?(Metrics::ValueMeasurement) && mm.tag == "A12_value" && mm.value.to_i > 0
        }
      }
    }
    
    levelA2 = Metrics::ComplexMeasurement.all_objects.select{ 
      |cm| cm.tag == "trigger" && cm.measurements.any?{
        |m| m.kind_of?(Metrics::ComplexMeasurement) && m.tag == "declarativeW" && m.measurements.any?{
          |mm| mm.kind_of?(Metrics::ValueMeasurement) && mm.tag == "A2_value" && mm.value.to_i > 0
        }
      }
    }
    
    levelA3= Metrics::ComplexMeasurement.all_objects.select{ 
      |cm| cm.tag == "trigger" && cm.measurements.any?{
        |m| m.kind_of?(Metrics::ComplexMeasurement) && m.tag == "declarativeR" && m.measurements.any?{
          |mm| mm.kind_of?(Metrics::ValueMeasurement) && mm.tag == "A3_value" && mm.value.to_i > 0
        }
      }
    }
    
    levelB = Metrics::ComplexMeasurement.all_objects.select{ 
      |cm| cm.tag == "trigger" && cm.measurements.any?{
        |m| m.kind_of?(Metrics::ComplexMeasurement) && m.tag == "reflective" && m.measurements.any?{
          |mm| mm.kind_of?(Metrics::ValueMeasurement) && mm.tag == "B_value" && mm.value.to_i > 0
        }
      }
    }

    cmA = Metrics::ValueMeasurement.new(:name => "R/W Imperative", :tag => "total", :value => levelA11.size + levelA12.size)
    cmB = Metrics::ValueMeasurement.new(:name => "R/W Declarative", :tag => "total", :value => levelA2.size + levelA3.size)
    cmC  = Metrics::ValueMeasurement.new(:name => "Reflective", :tag => "total", :value => levelB.size)
    
    cmaux.measurements << cmA << cmB << cmC
    
    Obs.measurements << cmaux
  end
end  
end

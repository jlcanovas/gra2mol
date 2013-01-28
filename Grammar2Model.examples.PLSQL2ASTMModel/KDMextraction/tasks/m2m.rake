
model_mappings_definition do
  map 'http://modelum.es/modernization/gastm' => 'metamodels/astm.ecore#//gastm'
  map 'http://modelum.es/modernization/sastm' => 'metamodels/astm.ecore#//sastm'
end

model_to_model :astmTriggers2kdm0 do |t|
  t.sources :package   => 'astm',
            :metamodel => 'metamodels/astm.ecore',
            :model     => 'KDMextraction/models/resultadoTriggers.xmi'  

  t.targets :package   => 'kdm',
            :metamodel => '../Grammar2Model.KDM/model/kdm.ecore',
            :model     => 'KDMextraction/models/resultadoKDMTriggers.xmi'  

  t.parameters :create_segments => true
#t.debug_mode
  t.transformation 'KDMextraction/transformations/astmTriggers2kdm.rb'
end 

model_to_model :astmDDL2kdm0 do |t|
  t.sources :package   => 'astm',
            :metamodel => 'metamodels/astm.ecore',
            :model     => 'KDMextraction/models/resultadoDDL.xmi'  

  t.targets :package   => 'kdm',
            :metamodel => '../Grammar2Model.KDM/model/kdm.ecore',
            :model     => 'KDMextraction/models/resultadoKDMDDL.xmi'  
            
  t.parameters :create_segments => true
#t.debug_mode
  t.transformation 'KDMextraction/transformations/astmDDL2kdm.rb'
end      

model_to_model :astm2kdm do |t|
  t.sources :package   => 'astmTriggers',
            :metamodel => 'metamodels/astm.ecore',
            :model     => ['KDMextraction/models/resultadoTriggers.xmi'] 

  t.sources :package   => 'astmDDL',
            :metamodel => 'metamodels/astm.ecore',
            :model     => ['KDMextraction/models/resultadoDDL.xmi'] 

  t.targets :package   => 'kdm',
            :metamodel => '../Grammar2Model.KDM/model/kdm.ecore',
            :model     => 'KDMextraction/models/resultadoKDM.xmi'  
#t.debug_mode
  t.transformation 'KDMextraction/transformations/join.rb'
end       

model_to_model :metrics do |t|
  t.sources :package   => 'kdm',
            :metamodel => '../Grammar2Model.KDM/model/kdm.ecore',
            :model     => 'KDMextraction/models/resultadoKDM.xmi'  

  t.targets :package   => 'metrics',
            :metamodel => 'metamodels/metrics.ecore',
            :model     => 'KDMextraction/models/resultadoMetrics.xmi'  

  t.transformation 'KDMextraction/transformations/metrics.rb'
end  

model_to_code :metrics2report do |t|  
  t.sources :package   => 'metrics',
            :metamodel => 'metamodels/metrics.ecore',
            :model     => 'KDMextraction/models/resultadoMetrics.xmi'  

  t.codebase = 'KDMextraction/generation/' 
  t.generate  'KDMextraction/transformations/report.2code'
end
 
 
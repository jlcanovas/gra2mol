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


transformation 'astmDDL2kdm'
  
use_library 'KDMextraction/helpers/ddl_decorator_helper.rb'  
  
# Building Code Model for SQL Datatypes
SQLBooleanType = Kdm::Code::BooleanType.new
SQLStringType = Kdm::Code::StringType.new(:name => "sql varchar")  
SQLIntegerType = Kdm::Code::IntegerType.new(:name => "sql int") 
SQLDecimalType = Kdm::Code::DecimalType.new(:name => "sql decimal") 
SQLDateType = Kdm::Code::DateType.new(:name => "sql date") 
 
SQLLanguageUnit = Kdm::Code::LanguageUnit.new
SQLLanguageUnit.name = "SQL Datatypes"
SQLLanguageUnit.codeElement << SQLBooleanType 
SQLLanguageUnit.codeElement << SQLStringType
SQLLanguageUnit.codeElement << SQLIntegerType
SQLLanguageUnit.codeElement << SQLDecimalType
SQLLanguageUnit.codeElement << SQLDateType

SQLCodeModel = Kdm::Code::CodeModel.new
SQLCodeModel.name = "DDL Datatypes"
SQLCodeModel.codeElement << SQLLanguageUnit

##############################################################################################
# DATA MODEL
##############################################################################################

phase 'buildDataModel' do

  # Building dataModel
  DataModel = Kdm::Data::DataModel.new
  DataModel.name = "Relational Schema"
 
 
 rule 'mapRelationalSchema' do
  from Astm::Gastm::CompilationUnit
  to Kdm::Data::RelationalSchema
  mapping do | cu, rs |
    rs.dataElement = cu.fragments
    DataModel.dataElement = rs
  end
 end
 
 rule 'mapRelationalTable' do
  from Astm::Sastm::RDBTableDefinition
  to Kdm::Data::RelationalTable
  mapping do | td, rt |
    rt.name = td.identifierName.nameString
    rt.itemUnit = td.Column;
    rt.dataElement = td.PrimKey.map { |pk| pk.refersTo }
    rt.dataElement = td.Constraint
  end
 end
 
 rule 'mapItemUnit' do
  from Astm::Sastm::RDBColumnDefinition
  to Kdm::Code::ItemUnit
  mapping do | cd, iu |
    iu.name = cd.identifierName.nameString
    iu.type = cd.resolveType
  end
 end 
 
 ##################################
 # PRIMARY KEYS
 ##################################
 
 rule 'mapPrimaryKey' do
  from Astm::Sastm::RDBColumnDefinition
  to Kdm::Data::UniqueKey
  mapping do | cd, uk |
    uk.name = cd.identifierName.nameString
    uk.implementation = cd
  end
 end
 
 ##################################
 # UNIQUE KEYS
 ##################################
 
 rule 'mapUniqueKey' do
  from Astm::Sastm::RDBUniqueKey
  to Kdm::Data::UniqueKey
  mapping do | ruk, uk |
    uk.name = ruk.Column.map { |c| c.name.nameString }.join("-")
    uk.implementation = ruk.Column.map{ |c| c.refersTo } 
  end
 end
 
 ##################################
 # FOREIGN KEYS
 ##################################
 
 rule 'mapForeignKey' do
  from Astm::Sastm::RDBRefIntegrity
  to Kdm::Data::ReferenceKey
  mapping do | ri, rk |
    rk.implementation = ri.ParentKey.map{ |pk| pk.refersTo }
    rk.dataRelation = ri.ForeignKey
  end
 end
 
 rule 'mapKeyRelation' do
  from Astm::Sastm::RDBColumnReference
  to Kdm::Data::KeyRelation
  mapping do | cr, kr |
    kr.from = cr.__container__
    kr.to = cr.refersTo
  end

 end
 
end

##############################################################################################
# Creates a Segment (if the transformation is being executed alone)
##############################################################################################

phase 'createSegment' do
  
  refinement_rule 'createSegment' do
    from Astm::Gastm::CompilationUnit
    to Kdm::Data::RelationalSchema
    mapping do | cua, cuk | 
      Segment = Kdm::Kdm::Segment.new 
      Segment.model << SQLCodeModel
      Segment.model << DataModel
    end
  end
  
end

scheduling do
  execute 'buildDataModel'
  execute 'createSegment' if Parameters[:create_segments]
end

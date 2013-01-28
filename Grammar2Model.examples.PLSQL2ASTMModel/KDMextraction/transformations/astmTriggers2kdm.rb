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


transformation 'astmTriggers2kdm'
  
BooleanType = Kdm::Code::BooleanType.new  
StringType = Kdm::Code::StringType.new
  
use_library 'KDMextraction/helpers/triggers_decorator_helper.rb'  
  

# Building LanguageUnit
LanguageUnit = Kdm::Code::LanguageUnit.new
LanguageUnit.name = "Basic Datatypes"
LanguageUnit.codeElement << BooleanType 
LanguageUnit.codeElement << StringType

# Specific PL/SQL Code Model
PlsqlCodeModel = Kdm::Code::CodeModel.new
PlsqlCodeModel.name = "Triggers Datatypes"
PlsqlCodeModel.codeElement << LanguageUnit

# Found elements Code Model
AuxCodeModel = Kdm::Code::CodeModel.new
AuxCodeModel.name = "Non located elements"

##############################################################################################
# CODE MODEL
##############################################################################################

phase 'buildCodeModel' do
 
# Building main codemodel
CodeModel = Kdm::Code::CodeModel.new
CodeModel.name = "Triggers"

# Hashes
# Hash for indexing non-located function declaration elements
Functions = Hash.new
# Hash for indexing non-located variable declaration elements
Variables = Hash.new

rule 'mapCompilationUnit' do
  from Astm::Gastm::CompilationUnit
  to Kdm::Code::CompilationUnit
  mapping do | cua, cuk |
    cuk.codeElement = cua.fragments
    CodeModel.codeElement << cuk
  end
end

rule 'mapTrigger' do
  from Astm::Sastm::RDBTrigger
  to Kdm::Code::CallableUnit
  mapping do | t, cu |
    cu.name = t.identifierName.nameString
    cu.kind = Kdm::Code::CallableKind::Stored
    cu.codeElement = t.body
  end
end

################
# Statements
################

# TODO: StorableUnit type
rule 'mapVariableStatement' do
  from Astm::Gastm::DeclarationOrDefinitionStatement
  to Kdm::Action::ActionElement
  mapping do | dods, ae |
    # Storable Unit
    unit = Kdm::Code::StorableUnit.new
    unit.name = dods.declOrDefn.identifierName.nameString;
    Variables[unit.name.downcase] = unit
    #StorableUnit.type
    aw1 = Kdm::Action::Writes.new
    aw1.from = ae
    aw1.to = unit
    ae.kind = "declaration"
    ae.name = "variableDeclaration"
    ae.codeElement << unit
    ae.actionRelation << aw1
    #ae.codeElement = dods.declOrDefn.initialValue.extractActionElements
  end
end

rule 'mapExpressionStatement' do
  from Astm::Gastm::ExpressionStatement
  to Kdm::Action::ActionElement
  mapping do | est, ae |
    ae.kind = "expression"
    ae.name = "expression"
    ae.codeElement = est.expression
  end
end

rule 'mapIfStatement' do
  from Astm::Gastm::IfStatement
  to Kdm::Action::ActionElement
  mapping do | ist, ae |
    # Condition
    cond = Kdm::Action::ActionElement.new
    cond.name = "condition"
    cond.codeElement = ist.condition
    # True flow
    truef = Kdm::Action::TrueFlow.new
    trueAction = Kdm::Action::ActionElement.new
    trueAction.kind = "trueFlow"
    trueAction.name = "trueFlow"
    trueAction.codeElement = ist.thenBody
    truef.from = ae
    truef.to = trueAction
    # False Flow
    falsef = Kdm::Action::FalseFlow.new
    falseAction = Kdm::Action::ActionElement.new
    falseAction.kind = "falseFlow"
    falseAction.name = "falseFlow"
    falseAction.codeElement = ist.elseBody
    falsef.from = ae
    falsef.to = falseAction
    # ActionElement init
    ae.kind = "if"
    ae.name = "if"
    ae.actionRelation << falsef
    ae.actionRelation << truef
    ae.codeElement << cond
    ae.codeElement << falseAction
    ae.codeElement << trueAction
  end
end

rule 'mapReturnStatement' do
  from Astm::Gastm::ReturnStatement
  to Kdm::Action::ActionElement
  mapping do | rst, ae |
    ae.kind = "return"
    ae.name = "return"
    #ae.codeElement << rst.returnValue.extractActionElements
  end
end

# Skip rule?
rule 'mapBlockStatement' do
  from Astm::Gastm::BlockStatement
  to Kdm::Action::ActionElement
  mapping do | rst, ae |
    ae.kind = "block"
    ae.name = "block"
    ae.codeElement = rst.subStatements
  end
end

rule 'mapSelect' do
  from Astm::Sastm::RDBSelectStatement
  to Kdm::Action::ActionElement
  mapping do | rss, ae |
    ae.kind = "select"
    ae.name = "select"
    
    if (rss.IntoVariable != nil) then
      rss.IntoVariable.each do |intoVar| 
        Variables[intoVar.BaseVariable.name.nameString.downcase] ||=  Kdm::Code::StorableUnit.new(:name => intoVar.BaseVariable.name.nameString)  
        into = Kdm::Action::Writes.new
        into.from = ae
        into.to = Variables[intoVar.BaseVariable.name.nameString.downcase]
        ae.actionRelation << into
      end
    end
    
    if (rss.SelectExpression && rss.SelectExpression.Where != nil) then
      whereAction = Kdm::Action::ActionElement.new(:name => "selectWhere", :kind => "selectWhere")
      whereAction.codeElement = rss.SelectExpression.Where
      ae.codeElement << whereAction
    end
    
  end
end

rule 'mapInsert' do
  from Astm::Sastm::RDBInsertStatement
  to Kdm::Action::ActionElement
  mapping do | rss, ae |
    ae.kind = "insert"
    ae.name = "insert"
  end
end

rule 'mapUpdate' do
  from Astm::Sastm::RDBUpdateStatement
  to Kdm::Action::ActionElement
  mapping do | rss, ae |
    ae.kind = "update"
    ae.name = "update"
  end
end


################
# Expressions
################

rule 'mapLiteral' do
  from Astm::Gastm::Literal
  to Kdm::Action::ActionElement
  mapping do | l, ae |
    ae.name = "Literal"
    ae.kind = "Literal"
  end
end

rule 'mapCastExpression' do
  from Astm::Gastm::CastExpression
  to Kdm::Action::ActionElement
  mapping do | ce, ae |
    ae.name = "CastExpression"
    ae.kind = "CastExpression"
  end
end

rule 'mapAggregateExpression' do
  from Astm::Gastm::AggregateExpression
  to Kdm::Action::ActionElement
  mapping do | agg, ae |
    ae.name = "AggregateExpression"
    ae.kind = "AggregateExpression"
  end
end

rule 'mapUnaryExpression' do
  from Astm::Gastm::UnaryExpression
  to Kdm::Action::ActionElement
  mapping do | ue, ae |
    ae.name = "UnaryExpression"
    ae.kind = "UnaryExpression"
  end
end

rule 'mapAssignment' do
  from Astm::Gastm::BinaryExpression
  to Kdm::Action::ActionElement
  filter do | be |
    be.operator.kind_of?(Astm::Gastm::OperatorAssign)
  end
  mapping do | be, ae |
    ae.name = "assign"
    ae.kind = "assign"
    
    left = Kdm::Action::Writes.new(:from => ae)
    right = Kdm::Action::Reads.new(:from => ae)
    
    if(be.leftOperand && be.leftOperand.kind_of?(Astm::Gastm::IdentifierReference)) then
      Variables[be.leftOperand.name.nameString.downcase] ||= Kdm::Code::StorableUnit.new(:name => be.leftOperand.name.nameString)
      left.to = Variables[be.leftOperand.name.nameString.downcase]
    end
    
    # Right operand
    if (be.rightOperand && be.rightOperand.kind_of?(Astm::Gastm::StringLiteral)) then
      value = Kdm::Code::Value.new(:name => be.rightOperand.value)
      ae.codeElement << value
      right.to = value
    else  
      aux = Kdm::Code::StorableUnit.new(:name => "auxRight")
      ae.codeElement << aux
      
      rightAction = Kdm::Action::ActionElement.new(:name => "rightAction", :kind => "rightAction")
      rightAction.codeElement = be.rightOperand
      rightAction.actionRelation = Kdm::Action::Writes.new(:from => rightAction, :to => aux)
      ae.codeElement << rightAction
      right.to = aux
    end
    
    ae.actionRelation << left
    ae.actionRelation << right
  end
end

rule 'mapBinaryExpression' do
  from Astm::Gastm::BinaryExpression
  to Kdm::Action::ActionElement
  filter do | be |
    !be.operator.kind_of?(Astm::Gastm::OperatorAssign)
  end
  mapping do | be, ae |
    ae.name = "BinaryExpression"
    ae.kind = "BinaryExpression"
    # left operand
    left = Kdm::Action::Reads.new
    left.from = ae
    
    if (be.leftOperand && be.leftOperand.kind_of?(Astm::Gastm::StringLiteral)) then
      value = Kdm::Code::Value.new(:name => be.leftOperand.value)
      left.to = value
    else  
      aux = Kdm::Code::StorableUnit.new(:name => "auxLeft")
      ae.codeElement << aux
      
      leftAction = Kdm::Action::ActionElement.new(:name => "leftAction", :kind => "leftAction")
      leftAction.codeElement = be.leftOperand
      leftAction.actionRelation = Kdm::Action::Writes.new(:from => leftAction, :to => aux)
      ae.codeElement << leftAction
      left.to = aux
    end
        
    # right operand
    right = Kdm::Action::Reads.new
    right.from = ae
    
    if (be.rightOperand && be.rightOperand.kind_of?(Astm::Gastm::StringLiteral)) then
      value = Kdm::Code::Value.new(:name => be.rightOperand.value)
      ae.codeElement << value
      right.to = value
    else  
      aux = Kdm::Code::StorableUnit.new(:name => "auxRight")
      ae.codeElement << aux
      
      rightAction = Kdm::Action::ActionElement.new(:name => "rightAction", :kind => "rightAction")
      rightAction.codeElement = be.rightOperand
      rightAction.actionRelation = Kdm::Action::Writes.new(:from => rightAction, :to => aux)
      ae.codeElement << rightAction
      right.to = aux
    end
        
    ae.actionRelation << left
    ae.actionRelation << right
  end
end

rule 'mapConditionalExpression' do
  from Astm::Gastm::ConditionalExpression
  to Kdm::Action::ActionElement
  mapping do | ce, ae |
    ae.name = "ConditionalExpression"
    ae.kind = "ConditionalExpression"
  end
end

rule 'mapRangeExpression' do
  from Astm::Gastm::RangeExpression
  to Kdm::Action::ActionElement
  mapping do | re, ae |
    ae.name = "Range Expression"
    ae.kind = "Range Expression"
  end
end

rule 'mapFunctionCallExpression' do
  from Astm::Gastm::FunctionCallExpression
  to Kdm::Action::ActionElement
  mapping do | fce, ae |
    call = fce.calledFunction
    
    ae.name = "FunctionCall"
    
    Functions[call.name] ||=  Kdm::Code::MethodUnit.new(:name => call.name.nameString)
    ae.actionRelation = Kdm::Action::Calls.new(:from => ae,:to => Functions[call.name])
    
    fce.actualParams.each do |param| 
      if (param.value && param.value.kind_of?(Astm::Gastm::StringLiteral)) then
        dataElement = Kdm::Code::Value.new(:name => param.value)
        readElement = Kdm::Action::Reads.new(:from => ae, :to => dataElement)
        
        ae.codeElement = dataElement
        ae.actionRelation = readElement
      elsif (param.value && param.value.kind_of?(Astm::Gastm::IdentifierReference)) then
        Variables[param.value.name.nameString.downcase] ||=  Kdm::Code::StorableUnit.new(:name => param.value.name.nameString)  
        readElement = Kdm::Action::Reads.new(:from => ae, :to => Variables[param.value.name.nameString.downcase])
        
        ae.actionRelation = readElement
      elsif (param.value && param.value.kind_of?(Astm::Gastm::FunctionCallExpression)) then
        dataElement = Kdm::Code::StorableUnit.new(:name => "auxFunc")

        funcAction = Kdm::Action::ActionElement.new(:name => "funcAction", :kind => "funcAction")
        funcAction.codeElement = param.value
        funcAction.actionRelation = Kdm::Action::Writes.new(:from => funcAction, :to => dataElement)
        ae.codeElement << funcAction
        
        readElement = Kdm::Action::Reads.new
        readElement.from = ae
        readElement.to = dataElement
        
        ae.codeElement = dataElement
        ae.actionRelation = readElement
      end
    end
  end
end

rule 'mapNewExpression' do
  from Astm::Gastm::NewExpression
  to Kdm::Action::ActionElement
  mapping do | ne, ae |
    ae.name = "New Expression"
    ae.kind = "New Expression"
  end
end

rule 'mapNameReference' do
  from Astm::Gastm::NameReference
  to Kdm::Action::ActionElement
  mapping do | nr, ae |
    ae.name = "NameReference"
    ae.kind = "NameReference"
    Variables[nr.name.nameString.downcase] ||=  Kdm::Code::StorableUnit.new(:name => nr.name.nameString)  
    readElement = Kdm::Action::Reads.new(:from => ae, :to => Variables[nr.name.nameString.downcase])
        
    ae.actionRelation = readElement
  end
end

rule 'mapLabelAccess' do
  from Astm::Gastm::LabelAccess
  to Kdm::Action::ActionElement
  mapping do | la, ae |
    ae.name = "LabelAccess"
    ae.kind = "LabelAccess"
  end
end

rule 'mapArrayAccess' do
  from Astm::Gastm::ArrayAccess
  to Kdm::Action::ActionElement
  mapping do | arr, ae |
    ae.name = "ArrayAccess"
    ae.kind = "ArrayAccess"
  end
end

rule 'mapAnnotationExpression' do
  from Astm::Gastm::AnnotationExpression
  to Kdm::Action::ActionElement
  mapping do | ann, ae |
    ae.name = "AnnotationExpression"
    ae.kind = "AnnotationExpression"
  end
end
end

##############################################################################################
# INVENTORY MODEL
##############################################################################################

phase 'buildInventoryModel' do
# Creates a project elemento for representing the Java source code
Project = Kdm::Source::Project.new
Project.name = "StrutsApplication"
# Creates a Directory element for grouping the java source code
DirectorySrc = Kdm::Source::Directory.new
DirectorySrc.name = "src"
DirectorySrc.path = "/"
Project.inventoryElement << DirectorySrc
# Creates the main inventoryModel
InventoryModel = Kdm::Source::InventoryModel.new
InventoryModel.inventoryElement << Project

# This rule creates a Source File element for each AggregateTypeDefinition
# It is necessary to find out the properties of the SourceFile element
rule 'createSourceFile' do
  from Astm::Gastm::AggregateTypeDefinition
  to Kdm::Source::SourceFile
  mapping do | atd, sf |
    sf.name = atd.name.nameString 
    DirectorySrc.inventoryElement = sf
  end
end
end


##############################################################################################
# Filling Aux Model
##############################################################################################

phase 'fillAuxModel' do
  
  refinement_rule 'fillAuxModel' do
    from Astm::Gastm::CompilationUnit
    to Kdm::Code::CompilationUnit
    mapping do | cua, cuk | 
      AuxCodeModel.codeElement = Functions.values
      AuxCodeModel.codeElement = Variables.values
    end
  end
  
end

##############################################################################################
# Creates a Segment (if the transformation is being executed alone)
##############################################################################################

phase 'createSegment' do
  
  refinement_rule 'createSegment' do
    from Astm::Gastm::CompilationUnit
    to Kdm::Code::CompilationUnit
    mapping do | cua, cuk | 
      Segment = Kdm::Kdm::Segment.new 
      Segment.model << AuxCodeModel
      Segment.model << CodeModel
      Segment.model << PlsqlCodeModel
      Segment.model << InventoryModel
    end
  end
  
end

scheduling do
  execute 'buildCodeModel'
  execute 'buildInventoryModel'
  execute 'fillAuxModel'
  execute 'createSegment' if Parameters[:create_segments]
end

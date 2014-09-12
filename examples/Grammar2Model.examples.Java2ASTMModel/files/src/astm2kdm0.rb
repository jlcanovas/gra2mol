transformation 'astm2kdm'
  
# Building main Segment
Segment = Kdm::Kdm::Segment.new 

# Building LanguageUnit
LanguageUnit = Kdm::Code::LanguageUnit.new
LanguageUnit.name = "Java Datatypes"
LanguageUnit.codeElement << (BooleanType = Kdm::Code::BooleanType.new)
LanguageUnit.codeElement << (StringType = Kdm::Code::StringType.new)

# Specific Struts Code Model
StrutsCodeModel = Kdm::Code::CodeModel.new
StrutsCodeModel.name = "Platform Code Model (Struts)"
StrutsCodeModel.codeElement << LanguageUnit

# Adds HttpServletRequest class
CuHttpServletRequest = Kdm::Code::CompilationUnit.new
StrutsCodeModel.codeElement << CuHttpServletRequest

ClassHttpServletRequest = Kdm::Code::ClassUnit.new
ClassHttpServletRequest.name = "HttpServletRequest"
CuHttpServletRequest.codeElement << ClassHttpServletRequest

MethodHttpServletRequest = Kdm::Code::MethodUnit.new
MethodHttpServletRequest.name = "getSession"
ClassHttpServletRequest.codeElement << MethodHttpServletRequest

# Adds HttpSession class
CuHttpSession = Kdm::Code::CompilationUnit.new
StrutsCodeModel.codeElement << CuHttpSession

ClassHttpSession = Kdm::Code::ClassUnit.new
ClassHttpSession.name = "HttpSession"
CuHttpSession.codeElement << ClassHttpSession

Method1HttpSession = Kdm::Code::MethodUnit.new
Method1HttpSession.name = "setAttribute"
ClassHttpSession.codeElement << Method1HttpSession

Method2HttpSession = Kdm::Code::MethodUnit.new
Method2HttpSession.name = "getAttribute"
ClassHttpSession.codeElement << Method2HttpSession

# Adds ActionForward class
CuActionForward = Kdm::Code::CompilationUnit.new
StrutsCodeModel.codeElement << CuActionForward

ClassActionForward = Kdm::Code::ClassUnit.new
ClassActionForward.name = "ActionForward"
CuActionForward.codeElement << ClassActionForward

Segment.model << StrutsCodeModel

decorator Astm::NamedTypeReference do
  def resolveType
    case name.nameString
      when "boolean" then return BooleanType
      when "string" then return StringType
      when "ActionForward" then return ClassActionForward
      else puts "resolveType Decorator: " + name.nameString
    end
  end
end  

decorator Astm::UnnamedTypeReference do
  def resolveType
  end
end  

decorator Astm::Expression do
  def extractActionElements 
    puts "AbstractClass: " + self.metaclass.name
    return []
    # Works with castExpression, assignments, etc...
  end
end

decorator Astm::CastExpression do
  def extractActionElements
    action = Kdm::Action::ActionElement.new
    action.name = "CastExpression"
    # tururu
    #action.codeElement << self.expression.extractActionElements
    return [ action ]
  end 
end

decorator Astm::IdentifierReference do
  def extractActionElements
    if ((var = Variables[self.name.nameString]) != nil) 
      ar = Kdm::Action::Reads.new
      # tururu
      #ar.from = action
      ar.to = var
      return [ ar ]
    end
  end
end

decorator Astm::FunctionCallExpression do
  def extractActionElements
    receptor = self.expressionType.name.nameString
    call = self.calledFunction
    puts "FunctionCallExpression " + receptor
    
    action = Kdm::Action::ActionElement.new
    action.name = "FunctionCall"
    if ((var = Variables[receptor]) != nil) 
      ar = Kdm::Action::Reads.new
      ar.from = action
      ar.to = var
      action.codeElement << ar
    end
    
    if (self.calledFunction.expressionType != nil and self.calledFunction.expressionType.name.nameString = "getSession")
      ac = Kdm::Action::Calls.new
      ac.from = action
      ac.to = MethodHttpServletRequest
      action.codeElement << ac
    end
    
    if (self.calledFunction.calledFunction != nil and self.calledFunction.calledFunction.expressionType != nil and self.calledFunction.calledFunction.expressionType.name.nameString = "setAttribute")
      ac = Kdm::Action::Calls.new
      ac.from = action
      ac.to = Method1HttpSession
      action.codeElement << ac
    end
    
    return [ action ]
    
  end
end

decorator Astm::BinaryExpression do
  def extractActionElements
    a2 = Kdm::Action::ActionElement.new
    a2.name = "BinaryExpression"
    return [ a2 ]
  end 
end

##############################################################################################
# CODE MODEL
##############################################################################################

phase 'buildCodeModel' do
 
# Building main codemodel
CodeModel = Kdm::Code::CodeModel.new
CodeModel.name = "CodeModel"
# Adds the codeModel element to the Segment
Segment.model << CodeModel

# Hashes
# Hash for indexing variable declaration elements
Variables = Hash.new

# TODO: Class inheritance.
rule 'mapClassUnit' do
  from Astm::AggregateTypeDefinition
  to Kdm::Code::CompilationUnit
  mapping do | agt, cu |
    myClassUnit = Kdm::Code::ClassUnit.new
    myClassUnit.name = agt.name.nameString
    myClassUnit.codeElement = agt.aggregateType.members     
    cu.codeElement = myClassUnit
    CodeModel.codeElement << cu
    
    # Hash for indexing variable declaration elements
    Variables = Hash.new
    
  end
end

rule 'mapMethod' do
  from Astm::DefinitionObject
  to Kdm::Code::MethodUnit
  filter do | dobj |  
    dobj.kind_of?(Astm::FunctionDefinition)
  end
  mapping do | dobj, mu |
    mu.name = dobj.identifierName.nameString
    
    # Builds the signature
    signature = Kdm::Code::Signature.new
    signature.parameterUnit = dobj.formalParameters
    # Builds the return parameter
    if dobj.returnType != nil
      returnParameter = Kdm::Code::ParameterUnit.new
      returnParameter.kind = Kdm::Code::ParameterKind::Return
      returnParameter.type = dobj.returnType.resolveType
      signature.parameterUnit << returnParameter
    end 
    mu.codeElement << signature
    # Building entryFlow
    entryFlow = Kdm::Action::EntryFlow.new
    entryFlow.to = dobj.body.first
    entryFlow.from = mu
    mu.codeElement << entryFlow
    # Building Action elements from methodStatements
    mu.codeElement = dobj.body
    
  end
end

rule 'mapNotMethod' do
  from Astm::DefinitionObject
  to Kdm::Code::MethodUnit
  filter do | dobj |  
    !dobj.kind_of?(Astm::FunctionDefinition)  && !dobj.kind_of?(Astm::VariableDefinition) 
  end
  mapping do | dobj, mu |
  end
end

# TODO Instance variable initialization 
rule 'mapInstanceVariable' do
  from Astm::DefinitionObject
  to Kdm::Code::StorableUnit
  filter do | dobj |  
    dobj.kind_of?(Astm::VariableDefinition) 
  end
  mapping do | dobj, su | 
    su.name = dobj.identifierName.nameString
  end
end

rule 'mapSignature' do
  from Astm::FormalParameterDefinition
  to Kdm::Code::ParameterUnit
  mapping do | fpd, pu |
    pu.name = fpd.identifierName.nameString
    #pu.type =
    pu.kind = Kdm::Code::ParameterKind::ByValue
    Variables[pu.name] = pu
  end
end

################
# Statements
################

# TODO: StorableUnit type
rule 'mapVariableStatement' do
  from Astm::DeclarationOrDefinitionStatement
  to Kdm::Action::ActionElement
  mapping do | dods, ae |
    # Storable Unit
    unit = Kdm::Code::StorableUnit.new
    unit.name = dods.declOrDefn.identifierName.nameString;
    Variables[unit.name] = unit
    #StorableUnit.type
    aw1 = Kdm::Action::Writes.new
    aw1.from = ae
    aw1.to = unit
    ae.kind = "declaration"
    ae.name = "variableDeclaration"
    ae.codeElement << unit
    ae.codeElement << aw1
    ae.codeElement = dods.declOrDefn.initialValue.extractActionElements
  end
end

rule 'mapExpressionStatement' do
  from Astm::ExpressionStatement
  to Kdm::Action::ActionElement
  mapping do | est, ae |
    ae.kind = "expression"
    ae.name = "expression"
    #ae.codeElement = est.expression.map{ |exp| exp.extractActionElements}.flatten
    ae.codeElement = est.expression.extractActionElements
  end
end

rule 'mapIfStatement' do
  from Astm::IfStatement
  to Kdm::Action::ActionElement
  mapping do | ist, ae |
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
    ae.codeElement << falsef
    ae.codeElement << falseAction
    ae.codeElement << truef
    ae.codeElement << trueAction
  end
end

rule 'mapReturnStatement' do
  from Astm::ReturnStatement
  to Kdm::Action::ActionElement
  mapping do | rst, ae |
    ae.kind = "return"
    ae.name = "return"
    #ae.codeElement << rst.returnValue.extractActionElements
  end
end

# Skip rule?
rule 'mapBlockStatement' do
  from Astm::BlockStatement
  to Kdm::Action::ActionElement
  mapping do | rst, ae |
    ae.kind = "block"
    ae.codeElement = rst.subStatements
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
Segment.model << InventoryModel

# This rule creates a Source File element for each AggregateTypeDefinition
# It is necessary to find out the properties of the SourceFile element
rule 'createSourceFile' do
  from Astm::AggregateTypeDefinition
  to Kdm::Source::SourceFile
  mapping do | atd, sf |
    sf.name = atd.name.nameString 
    DirectorySrc.inventoryElement = sf
  end
end

end
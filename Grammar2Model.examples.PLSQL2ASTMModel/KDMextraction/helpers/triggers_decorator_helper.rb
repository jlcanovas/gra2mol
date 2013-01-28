
# GENERAL DECORATORS

decorator Astm::Gastm::NamedTypeReference do
  def resolveType
    case name.nameString
      when "boolean" then return BooleanType
      when "string" then return StringType
      when "ActionForward" then return ClassActionForward
      else puts "resolveType Decorator: " + name.nameString
    end
  end
end  

decorator Astm::Gastm::UnnamedTypeReference do
  def resolveType
  end
end  

decorator Astm::Gastm::Expression do
  def extractActionElements 
    puts "AbstractClass: " + self.metaclass.name
    return []
    # Works with castExpression, assignments, etc...
  end
end

decorator Astm::Gastm::CastExpression do
  def extractActionElements
    action = Kdm::Action::ActionElement.new
    action.name = "CastExpression"
    # tururu
    #action.codeElement << self.expression.extractActionElements
    return [ action ]
  end 
end

decorator Astm::Gastm::IdentifierReference do
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

decorator Astm::Gastm::FunctionCallExpression do
  def extractActionElements
    call = self.calledFunction
    
    action = Kdm::Action::ActionElement.new
    action.name = "FunctionCall"
    
    Functions[call.name] ||=  Kdm::Code::MethodUnit.new(:name => call.name.nameString)
    action.actionRelation = Kdm::Action::Calls.new(:from => action,:to => Functions[call.name])
    
    self.actualParams.each do |param| 
      dataElement = Kdm::Code::Value.new
      if (param.kind_of?(Astm::Gastm::StringLiteral)) then
        dataElement.name = param.value
      end
      readElement = Kdm::Action::Reads.new
      readElement.from = action
      readElement.to = dataElement
      action.actionRelation = readElement
      action.codeElement = dataElement
    end
 
    return [ action ]
    
  end
end

decorator Astm::Gastm::BinaryExpression do
  def extractActionElements
    a2 = Kdm::Action::ActionElement.new
    a2.name = "BinaryExpression"
    return [ a2 ]
  end 
end

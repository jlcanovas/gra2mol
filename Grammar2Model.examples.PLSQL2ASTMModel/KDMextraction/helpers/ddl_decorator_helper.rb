
SQLTypes = Hash.new

decorator Astm::Sastm::RDBColumnDefinition do
  def resolveType
    if (self.get('type') && self.get('type').kind_of?(Astm::Sastm::RDBNumber)) then 
      return SQLIntegerType
    end
    if (self.get('type') && self.get('type').kind_of?(Astm::Sastm::RDBVarchar)) then
      return SQLStringType
    end
    if (self.get('type') && self.get('type').kind_of?(Astm::Sastm::RDBDate)) then
      return SQLDateType
    end
  end
end
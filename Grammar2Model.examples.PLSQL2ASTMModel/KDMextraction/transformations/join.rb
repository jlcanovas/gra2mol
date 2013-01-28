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


import 'KDMextraction/transformations/astmDDL2kdm.rb', :as => 'DDL' do
  map 'Astm' => AstmDDL
  map 'Kdm'  => Kdm
end
import 'KDMextraction/transformations/astmTriggers2kdm.rb', :as => 'Triggers'  do
  map 'Astm' => AstmTriggers
  map 'Kdm'  => Kdm
end

phase 'joinPhase' do
 refinement_rule 'mapCompilationUnit' do
  from AstmDDL::Gastm::CompilationUnit
  to Kdm::Data::RelationalSchema
  mapping do | cua, cuk |
    Segment = Kdm::Kdm::Segment.new 
  
    Segment.model = Kdm::Code::CodeModel.all_objects
    Segment.model = Kdm::Data::DataModel.all_objects
    Segment.model = Kdm::Source::InventoryModel.all_objects
  end
 end
end

scheduling do
  execute 'DDL'
  execute 'Triggers'
  execute 'joinPhase'
end
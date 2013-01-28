model_to_model :astm2kdm0 do |t|
  t.sources :package   => 'astm',
            :metamodel => 'files/metamodels/astm.ecore',
            :model     => 'resultado.ecore'  

  t.targets :package   => 'kdm',
            :metamodel => 'files/metamodels/kdm.ecore',
            :model     => 'resultadoKDM0.ecore'  
#t.debug_mode
  t.transformation 'files/src/astm2kdm0.rb'
end     

model_to_model :kdm02kdm1 do |t|
  t.sources :package   => 'kdm',
            :metamodel => 'files/metamodels/kdm.ecore',
            :model     => 'resultadoKDM0.ecore'  

  t.targets :package   => 'kdm2',
            :metamodel => 'files/metamodels/kdm.ecore',
            :model     => 'resultadoKDM1.ecore'  
#t.debug_mode
  t.transformation 'files/src/kdm02kdm1.rb'
end     
JSON INJECTOR

The Gra2Mol transformation definition receives as inputs:
- files/src/json.g: JSON grammar
- files/metamodels/Ecore.ecore: Ecore metamodel
- files/src/metamodelInjector.g2m: Gra2MoL transformation definition
- files/src/*.json: JSON definitions.

It is important to note that the transformation definition performs the 
injection process for a pair of JSON definition (the accessorSpecs and 
settinSpecs) so the process must be launch for each pair.

The transformation process also uses some extensions for including new 
operators which are particular for this problem. They are located in 
files/extensions 

To launch the Gra2MoL transformation process you have to execute the 
target "build" included in the "build.xml" ANT file. 

As a result of the transformation, the following files will be generated:
- CSTModel.ecore: Concrete syntax tree model of the input files. This 
  model conforms to the metamodel "CST.ecore" located in files/metamodels
- gra2molModel.ecore: Abstract syntax model for the Gra2MoL transformation 
  applied. This model conforms to the metamodel "Gra2MoL.ecore" located 
  in files/metamodels
- log.txt: Log file containing the main traces of the transformation 
  execution
- resultModel.ecore: Injected model from JSON definitions. This model 
  conforms to the Ecore metamodel.

If you have any problem, contact me at javier.canovas@inria.fr
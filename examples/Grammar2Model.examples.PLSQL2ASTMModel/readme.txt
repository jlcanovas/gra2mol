This projects is organized as follows:
- ASTMextraction directory contains the resources to apply the Gra2MoL transformation 
for extracting ASTM models from PL/SQL source code. The build xml files are in charge 
of executing the Gra2MoL transformations
- KDMextraction directory contains the resources to obtain the KDM models and to 
generate the metric models. It contains a rake file (m2m.rake) which declares several tasks
to execute the m2m and m2c transformations.
- metamodels directory contains the metamodels used in this example
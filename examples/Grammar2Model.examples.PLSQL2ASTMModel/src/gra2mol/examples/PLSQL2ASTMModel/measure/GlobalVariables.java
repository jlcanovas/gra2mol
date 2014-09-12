package gra2mol.examples.PLSQL2ASTMModel.measure;

import kdm.action.ActionElement;
import kdm.code.AbstractCodeElement;
import kdm.code.CodeModel;
import kdm.code.CompilationUnit;
import kdm.code.ControlElement;
import kdm.code.StorableUnit;
import kdm.kdm.KDMModel;
import kdm.kdm.Segment;

public class GlobalVariables extends Measure {

	public GlobalVariables(Segment kdmSegment) {
		super(kdmSegment);
		this.name = "Use of global and system variables";
		this.description = "Counts the uses of global and system variables";
	}

	@Override
	protected Measurement especificExecute() {
		int globalCounter = 0;
		int systemCounter = 0;
		String error = "";

		for(KDMModel model : kdmSegment.getModel()) {
			if (model instanceof CodeModel) {
				CodeModel codeModel = (CodeModel) model;
				for(AbstractCodeElement abstractCodeElement : codeModel.getCodeElement()) {
					if (abstractCodeElement instanceof CompilationUnit) {
						CompilationUnit compilationUnit = (CompilationUnit) abstractCodeElement;
						for(AbstractCodeElement abstractCodeElement2 : compilationUnit.getCodeElement()) {
							if (abstractCodeElement2 instanceof StorableUnit) {
								if(abstractCodeElement2.getName().toLowerCase().startsWith(":system")) systemCounter++;
								if(abstractCodeElement2.getName().toLowerCase().startsWith(":global")) globalCounter++;
							} else if (abstractCodeElement2 instanceof ControlElement) {
								ControlElement controlElement = (ControlElement) abstractCodeElement2;
								for (AbstractCodeElement abstractCodeElement3 : controlElement.getCodeElement()) {
									if (abstractCodeElement3 instanceof StorableUnit) {
										if(abstractCodeElement3.getName().toLowerCase().startsWith(":system")) systemCounter++;
										if(abstractCodeElement3.getName().toLowerCase().startsWith(":global")) globalCounter++;
									}
								}
							}
						}						
					} else if (abstractCodeElement instanceof StorableUnit) {
						if(abstractCodeElement.getName().toLowerCase().startsWith(":system")) systemCounter++;
						if(abstractCodeElement.getName().toLowerCase().startsWith(":global")) globalCounter++;
					}
				}
			}
		}

		Object[] result = new Integer[2];
		result[0] = new Integer(systemCounter);
		result[1] = new Integer(globalCounter);

		String[] tags = new String[2];
		tags[0] = "num_system";
		tags[1] = "num_global";

		if (error.equals("")) error = null;

		return new Measurement(result, tags, error);
	}


}

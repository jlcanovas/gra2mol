package gra2mol.examples.PLSQL2ASTMModel.measure;

import kdm.action.AbstractActionRelationship;
import kdm.action.ActionElement;
import kdm.action.Reads;
import kdm.action.Writes;
import kdm.code.AbstractCodeElement;
import kdm.code.CodeModel;
import kdm.code.CompilationUnit;
import kdm.code.ControlElement;
import kdm.code.DataElement;
import kdm.code.StorableUnit;
import kdm.kdm.KDMModel;
import kdm.kdm.Segment;

public class LocateGlobalVariables extends Measure {

	public LocateGlobalVariables(Segment kdmSegment) {
		super(kdmSegment);
		this.name = "Where the global and system variables are used";
		this.description = "Locate the triggers (only triggers) which read(R) or write (W) global and system variables";
	}

	@Override
	protected Measurement especificExecute() {
		String globalCounter = "";
		String systemCounter = "";
		String error = "";

		for(KDMModel model : kdmSegment.getModel()) {
			if (model instanceof CodeModel) {
				CodeModel codeModel = (CodeModel) model;
				for(AbstractCodeElement abstractCodeElement : codeModel.getCodeElement()) {
					if (abstractCodeElement instanceof CompilationUnit) {
						CompilationUnit compilationUnit = (CompilationUnit) abstractCodeElement;
						for(AbstractCodeElement abstractCodeElement2 : compilationUnit.getCodeElement()) {
							if (abstractCodeElement2 instanceof ControlElement) {
								ControlElement controlElement = (ControlElement) abstractCodeElement2;
								for (AbstractCodeElement abstractCodeElement3 : controlElement.getCodeElement()) {
									if (abstractCodeElement3 instanceof ActionElement) {
										ActionElement ae = (ActionElement) abstractCodeElement3;
										systemCounter += countVariable(controlElement.getName(), ":system", ae);
										globalCounter += countVariable(controlElement.getName(), ":global", ae);
									}
								}
							}
						}						
					} 
				}
			}
		}

		Object[] result = new String[2];
		result[0] = new String(systemCounter);
		result[1] = new String(globalCounter);

		String[] tags = new String[2];
		tags[0] = "loc_system";
		tags[1] = "loc_global";

		if (error.equals("")) error = null;

		return new Measurement(result, tags, error);
	}
	
	private String countVariable(String triggerName, String kind, ActionElement ae) {
		String result = "";
				
		for (AbstractActionRelationship abstractActionRelation : ae.getActionRelation()) {
			if (abstractActionRelation instanceof Reads) {
				Reads reads = (Reads) abstractActionRelation;
				DataElement dataElement = reads.getTo();
				if(dataElement.getName().toLowerCase().startsWith(kind)) result += triggerName + "(R->" + dataElement.getName() + ")" + " ";
			}
			if (abstractActionRelation instanceof Writes) {
				Writes reads = (Writes) abstractActionRelation;
				DataElement dataElement = reads.getTo();
				if(dataElement.getName().toLowerCase().startsWith(kind)) result += triggerName + "(W->" + dataElement.getName() + ")" + " ";
			}
		}
		
		if(ae.getCodeElement() != null) {
			for(AbstractCodeElement abstractCodeElement : ae.getCodeElement()) {
				if (abstractCodeElement instanceof ActionElement) {
					ActionElement ae2 = (ActionElement) abstractCodeElement;
					result += countVariable(triggerName, kind, ae2);
				}
			}
		}
		
		return result;
	}


}

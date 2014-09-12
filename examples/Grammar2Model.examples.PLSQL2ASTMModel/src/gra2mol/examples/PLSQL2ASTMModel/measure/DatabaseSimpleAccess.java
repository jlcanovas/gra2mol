package gra2mol.examples.PLSQL2ASTMModel.measure;

import kdm.action.ActionElement;
import kdm.code.AbstractCodeElement;
import kdm.code.CodeModel;
import kdm.code.CompilationUnit;
import kdm.code.ControlElement;
import kdm.kdm.KDMModel;
import kdm.kdm.Segment;

public class DatabaseSimpleAccess extends Measure {

	public DatabaseSimpleAccess(Segment kdmSegment) {
		super(kdmSegment);
		this.name = "Simple access to databse";
		this.description = "Counts the access to the database (select, insert, update)";
	}

	@Override
	protected Measurement especificExecute() {
		int numSelects = 0;
		int numInserts = 0;
		int numUpdates = 0;
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
										numSelects += countStatement("select", ae);
										numInserts += countStatement("insert", ae);
										numUpdates += countStatement("update", ae);
									}
								}
							}
						}						
					}
				}
			}
		}
		
		Object[] finalResult = new Integer[3];
		finalResult[0] = new Integer(numSelects);
		finalResult[1] = new Integer(numInserts);
		finalResult[2] = new Integer(numUpdates);
		
		String[] tags = new String[3];
		tags[0] = "selects";
		tags[1] = "inserts";
		tags[2] = "updates";
		
		if(error.equals("")) error = null;
		
		return new Measurement(finalResult, tags, error);
	}
	
	private int countStatement(String kind, ActionElement ae) {
		int result = 0;
		
		if(ae.getKind() != null && ae.getKind().equals(kind)) result++;
		
		if(ae.getCodeElement() != null) {
			for(AbstractCodeElement abstractCodeElement : ae.getCodeElement()) {
				if (abstractCodeElement instanceof ActionElement) {
					ActionElement ae2 = (ActionElement) abstractCodeElement;
					result += countStatement(kind, ae2);
				}
			}
		}
		
		return result;
	}

}

package gra2mol.examples.PLSQL2ASTMModel.measure;

import kdm.code.DataElement;
import kdm.data.AbstractDataElement;
import kdm.data.DataModel;
import kdm.data.RelationalSchema;
import kdm.data.RelationalTable;
import kdm.data.UniqueKey;
import kdm.kdm.KDMModel;
import kdm.kdm.Segment;


public class CheckPrimaryKeys extends Measure {

	public CheckPrimaryKeys(Segment kdmSegment) {
		super(kdmSegment);
		this.name = "Check Primary Keys";
		this.description = "Checks if each table has a primary key";
	}

	protected Measurement especificExecute() {		
		Boolean result = Boolean.FALSE;
		String error = "";
		
		for(KDMModel model : kdmSegment.getModel()) {
			if (model instanceof DataModel) {
				DataModel dataModel = (DataModel) model;
				for(AbstractDataElement abstractDataElement : dataModel.getDataElement()) {
					if (abstractDataElement instanceof RelationalSchema) {
						RelationalSchema relationalSchema = (RelationalSchema) abstractDataElement;
						for(AbstractDataElement abstractDataElement2 : relationalSchema.getDataElement()) {
							if (abstractDataElement2 instanceof RelationalTable) {
								RelationalTable relationalTable = (RelationalTable) abstractDataElement2;
								boolean partialResult = false;
								for(AbstractDataElement abstractDataElement3 : relationalTable.getDataElement()) {
									if (abstractDataElement3 instanceof UniqueKey) {
										partialResult = true;										
									}
								}
								if (partialResult == false)
									error += relationalTable.getName();								
							}
						}						
					}
				}
			}
		}
		
		if (error.equals("")) {
			result = Boolean.TRUE;
			error = null;
		}
		
		Object[] finalResult = new Boolean[1];
		finalResult[0] = result;
		
		String[] tags = new String[1];
		tags[0] = "result";
		
		return new Measurement(finalResult, tags, error);
	}

}

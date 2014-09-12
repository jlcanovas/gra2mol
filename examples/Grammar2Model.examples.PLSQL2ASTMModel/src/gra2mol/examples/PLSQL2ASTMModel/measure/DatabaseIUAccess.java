package gra2mol.examples.PLSQL2ASTMModel.measure;

import kdm.kdm.Segment;

public class DatabaseIUAccess extends Measure {

	public DatabaseIUAccess(Segment kdmSegment) {
		super(kdmSegment);
		this.name = "UI access to databse";
		this.description = "Counts reads and writes in data block items";
	}

	@Override
	protected Measurement especificExecute() {
		// TODO Auto-generated method stub
		return null;
	}

}

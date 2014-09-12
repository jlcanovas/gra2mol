package gra2mol.examples.PLSQL2ASTMModel.measure;

import java.util.Date;

public class Measurement {
	private Object[] values = null;
	private String[] tags = null;
	private String error = null;
	private Date observation;

	public Measurement(Object[] values, String[] tags, String error,
			Date observation) {
		super();
		this.values = values;
		this.tags = tags;
		this.error = error;
		this.observation = observation;
	}
	
	public Measurement(Object[] values, String[] tags, String error) {
		super();
		this.values = values;
		this.tags = tags;
		this.error = error;
		this.observation = new Date();
	}
	
	public Object[] getValues() {
		return values;
	}
	public void setValues(Object[]values) {
		this.values = values;
	}
	
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public Date getObservation() {
		return observation;
	}
	public void setObservation(Date observation) {
		this.observation = observation;
	}
	
		
	
}

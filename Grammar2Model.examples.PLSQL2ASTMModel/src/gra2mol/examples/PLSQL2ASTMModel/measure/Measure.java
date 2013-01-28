package gra2mol.examples.PLSQL2ASTMModel.measure;

import kdm.kdm.Segment;


/**
 * Abstract representation of a measure
 * @author jlcanovas
 *
 */
public abstract class Measure {
	/**
	 * Name of the Measure
	 * This variable must be initialized by subclasses to describe the measure
	 */
	protected String name;

	/**
	 * Description of the Measure
	 * This variable must be initialized by subclasses to describe the measure
	 */
	protected String description;

	protected Segment kdmSegment;

	public Measure(Segment kdmSegment) {
		super();
		this.kdmSegment = kdmSegment;
	}

	/**
	 * Template method which executes the measure and prints the result
	 */
	public void execute() {

		long startTime = System.currentTimeMillis();
		System.out.println("Measure: " + name);
		System.out.println("   Description: " + description);

		Measurement measurement = especificExecute();
		System.out.print("   Value(s): ");

		if (measurement == null) {
			System.out.println(" no results ");
		} else {
			for(int i = 0; i < measurement.getValues().length; i++) {
				System.out.print("[" + measurement.getTags()[i] + "=" + measurement.getValues()[i] +"] ");
			}
			System.out.println();			

			if(measurement.getError() != null) 
				System.out.println("   Error: " + measurement.getError());
		}


		long endTime = System.currentTimeMillis() - startTime;
		System.out.println("   Time lapsed: " + endTime + " milisecs");
		System.out.println();
	}

	/**
	 * This method must be implemented by subclasses. 
	 * It executes the logic of the measure
	 * @return
	 */
	protected abstract Measurement especificExecute();


}

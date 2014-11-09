package tema1Remake;

public class Ellipse implements Shape {
	
	//variabilele clasei:
	private Point centerOfCircle;
	private int minorRadius;
	private int majorRadius;
	
	/**
	 * @param centerOfCircle
	 * @param minorRadius
	 * @param majorRadius
	 */
	public Ellipse(Point centerOfCircle, int minorRadius, int majorRadius) {
		super();
		this.centerOfCircle = centerOfCircle;
		this.minorRadius = minorRadius;
		this.majorRadius = majorRadius;
	}
	
	@Override
	public String display() {
		String output = "Ellipse having center at " + centerOfCircle.display() + " and having a minor radius of " + minorRadius + " and a major radius of " + majorRadius;
		return output;
	}

	@Override
	public float getPerimeter() {
		float perimeterValue = (float) (2 * Math.PI * Math.sqrt((Math.pow(minorRadius, 2) + Math.pow(majorRadius, 2) / 2)));
		return perimeterValue; 
	}

}

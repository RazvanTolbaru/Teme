package tema1Remake;

public class Circle implements Shape {
	
	String shapeType  = "CIRCLE";
	
	//variabilele clasei
	private Point centerOfCircle;
	private int radius;
	
	/**
	 * @param centerOfCircle
	 * @param radius
	 */
	
	//constructorul clasei
	public Circle(Point centerOfCircle, int radius) {
		super();
		this.centerOfCircle = centerOfCircle;
		this.radius = radius;
	}
	
	@Override
	public String display() {
		String output = "Circle having center at " + centerOfCircle.display() + " and a radius of " + radius; 
		return output;
	}

	@Override
	public float getPerimeter() {
		float perimeterValue = (float) (2 * Math.PI * radius);
		return perimeterValue;
	}

}

package tema1Remake;



public class Rectangle implements Shape{
	
	String shapeType  = "RECTANGLE";
	
	//declaram variabilele clasei Rectangle:
	private Point lowerLeftcorner;
	private int rectangleLength;
	private int rectangleWidth;
	/**
	 * @param lowerLeftcorner
	 * @param rectangleLength
	 * @param rectangleWidth
	 */
	
	//contructorul clasei
	public Rectangle(Point lowerLeftcorner, int rectangleLength,
			int rectangleWidth) {
		super();
		this.lowerLeftcorner = lowerLeftcorner;
		this.rectangleLength = rectangleLength;
		this.rectangleWidth = rectangleWidth;
	}

	@Override
	public String display() {
		String output = "Rectangle having lower left corner set at " + lowerLeftcorner.display() + " and a length of " + rectangleLength + " and a width of  " + rectangleWidth;
		return output;
	}

	@Override
	public float getPerimeter() {
		float perimeterValue = 2 * rectangleLength + 2 * rectangleWidth;
		return perimeterValue;
	}

}

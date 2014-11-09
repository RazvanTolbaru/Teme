package tema1Remake;


public  class Triangle implements Shape{
	
	String shapeType  = "TRIANGLE";
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
					
	public Triangle(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}
	
		
	

	@Override
	public String display() {
		String output = "Triangle having " +  pointA.display() + " and " 
				+ pointB.display() + " and " + pointC.display();
		return output;
	}

	@Override
	public float getPerimeter() {
		float perimeterValue = pointA.distanceTo(pointB) + pointA.distanceTo(pointC) + pointB.distanceTo(pointC);
		return perimeterValue;			
		
	}




	
}




	




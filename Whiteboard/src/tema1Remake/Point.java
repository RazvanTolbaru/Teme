package tema1Remake;

public class Point implements Shape {
	
	private float xCoord;
	private float yCoord;
	
	String shapeType  = "POINT";
	
	
	public Point(float xCoord, float yCoord) {
		super();
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	public float distanceTo(Point other){
		return  (float) (Math.sqrt((this.xCoord - other.xCoord)*(this.xCoord - other.xCoord) 
				+ (this.yCoord - other.yCoord)*(this.yCoord - other.yCoord)));
	}
	
	public String display(){
		String shapeDisplay = "Punctul de coordonate " + xCoord + " , " + yCoord;
		return shapeDisplay;
	}

	@Override
	public float getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}

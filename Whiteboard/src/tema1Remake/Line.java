package tema1Remake;

public class Line implements Shape{
	
	String shapeType  = "LINE";
	
	private Point pointStart;
	private Point pointEnd;
	
	
	public Line(Point pointStart, Point pointEnd){
		this.pointStart = pointStart;
		this.pointEnd = pointEnd;
	}
	
	
	
	public String display(){
		String output = "Line start " + pointStart.display() + " and end " + pointEnd.display();
		return output;		
	}	
	
	

	@Override
	public float getPerimeter() {
		// TODO Auto-generated method stub
		return pointStart.distanceTo(pointEnd);
	}



}


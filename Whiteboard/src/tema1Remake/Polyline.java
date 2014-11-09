package tema1Remake;
import java.util.*;

public class Polyline implements Shape {
	
	String shapeType  = "POLYLINE";
	
	// declaram variabilele, polyline cu 5 laturi
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	private Point pointE;
	private boolean isClose;
	private List<Point> pointList = new ArrayList<Point>(); 
	
	
	
	/**
	 * @param pointA
	 * @param pointB
	 * @param pointC
	 * @param pointD
	 * @param pointE
	 */
	public Polyline(Point pointA, Point pointB, Point pointC, Point pointD,
			Point pointE, boolean isClose) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
		this.pointE = pointE;
		this.isClose = isClose;
			
		pointList.add(this.pointA);
		pointList.add(this.pointB);
		pointList.add(this.pointC);
		pointList.add(this.pointD);
		pointList.add(this.pointE);
		
		
	}	


	@Override
	public String display() {
		String output = "Polyline having " +  pointA.display() + 
				", " + pointB.display() + 
				", " + pointC.display() + 
				", " + pointD.display() + 
				", " + pointE.display();
		return output;
	}

	@Override
	public float getPerimeter() {
		float perimeterValue = 0;
		
		for (int i = 0; i < pointList.size() - 1 ; i++){
			perimeterValue += pointList.get(i).distanceTo(pointList.get(i + 1));
		}
		
		if (isClose){
			perimeterValue = perimeterValue + pointList.get(pointList.size() - 1).distanceTo(pointList.get(0)) ;
		}
				
		return perimeterValue;
	}
}

	
	

package tema1Remake;

import java.util.*;


public class Whiteboard implements Shape{
	
	static  List<Shape> shapes = new ArrayList<Shape>(); 

	/*public static void main(String[] args) {
		
		Whiteboard whiteboardTest = new Whiteboard();
		
		whiteboardTest.shapeAdd(new Point(1, 5));
		whiteboardTest.shapeAdd(new Circle(new Point(1, 5), 3));
		whiteboardTest.shapeAdd(new Rectangle(new Point(1, 3), 3, 3));

		System.out.println("There is number of " + shapes.size() + " shapes on the Whiteboard. ");
		
		for (Shape shapeName: shapes){
			
			
			System.out.println(shapeName.display() + " is having a perimeter of " + shapeName.getPerimeter());
			
		}		

	}
	*/
	public void addShape(Shape shapeName){
		shapes.add(shapeName);
	}
	

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}

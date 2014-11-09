import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBConnect.*;
import tema1Remake.Shape;


public class Test {

	public  static void main(String[] args) throws SQLException {
		
		List<Shape> allShapes = new ArrayList<Shape>();
		
		GenerateCircleFromDB aCircle =  new GenerateCircleFromDB();
		GeneratePointFromDB aPoint = new GeneratePointFromDB();
		GenerateRectangleFromDB	aRectangle  = new GenerateRectangleFromDB();
		
		GenerateShapeFromDB aShape = new GenerateShapeFromDB();
		
		for (int i = 0; i < aShape.generateShape().size(); i ++ ){
			allShapes.add(aShape.generateShape().get(i));
			}
		
		for (int i = 0; i < aPoint.generateShape().size(); i ++ ){
			allShapes.add(aPoint.generateShape().get(i));
		}
		
		for (int i = 0; i < aCircle.generateShape().size(); i ++ ){
			allShapes.add(aCircle.generateShape().get(i));
		}
		
		for (int i = 0; i < aRectangle.generateShape().size(); i ++ ){
			allShapes.add(aRectangle.generateShape().get(i));
		}
		
		
		for (Shape shapeName : allShapes){
			System.out.println(shapeName.display());
			
		
		}
		
	}
}




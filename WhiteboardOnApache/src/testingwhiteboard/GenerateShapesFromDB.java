package testingwhiteboard;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tema1Remake.Shape;
import DBConnect.GenerateCircleFromDB;
import DBConnect.GeneratePointFromDB;
import DBConnect.GenerateRectangleFromDB;
import DBConnect.GenerateShapeFromDB;

public class GenerateShapesFromDB {
	
public List<Shape> generateShapesFromDB(){
		
		List<Shape> allShapes = new ArrayList<Shape>();
		GenerateCircleFromDB aCircle =  new GenerateCircleFromDB();
		GeneratePointFromDB aPoint = new GeneratePointFromDB();
		GenerateRectangleFromDB	aRectangle  = new GenerateRectangleFromDB();
		GenerateShapeFromDB aShape = new GenerateShapeFromDB();
		
		try {
		
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allShapes;
		
	}
	

}

package DBConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tema1Remake.Circle;
import tema1Remake.Point;
import tema1Remake.Rectangle;
import tema1Remake.Shape;


public class GenerateShapeFromDB implements DBHelper{

	@Override
	public List<Shape> generateShape() throws SQLException {
				
		List<Shape> shapeList = new ArrayList<Shape>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error unable to load driver");
		}
			
			Connection connection;
			connection = DriverManager.getConnection(url);
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from Whiteboard");
		
		
		
		while (result.next()){
			String ShapeType = result.getString("SHAPETYPE");
				if (ShapeType.equalsIgnoreCase("Point"))
				{
					float xCoord = result.getFloat("Xcoord");
					float yCoord = result.getFloat("ycoord");
					shapeList.add(new Point(xCoord, yCoord));
				}
				if (ShapeType.equalsIgnoreCase("Circle"))
				{
					float xCoord = result.getFloat("xcoord");
					float yCoord = result.getFloat("ycoord");
					int radius = result.getInt("radius");
								
					shapeList.add(new Circle(new Point(xCoord, yCoord), radius));
				}
				if (ShapeType.equalsIgnoreCase("Rectangle"))
				{
					float xCoord = result.getFloat("xcoord");
					float yCoord = result.getFloat("ycoord");
					int rectangleLength = result.getInt("rectangleLength");
					int rectangleWidth =  result.getInt("rectangleWidth");
					
					shapeList.add(new Rectangle(new Point(xCoord, yCoord), rectangleLength, rectangleWidth));
				}
				
			
			}
		result.close();
		statement.close();
		connection.close();

			
		

		return shapeList;
	}
	
	

}

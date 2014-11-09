package DBConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tema1Remake.Point;
import tema1Remake.Rectangle;
import tema1Remake.Shape;


public class GenerateRectangleFromDB implements DBHelper{

	
	public List<Shape> generateShape() throws SQLException {
		
		List<Shape> shapeList =new ArrayList<Shape>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error unable to load driver");
		}
			
			Connection connection;
			connection = DriverManager.getConnection(url);
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from rectangle_LIST");
	

		while(result.next()){
			float xCoord = result.getFloat("xcoord");
			float yCoord = result.getFloat("ycoord");
			int rectangleLength = result.getInt("rectangleLength");
			int rectangleWidth =  result.getInt("rectangleWidth");
			
			shapeList.add(new Rectangle(new Point(xCoord, yCoord), rectangleLength, rectangleWidth));
			
		}
		
		result.close();
		statement.close();
		connection.close();

		return shapeList;
	
	
		}
	
}

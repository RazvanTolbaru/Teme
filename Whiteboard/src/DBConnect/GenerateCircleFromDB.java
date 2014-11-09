package DBConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tema1Remake.*;


public class GenerateCircleFromDB implements DBHelper {

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
			ResultSet result = statement.executeQuery("select * from CIRCLE_LIST");
		
		while(result.next()){
			float xCoord = result.getFloat("xcoord");
			float yCoord = result.getFloat("ycoord");
			int radius = result.getInt("radius");
						
			shapeList.add(new Circle(new Point(xCoord, yCoord), radius));
			
			result.close();
			statement.close();
			connection.close();
		
		}
		return shapeList;
	}

	


}

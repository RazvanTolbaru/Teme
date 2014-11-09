package DBConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tema1Remake.*;


public class GeneratePointFromDB implements DBHelper{	

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
			ResultSet result = statement.executeQuery("select * from POINT_LIST");

		while(result.next()){
			float xCoord = result.getFloat("Xcoord");
			float yCoord = result.getFloat("ycoord");
						
			shapeList.add(new Point(xCoord, yCoord));
			
			
	
		}
		result.close();
		statement.close();
		connection.close();
	
		return shapeList;
	}
	

}



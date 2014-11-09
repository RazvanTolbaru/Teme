package DBConnect;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tema1Remake.Shape;

public interface DBHelper {
	
	String url="jdbc:oracle:thin:System/parola@localhost:1521:eclipse";
	List<Shape> shapeList = new ArrayList<Shape>();
			

	
public List<Shape> generateShape() throws SQLException;
	

}

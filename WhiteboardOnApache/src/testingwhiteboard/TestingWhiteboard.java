package testingwhiteboard;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tema1Remake.Shape;

/**
 * Servlet implementation class TestingWhiteboard
 */
@WebServlet("/TestingWhiteboard")
public class TestingWhiteboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		GenerateShapesFromDB allShapes = new GenerateShapesFromDB();
		
		PrintWriter printWriter  = response.getWriter();
	   	    
	    for (Shape shapeName : allShapes.generateShapesFromDB()){
			printWriter.println(shapeName.display());
		
	   }
	    printWriter.close();
		       
 
	}	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	

}

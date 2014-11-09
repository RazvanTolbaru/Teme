/**
 * 
 */
package tema1Remake;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PointFromStream {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in =  new Scanner(System.in);
		List<Point> pointList =  new ArrayList<Point>();
		
		
		for (int i = 1 ; i<4; i++){
			System.out.println("Please enter the value for the x coordinate and the y coordinate for point" + i +" :" );
			float xCoord = in.nextFloat();
			float yCoord = in.nextFloat();
		
		Point point =  new Point(xCoord, yCoord);
		pointList.add(point);
		
		}
		System.out.println("-----------------------------------------------------------------------");
		
		for (int i = 0; i <pointList.size() - 1; i++){
			float distance = pointList.get(i).distanceTo(pointList.get(i+1));
			System.out.println("Distanta dintre " + pointList.get(i).display() + " si " + pointList.get(i + 1).display() + " este " + distance);
		
		}
	}
		



}

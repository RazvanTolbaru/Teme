package generatefromXML;

import java.io.*;
import java.util.*;

import tema1Remake.Circle;
import tema1Remake.Point;

public class CircleFromFile{
	
	static File inputFilePath = new File("D:/Training/inputCircleList.txt");
	static File outputFilePath = new File("D:/Training/outputCircleList.txt");
	
	static List<Circle> circleList = new ArrayList<Circle>();
		
	
	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
		@SuppressWarnings("resource")
		PrintStream writer =  new PrintStream(outputFilePath);	
		
		
		for (int i = 0; i < 4; i++){
			String someLine = reader.readLine();
			String[] arguments  = someLine.split(",");
												
			Circle aCircle = new Circle(new Point(Float.parseFloat(arguments[0]), Float.parseFloat(arguments[1])), Integer.parseInt(arguments[2]));
			circleList.add(aCircle);
		}
				
		for (Circle justACircle:circleList){
			System.out.println(justACircle.display() +" is having a perimeter of " + justACircle.getPerimeter());
			writer.println(justACircle.display() +" is having a perimeter of " + justACircle.getPerimeter());
			}
		}		
	

}

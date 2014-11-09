package generatefromXML;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

import tema1Remake.Circle;
import tema1Remake.Point;

	

public class CircelFromXMLFile {

	public static void main(String[] args) {
		
		List<Circle> circleList = new ArrayList<Circle>();
		
		try {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = factory.newDocumentBuilder();
		Document document = dBuilder.parse(new File("D:\\Training\\inputCircleList.xml"));
		
		//get Root Element:
		System.out.println("Root element is : " +  document.getDocumentElement().getNodeName());
		
		NodeList nList = document.getElementsByTagName("circle");
		System.out.println(nList.getLength());
		
		
		
		for (int i = 0; i < nList.getLength(); i++){
//			The Node interface is the primary datatype for the entire Document Object Model. It represents a single node in the document tree. 
			Node node = nList.item(i);
			
//			The Element interface represents an element in an HTML or XML document. (in cazul nostru, elementul contine  - xCoord, yCoord, radius)
			Element element = (Element) node;
			
			System.out.println("xCoord : " +  element.getElementsByTagName("xCoord").item(0).getTextContent());
			System.out.println("yCoord : " +  element.getElementsByTagName("yCoord").item(0).getTextContent());
			System.out.println("Radius : " +  element.getElementsByTagName("radius").item(0).getTextContent());
			System.out.println("--------------------------------------------------------------------------------");
			
			float xCoord = Float.parseFloat(element.getElementsByTagName("xCoord").item(0).getTextContent());
			float yCoord = Float.parseFloat(element.getElementsByTagName("yCoord").item(0).getTextContent());
			float radius = Float.parseFloat(element.getElementsByTagName("xCoord").item(0).getTextContent()); 
			
			circleList.add(new Circle(new Point(xCoord, yCoord), (int) radius));
							
		
		}
		
		}catch (FileNotFoundException filenotfound){
			System.out.println("We couldn't find the file");
		}catch (Exception e){
			e.printStackTrace();
		}
		
		for (Circle justACircle:circleList) {
			System.out.println(justACircle.display() + " is having a perimeter of " + justACircle.getPerimeter());
		}
	}
	
	

}

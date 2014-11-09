package generatefromXML;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import tema1Remake.Point;

import javax.xml.parsers.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RetryPointFromXMLFile {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document pointFromXMLFile = builder.parse(new File("D:\\Training\\inputPointList.xml"));
		
		Element root = pointFromXMLFile.getDocumentElement();
		
		System.out.println(root.getNodeName());
		
		NodeList nList = pointFromXMLFile.getElementsByTagName("point");
		List<Point> pointList = new ArrayList<Point>();
		
		for (int i = 0; i <nList.getLength(); i ++){
			
//			Node node = nList.item(i);
			
			Element element = (Element) nList.item(i);
			
//			System.out.println(element.getElementsByTagName("PointName").item(0).getTextContent());
//			System.out.println(element.getElementsByTagName("xCoord").item(0).getTextContent());
			
			float xCoord = Float.parseFloat(element.getElementsByTagName("xCoord").item(0).getTextContent());
			float yCoord = Float.parseFloat(element.getElementsByTagName("yCoord").item(0).getTextContent());
			
			
			
			pointList.add(new Point(xCoord, yCoord));
			
//
//			System.out.println(xCoord);
//			System.out.println(yCoord);
			
			}
		
		for (int i = 0; i < pointList.size() - 1; i ++){
			
			
			System.out.println("Distanta dintre " + pointList.get(i).display() + " si " + pointList.get(i + 1).display() + " este " + pointList.get(i).distanceTo(pointList.get(i + 1)));
		}

		
		
	}			
}
	
	


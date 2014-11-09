package generatefromXML;

import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException; 
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class PointFromXMLFile {
		
	public void getValuesFromXML() throws  SAXException, ParserConfigurationException, IOException {
		
		List<String> values = new ArrayList<String>();
		
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File("D:\\Training\\inputPointList.xml"));
			
		Element rootElement = doc.getDocumentElement();
		
		NodeList nodes = rootElement.getChildNodes();
		
		
		String xCoord = rootElement.getAttribute("xCoord");
		String yCoord = rootElement.getAttribute("yCoord");
		
		System.out.println(xCoord);
		System.out.println(yCoord);
		
		

	}

}


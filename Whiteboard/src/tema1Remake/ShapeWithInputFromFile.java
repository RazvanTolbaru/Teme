package tema1Remake;

import java.io.*;
import java.util.*;

public interface ShapeWithInputFromFile extends Shape {
	
	
	default public ArrayList<String> getFileInput() throws IOException{
		
		ArrayList<String> readerOutput =  new ArrayList<String>();
		@SuppressWarnings("resource")
		Scanner getInput = new Scanner(System.in);
		
		System.out.println("Please provide the path for the input file(file may be either csv or xml): ");
		File inputFilePath = new File(getInput.nextLine());

		
		@SuppressWarnings("resource")
		BufferedReader reader =  new BufferedReader(new FileReader(inputFilePath));
		
		

		while(reader.readLine() != null){
			readerOutput.add(reader.readLine());
		}
		
			
		
		return readerOutput;
	}
		
		
		
		
		
		
		
		
		
		
	}



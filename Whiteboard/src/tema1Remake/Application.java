package tema1Remake;

public class Application {
	
	public static void main(String[] args) {
		
		Whiteboard whiteboard = new Whiteboard();
	
		whiteboard.addShape(new Point(1, 4));
		whiteboard.addShape(new Circle(new Point(1, 5), 5));
		whiteboard.addShape(new Circle(new Point(4, 6), 2));
		whiteboard.addShape(new Point(3, 4));
		
		
		
		System.out.println(Whiteboard.shapes.size());
					 
		/*try
	      {
	         FileOutputStream fileOut = new FileOutputStream("point.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(whiteboard);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in point.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	      
	      
*/
			   }
		 

	}



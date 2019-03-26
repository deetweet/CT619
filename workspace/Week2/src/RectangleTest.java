/**
* <h1>RectangleTest</h1>
* <p>Test class instantiates the Rectangle class with for <pre>1819-CT619 Object-Oriented Programming: Week 2</pre>: Assignment One</p>
* @author  David Foye
* @version 1.0
* @since   2019-03-24
*/

import java.util.InputMismatchException; //Import the exception class
import java.util.Scanner;  // Import the Scanner class

public class RectangleTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle r = new Rectangle();
		float length, width;
		try {
			System.out.println("Enter rectangle length: ");
		    length = scanner.nextFloat();  // Read user input
		    System.out.println("Enter rectangle width: ");
		    width = scanner.nextFloat();
		    //Check input values are valid
		    if(length < 0 | width < 0){
		    	System.out.println("The values for width and length cannot be zero");
		    	System.exit(1);
		    } else {
		    	r.setLength(length);
			    r.setWidth(width);
			    System.out.println("Rectangle created.\nLength: " + r.getLength() + "\nWidth: " + r.getWidth() + "\nArea: " + r.Area() +"\nPerimeter: " + r.Perimeter());
		    }	   	
		} catch (InputMismatchException e){
			System.out.println("Invalid value entered. This program only accepts valid numerical input");
			System.exit(1);
		} catch (IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
		}
		
	}

}

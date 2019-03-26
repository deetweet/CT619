/**
* <h1>CartesianRectangleTest</h1>
* <p>Test class instantiates the Cartesian Rectangle class for <pre>1819-CT619 Object-Oriented Programming: Week 2</pre>: Assignment</p>
* @author  David Foye
* @version 1.0
* @since   2019-03-24
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class CartesianRectangleTest {
	public static void main(String[] args) {
		float x1, x2, x3, x4, y1, y2, y3, y4;
		Scanner scanner = new Scanner(System.in);
		System.out.println("This program tests the Cartesian coordinate Java class. The coordinates are as follows:");
		System.out.println("(x1, y1) +---------------------------------+ (x2, y2)");
		System.out.println("         |                                 |");
		System.out.println("         |                                 |");
		System.out.println("         |                                 |");
		System.out.println("(x3, y3) +---------------------------------+ (x4, y4)");
		try {
			System.out.println("Please enter the value for X1: ");
			x1 = scanner.nextFloat();
			System.out.println("Please enter the value for Y1: ");
			y1 = scanner.nextFloat();
			System.out.println("Please enter the value for X2: ");
			x2 = scanner.nextFloat();
			System.out.println("Please enter the value for Y2: ");
			y2 = scanner.nextFloat();
			System.out.println("Please enter the value for X3: ");
			x3 = scanner.nextFloat();
			System.out.println("Please enter the value for Y3: ");
			y3 = scanner.nextFloat();
			System.out.println("Please enter the value for X4: ");
			x4 = scanner.nextFloat();
			System.out.println("Please enter the value for Y4: ");
			y4 = scanner.nextFloat();
			CartesianRectangle r = new CartesianRectangle(x1, y1, x2, y2, x3, y3, x4, y4);
			System.out.println("Rectangle created.\nLength: " + r.getLength() + "\nWidth: " + r.getWidth() + "\nArea: " + r.Area() +"\nPerimeter: " + r.Perimeter() + "\nIs Square: " + r.isSquare());
		} catch (InputMismatchException e){
			System.out.println("Invalid value entered. This program only accepts valid numerical input");
			System.exit(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}

}

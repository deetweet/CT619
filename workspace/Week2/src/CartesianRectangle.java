/**
* <h1>CartesianRectangle</h1>
* <p>This class implements a Rectangle class with Cartesian co-ordinates for <pre>1819-CT619 Object-Oriented Programming: Week 2</pre>: Assignment One</p>
* <p>
* Per the assignment: <pre>Create a more sophisticated Rectangle class than the one you created above. 
This class stores only the Cartesian coordinates of the four corners of the 
rectangle. The constructor calls a set method that accepts four sets of 
coordinates and verifies that each of these is in the first quadrant with no 
single x- or y-coordinate larger than 20.0. The set method also verifies that the supplied coordinates specify a rectangle</pre>
* </p>*
* @author  David Foye
* @version 1.0
* @since   2019-03-22
*/
public class CartesianRectangle implements Shape {
    
    private double width;
    private double length;
	private double x1, x2, x3, x4, y1, y2, y3, y4;
    
   CartesianRectangle(double X1, double Y1, double X2, double Y2, double X3, double Y3, double X4, double Y4) {
        if(setCoords(X1, Y1, X2, Y2, X3, Y3, X4, Y4)) {
            this.x1 = X1;
            this.x2 = X2;
            this.x3 = X3;
            this.x4 = X4;
            this.y1 = Y1;
            this.y2 = Y2;
            this.y3 = Y3;
            this.y4 = Y4;
        } else {
        	throw new IllegalArgumentException("Error: X/Y Co-ordinates are invalid");
        }
    }
    
    /*
     * The constructor calls a set method that accepts four sets of 
     * coordinates and verifies that each of these is in the first 
     * quadrant with no single x- or y-coordinate larger than 20.0
     */
    private boolean setCoords(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        // Ensure all x co-ordinates are in the first quadrant
        if(x1 < 0 || x2 < 0 || x3 < 0 || x4 < 0) {
            throw new IllegalArgumentException("Error: Non-negative numbers for the X co-ordinates only");
        } else if(y1 < 0 || y2 < 0 || y3 < 0 || y4 < 0) {
            throw new IllegalArgumentException("Error: Non-negative numbers for the Y co-ordinates only");
        } else if(x1 > 20 || x2 > 20 || x3 > 20 || x4 > 20) {
            throw new IllegalArgumentException("Error: X co-ordinate values cannot be greater than 20");
        } else {
        	return(true);
        }
    }
    /*
     * Name: getLength
     * Synopsis: Returns the length of the rectangle
     * Description: The distance D between the points is given by the formula: D = sqrt(dx^2 + dy^2)
     * Where dx is the difference of the x coordinates and dy is the difference in the
     * y coordinates
     */
    public double getLength() {
    	if (this.x2 >= this.x1) {
    		if (this.y1 >= this.y2) {
    			length = Math.sqrt(Math.pow((this.x2 - this.x1), 2) + Math.pow((this.y1 - this.y2), 2));
    		} else {
    			length = Math.sqrt(Math.pow((this.x2 - this.x1), 2) + Math.pow((this.y2 - this.y1), 2));
    		}
    	} else if(this.x2 < this.x1) {
    		if (this.y1 < this.y2) {
    			length = Math.sqrt(Math.pow((this.x1 - this.x2), 2) + Math.pow((this.y2 - this.y1), 2));
    		} else {
    			length = Math.sqrt(Math.pow((this.x1 - this.x2), 2) + Math.pow((this.y2 - this.y1), 2));
    		}
    	}
    	return(length);
    }
    /*
     * Name: getWidth
     * Synopsis: Returns the width of the rectangle
     * Description: The distance D between the points is given by the formula: D = sqrt(dx^2 + dy^2)
     * Where dx is the difference of the x coordinates and dy is the difference in the
     * y coordinates
     */
    public double getWidth() {
    	if (this.x1 >= this.x3) {
    		if (this.y1 >= this.y3) {
    			width = Math.sqrt(Math.pow((this.x1 - this.x3), 2) + Math.pow((this.y1 - this.y3), 2));
    		} else {
    			width = Math.sqrt(Math.pow((this.x1 - this.x3), 2) + Math.pow((this.y3 - this.y1), 2));
    		}
    	} else if (this.x1 < this.x3) {
    		if (this.y1 >= this.y3) {
    			width = Math.sqrt(Math.pow((this.x3 - this.x1), 2) + Math.pow((this.y1 - this.y3), 2));
    		} else {
    			width = Math.sqrt(Math.pow((this.x3 - this.x1), 2) + Math.pow((this.y3 - this.y1), 2));
    		}
    	}
    	return(width);
    }
    /*
     * Name: getPerimeter
     * Synopsis: Returns the perimeter length of the rectangle
     * Description: The perimeter distance is calculated as twice the width plus twice the length.
     */
    public double Perimeter() {
    	return((getLength() * 2) + (getWidth() * 2));
    }
    /*
     * Name: getArea
     * Synopsis: Returns the area of the rectangle
     * Description: The area A of a rectangle is given by the formula: A = L * W
     * Where L is the rectangle length and W is the width.
     */
    public double Area() {
    	return(getLength() * getWidth());
    }
    /*
     * Name: isSquare
     * Synopsis: Tests if the coordinates are a square
     * Description: Calls the getWidth() and getLength() methods and checks
     * if they are equal. Returns true if equal and false otherwise. 
     */
    public boolean isSquare() {
    	if (getLength() == getWidth()) {
    		return(true);
    	} else {
    		return(false);
    	}
    }
    
}
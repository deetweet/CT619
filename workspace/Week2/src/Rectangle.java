/**
* <h1>Rectangle</h1>
* <p>This class implements a Rectangle class for <pre>1819-CT619 Object-Oriented Programming: Week 2</pre>: Assignment One</p>
* <p>
* Per the assignment: <pre>Create a class Rectangle. The class has attributes length and width, each of which defaults to 1. 
* It has methods that calculate the perimeter and the area of the rectangle. It has set and get methods for both length and width. 
* The set methods should verify that length and width are each floating-point numbers larger than 0.0 and less than 20.0. 
* Write a program to test class Rectangle.</pre>
* </p>*
* @author  David Foye
* @version 1.0
* @since   2019-03-20
*/
public class Rectangle {
	
	private float length;
	private float width;
	
	//Class constructor to set the length and width to default values
	Rectangle() {
		this.length = 1;
		this.width = 1;
	}
	//Function to calculate the area
	public double Area() {
		return(this.length * this.width);
	}
	//Function to calculate the perimeter, given as twice the length plus the width
	public double Perimeter() {
		return((this.length * 2) + (this.width * 2));
	}
	//Function to set the length, it cannot be greater than 20 or less than 0
	public void setLength(float l) {
		if(l < 0 || l > 20) {
			throw new IllegalArgumentException("Error: Rectangle Length must be greater than zero or less than 20");
		} else {
			this.length = l;
		}
	}
	//Function to set the width, it cannot be greater than 20 or less than 0
	public void setWidth (float w) {
		if(w < 0 || w > 20) {
			throw new IllegalArgumentException("Error: Rectangle Width must be greater than zero or less than 20");
		} else {
			this.width = w;
		}
	}
	//Function to return the length of the rectangle
	public float getLength() {
		return(this.length);
	}
	//Function to return the width of the rectangle
	public float getWidth() {
		return(this.width);
	}
	
}
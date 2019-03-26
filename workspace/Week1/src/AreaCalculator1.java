import javax.swing.JOptionPane;

public class AreaCalculator1 {	//Class declaration, this is a public class called 'AreaCalculator'
	public static void main(String[] args) {	//main function that is required to run the program
		//Variable declaration. Assign initial values to each variable
		int option = 0;						//the option selected by the user
		double width, height, area = 0; 		//the width, height and resultant area calculated by the program
		String val, shape = null;					//the shape text that will be used as part of the program output
		
		/* 
		 * We enclose this part of the program in a try...catch block so that we
		 * can catch any invalid inputs that would throw an exception in the program
		 * so that they are handled gracefully rather than have them crash the program
		 */
		
		/*
		 * Get the required shape from the user by using the showInputDialg method of the JOptionPane class
		 * We're using the parseInt method of the Integer class to convert the response to an int and assign 
		 * to the option variable. In proper operation 'option' should contain either value 1 or 2
		 * From: https://stackoverflow.com/questions/3120922/joptionpane-input-to-int
		 */

		val = JOptionPane.showInputDialog("This program calculates the area\nof a Rectangle or Triangle\n\nPlease select a shape:\n1. Rectangle\n2. Triangle");
		
		if (val == null) {
			System.out.println("Cancel was pushed");
			System.exit(1);
		}
		option = Integer.parseInt(val);
		/* 
 		 * If the user selects '1' then the first part of the if statement will
 		 * execute. It will set the 'shape' string to rectangle, request the values
 		 * from the user via a JOptionPane and calculate the area. For a rectangle
 		 * the area is width * height.
 		 */
 		if (option == 1){
 			shape = "Rectangle";
 			val = JOptionPane.showInputDialog("Enter Rectangle width:");
 			width = Double.parseDouble(val);
 			height = Double.parseDouble(JOptionPane.showInputDialog("Enter Rectangle height:"));
 			area = width * height;
 		}
 		/*
 		 * Otherwise, if '2' is selected and not '1' then the else if part of the statement will
 		 * execute. Here too, the shape type is set and the required values are prompted for 
 		 * and stored in the appropriate variables. The area is calculated for a triangle as
 		 * half the width * height.
 		 */
 		else if (option == 2) {
 			shape = "Triangle";
 			width = Double.parseDouble(JOptionPane.showInputDialog("Enter Triangle base width:"));
 			height = Double.parseDouble(JOptionPane.showInputDialog("Enter Triangle height:"));
 			area = (width/2) * height;
 		} 
 		/*
 		 * The 'else' clause deals with all other numerical inputs and will output an error and
 		 * exit. System.exit(1) tells the compiler we are exiting under an error condition and that will be passed back to the
 		 * calling environment (for example the command prompt). We exit on an error condition here as to exclude the exit
 		 * statement would mean the program would continue for the final output at the end of the program and display
 		 * incorrect values.
 		 */
 		else {
 			printErrorMessage();
 		}
 		/*
 		 * Finally we have either calculated the area of a valid shape or have already exited the program due to an error
 		 * condition, so here we will print out the values for shape and area. Here too we use the string concatenation 
 		 * operator '+'.
 		 */
		JOptionPane.showMessageDialog(null, "Total area for " + shape + " is: " + area); //Print the answer
		System.exit(0); //Terminate program
	}
	/*
	 * This function prints a standard error message to the screen and terminates the 
	 * program.
	 */
	private static void printErrorMessage() {
		JOptionPane.showMessageDialog(null, "Invalid entry. This program only accepts either 1 or 2 as options. Program Ends");
		System.exit(1); //Terminate program, abnormal termination, invalid entry
	}
}
/* Java program to calculuate weekly wages.
 * Michael Madden, 2005 */

import javax.swing.JOptionPane; // Dialog box methods

public class Wages
{
	public static void main(String[] args) 
	{
		double rate, hrs, over, wage, total;
		String rateStr, hoursStr;

		/* Get data in string form: convert to float */
 		rateStr = JOptionPane.showInputDialog("Enter Hourly Rate:");
		rate = Double.parseDouble(rateStr);

		hoursStr = JOptionPane.showInputDialog("Enter Hours Worked:");
		hrs = Double.parseDouble(hoursStr);

		if (hrs <= 40) {
			wage = rate * hrs;
			over = 0;
		}
		else {
			wage = rate * 40;
			over = (hrs - 40) * 1.5 * rate;
		}
		total = wage + over;

		JOptionPane.showMessageDialog(null, "Total weekly wages are " + total);

		System.exit(0); // Terminate program
	}
}

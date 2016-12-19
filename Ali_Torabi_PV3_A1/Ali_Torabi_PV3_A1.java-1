/**
 * Programming Assignment 01
 *
 * Ali_Torabi_PV3_A1 class takes as input given lengths expressed in feet and inches,
 * then convert and output the lengths in centimeters.
 * state information includes:
 * <ul>The inputs:
 * <li>Length in feet
 * <li>Length in inches
 * </ul>
 * <p>and the output: Equivalent length in centimeters
 *
 * @author      Ali Torabi
 * @version     1.0
 * @since		14 April 2016
 */

import java.util.Scanner; // This class uses class Scanner

public class Ali_Torabi_PV3_A1 {

	//main method begins execution of class Ali_Torabi_PV3_A1.java
	public static void main(String[] args) {

		// Create a Scanner object (instance) that
		// obtains input from the command window
		Scanner console = new Scanner(System.in);
		//Declare variables
		final double CETIMETERS_PER_INCH = 2.54;
		final int INCHES_PER_FOOT = 12;
		Scanner scanner = new Scanner(System.in) ;
		int feet = 0 ; // assigning 0 to feet
		int inches = 0 ; // assigning 0 to inches
		int totalInches = 0; // assigning 0 to totalInches
		double centimeters = 0; // assigning 0 to centimeters

		System.out.print("Enter feet: "); // Prompting user to enter feet
		feet = scanner.nextInt(); // Get feet
		System.out.print("Enter inches: "); // Prompting user to enter inches
		inches = scanner.nextInt(); // Get inches
		// Find the length in inches (according to the formula: inches = (feet * 12 ) + inches)
		totalInches = (feet * INCHES_PER_FOOT) + inches;
		// Convert the length to centimeters (according to the formula: centimeters = inches * 2.54)
		centimeters = totalInches * CETIMETERS_PER_INCH;

		// Echo the input by outputting what the program read as input
		System.out.println("The numbers you entered are " + feet + " for feet and " + inches + " for inches.");
		// Output the length in inches
		System.out.println("The total number of inches = " + totalInches);
		// Output the length in centimeters
		System.out.println("The number of centimeters = " + centimeters);
	} //end main method
} //end class Ali_Torabi_PV3_A1
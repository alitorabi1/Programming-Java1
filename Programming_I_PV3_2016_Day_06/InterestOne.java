//InterestOne.java
// Calculate the compound InterestContinue statement to skip a specific iterator

// import java.util.Scanner; //class uses class Scanner
/*
**********************************
* Programming Exercises 3 *
* Programming I *
* Author: Ali Torabi *
* Due Date: 18 April 2016 *
*
**********************************
*/
// Class declaration
public class InterestOne {
	// main method begins execution of java application
	public static void main(String[] args){ // static means it doesn't need to initialization
		//1. declaration
		double amount; // Amount on deposit at the end of each year
		final double RATE; // Interest anual rate
		double principal; //initial amount before interest

		//2. initialization
		RATE = 0.05;
		principal = 1000.0;

		//3. Processing phase
		System.out.printf("%s%20s%n", "Year", " Amount on deposit");
		System.out.printf("%s%20s%n", "====", " =================");
		// calculate amount on deposit for each year
		for (int year = 1; year <= 10; year++){
			// Math.pow(double a, double b) returns the value of the
			// first argument raised to the power of the second
			// amount = principle x (1 + rate)^year
			amount = principal * (Math.pow(1 + RATE, year));

			// 4. Termination(display) phase
			// display the year and amount with interest
			System.out.printf("%4d%, 20.2f%n", year, amount);
		} // end for loop
	}
}
//SumOfEvenNumbers.java
//Display the sum of even integer from 2 to 20
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
public class SumOfEvenNumbers {
	// main method begins execution of java application
	public static void main(String[] args){ // static means it doesn't need to initialization
		// declaration

		//initialization
		int totalEven = 0;
		int totalOdd = 0;

		//Processing
		for (int number = 2; number <=20; number +=2) {
			totalEven += number; //total = total + number
			System.out.printf("The sum of Even Numbers is %d%n", totalEven);
		} // end loop while

		System.out.println();

		//Processing
		for (int number1 = 1; number1 <=20; number1 +=2) {
			totalOdd += number1; //total = total + number
			System.out.printf("The sum of Odd Numbers is %d%n", totalOdd );
		} // end loop while

	}
}
//DoWhileCouter.java
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
public class DoWhileCouter {
	// main method begins execution of java application
	public static void main(String[] args){ // static means it doesn't need to initialization
		// declaration

		//initialization
		int number = 2;
		int total = 0;

		// Do While loop continuation condition

		do {
			total += number; //total = total + number
			System.out.printf("The sum of Even Numbers is %d%n", total);
			// increment number
			number +=2;
		} // end do while loop
		while (number <=20);

		System.out.println("Out of do while loop");

	}
}
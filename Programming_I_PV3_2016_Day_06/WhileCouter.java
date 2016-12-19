//WhileCouter.java
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
public class WhileCouter {
	// main method begins execution of java application
	public static void main(String[] args){ // static means it doesn't need to initialization
		// declaration

		//initialization
		int number = 2;
		int total = 0;

		// While loop continuation condition
		while (number <=20) {
			total += number; //total = total + number
			System.out.printf("The sum of Even Numbers is %d%n", total);
			// increment number
			number +=2;
		} // end while loop

		System.out.println("Out of while loop");

	}
}
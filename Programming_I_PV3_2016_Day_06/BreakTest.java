//BreakTest.java
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
public class BreakTest {
	// main method begins execution of java application
	public static void main(String[] args){ // static means it doesn't need to initialization
		// declaration

		//initialization
		int count;

		// for loop continuation condition
		for (count = 1; count <= 10; count++){
			// terminate the loop when count = 5
			if (count == 5) {
				break;
			}
			System.out.printf("The count is %d", count);
			System.out.println("");
		}

		System.out.printf("%nBroke out of loop at count = %d%n", count);
	}
}
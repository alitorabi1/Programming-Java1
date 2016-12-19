// RollDieWithArray.java
// Roll a six-sides die 6000 times using an array
// import the class SecureRandom
import java.security.SecureRandom; //class uses class SecureRandom

/*
**********************************
* Author: Ali Torabi *
* Due Date: 20 April 2016 *
**********************************
*/
// Class declaration
public class RollDieWithArray {
	// main method begins execution of java application
	public static void main(String[] args){
		// class that will produce secure random numbers
		SecureRandom randomNumbers = new SecureRandom();

		// declaration and initialization an array of variables
		int[] frequency = new int[7]; // count of 1s rolled

		int count = 6000;
		int face; // faces of a die

		// loop 6000 times
		for(int roll = 1; roll <= count; roll++) {
			face = 1 + randomNumbers.nextInt(6);
			++frequency[face];
			// acumulate the face value in the frequency variable
		} //end of loop

		// Display the result:
		System.out.println("Face\tFrequency "); // output header
		for(int counter = 1; counter < frequency.length; counter++) {
			System.out.printf("%4d%10d%n", counter, frequency[counter]); // output header
		}
	} // end of main method
} //end of class RollDieWithArray

// RollDie.java
// Roll a six-sides die 6000 times
// import the class SecureRandom
import java.security.SecureRandom; //class uses class SecureRandom

/*
**********************************
* Author: Ali Torabi *
* Due Date: 18 April 2016 *
**********************************
*/
// Class declaration
public class RollDie {
	// main method begins execution of java application
	public static void main(String[] args){
		// class that will produce secure random numbers
		SecureRandom randomNumbers = new SecureRandom();

		// declaration and initialization
		int frequency1 = 0; // count of 1s rolled
		int frequency2 = 0; // count of 2d rolled
		int frequency3 = 0; // count of 3d rolled
		int frequency4 = 0; // count of 4th rolled
		int frequency5 = 0; // count of 5th rolled
		int frequency6 = 0; // count of 6th rolled

		int count = 6000;
		int face; // faces of a die

		// loop 6000 times
		for(int roll = 1; roll <= count; roll++) {
			face = 1 + randomNumbers.nextInt(6);

			// acumulate the face value in the frequency variable
			switch(face) {
				case 1:
					++frequency1; // increment the value frequency1 of by 1
					break;
				case 2:
					++frequency2; // increment the value frequency2 of by 1
					break;
				case 3:
					++frequency3; // increment the value frequency3 of by 1
					break;
				case 4:
					++frequency4; // increment the value frequency4 of by 1
					break;
				case 5:
					++frequency5; // increment the value frequency5 of by 1
					break;
				case 6:
					++frequency6; // increment the value frequency6 of by 1
					break;
			} //end switch statement
		} //end of loop

		// Display the result:
		System.out.println("Face\tFrequency "); // output header
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequency1, frequency2, frequency3, frequency4, frequency5, frequency6); // output header
	} // end of main method
} //end of class RollDie

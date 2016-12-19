/*
**********************************
* Programming Exercises 3 *
* Programming I *
* Author: Ali Torabi *
* Due Date: 15 April 2016 *
* 1. Write a program that prompts the user to input a number. The program should then output the number and a message saying whether the number is positive, negative, or zero.
**********************************
*/
import java.util.Scanner; //class uses class Scanner
// using counter-controlled repetition
public class Exercise1 {
	public static void main(String[] args){
		// declaration
		Scanner console = new Scanner(System.in); //to obtain input from command window
		double number; // entered number by the user

		//initialization
		number = 0;

		//Processing
		System.out.print("Please enter your grade: "); // prompt for a grade
		number = console.nextDouble();
		if(number < 0) {
			System.out.println(number + " is negative.");
		}else if(number > 0) {
			System.out.println(number + " is positive.");
		}else System.out.println(number + " is equal to zero.");
		 // end loop while
	}
}
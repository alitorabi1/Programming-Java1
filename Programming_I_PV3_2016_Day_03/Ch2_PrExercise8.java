/*
**********************************
* Programming Exercises 3 *
* Programming I *
* Author: Ali Torabi *
* Due Date: 12 April 2016 *
8. Write a program that prompts the user to input five decimal numbers.
	The program should then add the five decimal numbers, convert the sum to the
	nearest integer, and print the result.
**********************************
*/
import java.util.*;

public class Ch2_PrExercise8 {
	static Scanner console = new Scanner(System.in);
		public static void main(String[] args){
		double num1, num2, num3, num4, num5;
		int rounded;

		System.out.println("Enter num1: ");
		num1 = console.nextDouble();
		System.out.println("Enter num2: ");
		num2 = console.nextDouble();
		System.out.println("Enter num3: ");
		num3 = console.nextDouble();
		System.out.println("Enter num4: ");
		num4 = console.nextDouble();
		System.out.println("Enter num5: ");
		num5 = console.nextDouble();

		rounded = (int)Math.round((num1+num2+num3+num4+num5)/5);

		System.out.println("Rounded value = " + rounded);

	}
}

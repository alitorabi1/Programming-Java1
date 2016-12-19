/*
**********************************
* Programming Exercises 3 *
* Programming I *
* Author: Ali Torabi *
* Due Date: 12 April 2016 *
9. Write a program that does the following:
	a. Prompts the user to input five decimal numbers
	b. Prints the five decimal numbers
	c. Converts each decimal number to the nearest integer
	d. Adds the five integers
	e. Prints the sum and average of the five integers
**********************************
*/
import java.util.*;

public class Ch2_PrExercise9 {
	static Scanner console = new Scanner(System.in);
		public static void main(String[] args){
		double num1, num2, num3, num4, num5;
		int rounded1, rounded2, rounded3, rounded4, rounded5;

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

		System.out.println("the values of num1 is: " + num1);
		System.out.println("the values of num2 is: " + num2);
		System.out.println("the values of num3 is: " + num3);
		System.out.println("the values of num4 is: " + num4);
		System.out.println("the values of num5 is: " + num5);

		rounded1 = (int)Math.round(num1);
		rounded2 = (int)Math.round(num2);
		rounded3 = (int)Math.round(num3);
		rounded4 = (int)Math.round(num4);
		rounded5 = (int)Math.round(num5);

		System.out.println("The average of the file rounded integers is: = " + (rounded1 + rounded2 + rounded3 + rounded4 + rounded5)/5);

	}
}

/*
**********************************
* Programming Exercises 1 *
* Programming I *
* Author: Ali Torabi *
* Due Date: 12 April 2016 *
**********************************
*/
import java.util.*;
public class Ch2_PrExercise6
{
		static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		//variable declaration
		double num, rounded;
		System.out.print("Enter a number to round: ");
		num = console.nextDouble();
		rounded = (double)Math.round(num);
		//executable statements
		System.out.println("the values of num4 is: " + num);
		System.out.println("the values of average1 is: " + rounded);
	}
}

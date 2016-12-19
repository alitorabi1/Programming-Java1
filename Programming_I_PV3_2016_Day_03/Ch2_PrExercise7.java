/*
**********************************
* Programming Exercises 1 *
* Programming I *
* Author: Ali Torabi *
* Due Date: 12 April 2016 *
**********************************
*/
import java.util.*;
public class Ch2_PrExercise7
{
		static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		//variable declaration
		double num1, num2, num3, num4, num5, average;
		System.out.print("Enter score 1 : ");
		num1 = console.nextDouble();
		System.out.print("Enter score 2 : ");
		num2 = console.nextDouble();
		System.out.print("Enter score 3 : ");
		num3 = console.nextDouble();
		System.out.print("Enter score 4 : ");
		num4 = console.nextDouble();
		System.out.print("Enter score 5 : ");
		num5 = console.nextDouble();
		average = (num1 + num2 + num3 + num4 + num5) / 5;
		//executable statements
		System.out.println("the values of average1 is: " + average);
	}
}

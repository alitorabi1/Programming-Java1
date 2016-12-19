/*
**********************************
* Programming Exercises 3 *
* Programming I *
* Author: Ali Torabi *
* Due Date: 14 April 2016 *
11. Write a Java program that prompts the user to input the elapsed time for an event in seconds.
	The program then outputs the elapsed time in hours, minutes, and seconds.
	(For example, if the elapsed time is 9630 seconds, then the output is 2:40:30.)
**********************************
*/
import java.util.*;

public class Ch2_PrExercise11 {
	static Scanner console = new Scanner(System.in);
		public static void main(String[] args){
		double num1;
		int hours, minutes, seconds;
		System.out.println("Enter your elapsed time in seconds: ");
		num1 = console.nextDouble();
		hours = (int)(num1 / 3600);
		minutes = (int)((num1 % 3600) / 60);
		seconds = (int)(((num1 % 3600) % 60));

		System.out.println("Formatted elapsed time is: " + hours + ":" + minutes + ":" + seconds);

		}
}
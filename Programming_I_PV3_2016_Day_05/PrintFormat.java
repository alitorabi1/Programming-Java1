/*
**********************************
* Programming Exercises 3 *
* Programming I *
* Author: Ali Torabi *
* Due Date: 15 April 2016 *
**********************************
*/
import java.util.*;

public class PrintFormat {
	public static void main(String[] args){
		// declaration
		int score;
		double gpa, hours, rate, tolerance;
		String name;

		//initialization
		score = 87;
		gpa = 3.18452;
		name = "Jessica";
		hours = 35.45;
		rate = 15.00;
		tolerance = 1.01000;

		//display
		System.out.printf("Student name: %11s\n ", name);
		System.out.printf("Exam score  : %10d\n ", score);
		System.out.printf("GPA		   : %20.2f\n ", gpa); // with 20 spaces and rounded number by two
		System.out.println("Fixed Decimal Notation");
		System.out.printf("Hours = %.2f, Rate = %.2f , Pay = %.2f Tolerance = %.2f%n%n%n%n", hours, rate, hours*rate, tolerance);
		//usinf scientific notation
		System.out.printf("Hours = %e, Rate = %e , Pay = %e,%n Tolerance = %e%n%n%n%n", hours, rate, hours*rate, tolerance);

/*
		Scanner console = new Scanner(System.in);
		double num1;
		int hours, minutes, seconds;
		System.out.println("Enter your elapsed time in seconds: ");
		num1 = console.nextDouble();
		hours = (int)(num1 / 3600);
		minutes = (int)((num1 % 3600) / 60);
		seconds = (int)(((num1 % 3600) % 60));

		System.out.println("Formatted elapsed time is: " + hours + ":" + minutes + ":" + seconds);
*/
	}
}
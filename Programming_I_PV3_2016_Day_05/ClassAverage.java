/*
**********************************
* Programming Exercises 3 *
* Programming I *
* Author: Ali Torabi *
* Due Date: 15 April 2016 *
**********************************
*/
import java.util.Scanner; //class uses class Scanner
// using counter-controlled repetition
public class ClassAverage {
	public static void main(String[] args){
		// declaration
		Scanner console = new Scanner(System.in); //to obtain input from command window
//		int total; // the sum of grades //for integer variables
		double total; // the sum of grades
		int gradeCounter; // the number of grades entered
//		int grade;	// the grade, entered by user //for integer variables
		double grade;	// the grade, entered by user
//		int average; // integer devision of total by gradeCounter //for integer variables
		double average; // integer devision of total by gradeCounter
		final int STUDENT_NUMBER;

		//initialization
		total = 0;
		gradeCounter = 1;
		STUDENT_NUMBER = 5;

		//Processing
		while(gradeCounter <= STUDENT_NUMBER) {
			// prompt for a grade
			System.out.print("Please enter your grade: ");
			grade = console.nextDouble();
			// add the grade to total
			total = total + grade; // is equal to total =+ grade
			// increment gradeCounter by 1
			gradeCounter ++; // is equal to gradeCounter = gradeCounter +1
		} // end loop while

		// Processing
		average = total / STUDENT_NUMBER;

		// Termination phase
		// display total and the average of grades
//		System.out.printf("%nTotal of all grades is %d%n", total);  //for integer variables
//		System.out.printf("%nThe average of all grades is %d%n", average); //for integer variables

		System.out.printf("%nTotal of all grades is %e%n", total);
		System.out.printf("%nThe average of all grades is %e%n", average);
	}
}
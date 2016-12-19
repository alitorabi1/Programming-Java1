/*
**********************************
* Programming Exercises 1 *
* Programming I *
* Author: Ali Torabi *
* Due Date: 14 April 2016 *
**********************************
*/
import java.util.*;

public class Exercise1 {
	static Scanner console = new Scanner(System.in);
		public static void main(String[] args){
		double grade;

		System.out.println("Enter num1: ");
		grade = console.nextDouble();

		if(grade >=90)
			System.out.println("Congratulation, you passed the exam and your grade is: A");
		if(grade >=80 && grade<90 )
			System.out.println("You passed the exam and your grade is: B");
		if(grade >=70 && grade<80 )
			System.out.println("You passed the exam and your grade is: C");
		if(grade >=60 && grade<70 )
			System.out.println("You passed the exam and your grade is: D");
		else
			System.out.println("You failed the exam.");

	}
}

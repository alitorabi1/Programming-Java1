/*
**********************************
* Programming Exercises 3 *
* Programming I *
* Author: Ali Torabi *
* Due Date: 15 April 2016 *
* 2. Write a program that prompts the user to input three numbers. The program should then output the numbers in nondescending order.
**********************************
*/
import java.util.Scanner; //class uses class Scanner
// using counter-controlled repetition
public class Exercise2 {
	public static void main(String[] args){
		// declaration
		Scanner console = new Scanner(System.in); //to obtain input from command window
		double a, b, c, min, max, med;//assume values are there for a b c

		//initialization
		a = 0;
		b = 0;
		c = 0;

		//Processing
		System.out.print("Please enter the first number: "); // prompt for a number
		a = console.nextDouble();
		System.out.print("Please enter the second number: "); // prompt for a number
		b = console.nextDouble();
		System.out.print("Please enter the third number: "); // prompt for a number
		c = console.nextDouble();

		if( a > b ){
		 if( a > c ){
  		max = a;
		  if( b > c ){
		   med = b;
		   min = c;
		  }else{
		   med = c;
		   min = b;
		  }
		 }else{
		  med = a;
		  if( b > c ){
		   max = b;
		   min = c;
		  }else{
		   max = c;
		   min = b;
		  }
		 }
		}else{
		 if( b > c ){
		  max = b;
		  if( a > c ){
		   med = a;
		   min = c;
		  }else{
		   med = c;
		   min = a;
		  }
		 }else{
		  med = b;
		  max = c;
		  min = a;
		 }
		}

		System.out.println(max + " " + med + " " + min);
		 // end loop while
	}
}
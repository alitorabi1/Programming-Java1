/*
**********************************
* Programming Exercises 3 *
* Programming I *
* Author: Ali Torabi *
* Due Date: 15 April 2016 *
* 3. Write a program that prompts the user to input an integer between 0 and 35. If the number is less than or equal to 9, the program should output the
*	number; otherwise, it should output A for 10, B for 11, C for 12, . . ., and Z for 35. (Hint: Use the cast operator, (char)( ), for numbers >= 10.)
**********************************
*/
import java.util.Scanner; //class uses class Scanner
// using counter-controlled repetition
public class Exercise3 {
	public static void main(String[] args){
		// declaration
		Scanner console = new Scanner(System.in); //to obtain input from command window
		int num, numChar ;

		//initialization
		num = 0;
		//Processing
		System.out.print("Please enter a number between 0 and 35: "); // prompt for a number
		num = console.nextInt();
		if(num <= 9)
			System.out.println(num);
		else {
			numChar = num + 55;
			System.out.println((char)(numChar));
		}
		 // end loop while
	}
}
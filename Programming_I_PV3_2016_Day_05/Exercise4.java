/*
**********************************
* Programming Exercises 3 *
* Programming I *
* Author: Ali Torabi *
* Due Date: 15 April 2016 *
* 4. The statements in the following program are in incorrect order.
Rearrange the statements so that it prompts the user to input the shape type
(rectangle, circle, or cylinder), and the appropriate dimension of the shape.
The program then outputs the following information about the shape:
For a rectangle, it outputs the area and perimeter; for a circle,
it outputs the area and circumference; and for a cylinder, it outputs the volume and surface area.
After rearranging the statements, your program should be properly indented.
**********************************
*/
import java.util.Scanner; //class uses class Scanner
// using counter-controlled repetition
public class Exercise4 {
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
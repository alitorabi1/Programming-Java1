/*
**********************************
* Programming Exercises 3 *
* Programming I *
* Author: Ali Torabi *
* Due Date: 12 April 2016 *
**********************************
*/
import java.util.*;

public class Ch2_PrExercise5 {
	static Scanner console = new Scanner(System.in);
		public static void main(String[] args){
		int width;

		System.out.print("Enter the length: ");
		width = console.nextInt();
		System.out.println();
		int length, area, perimeter;

		System.out.print("Enter the width: ");
		length = console.nextInt();

		System.out.println();

		area = length * width;
		perimeter = 2 * (length + width);

		System.out.println("Area = " + area);
		System.out.println("Perimeter = " + perimeter);

	}
}

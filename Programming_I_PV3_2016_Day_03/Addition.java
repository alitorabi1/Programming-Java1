// Addition.java.
// This program illustrates how input two numbers and then displays the sum.
import java.util.Scanner; // program uses class Scanner

//Class declaration
public class Addition {
	//main method begins execution of java application
	public static void main(String[] args) {
	// 1. Declaration phase:
	// Create a Scanner object (instance) that obtains input from
	// the command window
	// SYNTAX: Class_name object_name = new Class_name();
		Scanner scanner = new Scanner(System.in) ;
		int firstNumber = 0 ; // first number
		int secondNumber = 0 ; // second number
		System.out.println("Enter your first number: ");
		firstNumber = scanner.nextInt(); // user enteres number
		System.out.println("Enter your  second number: ");
		secondNumber = scanner.nextInt(); // second enteres number
		System.out.println("The sum of integers " + firstNumber + " and " + secondNumber + " is: " + ( firstNumber + secondNumber)) ;

		double firstDNumber = 0 ; // first number
		double secondDNumber = 0 ; // second number
		System.out.println("Enter your first number: ");
		firstDNumber = scanner.nextDouble(); // user enteres number
		System.out.println("Enter your  second number: ");
		secondDNumber = scanner.nextDouble(); // second enteres number
		System.out.println("The sum of Double numbers " + firstDNumber + " and " + secondDNumber + " is: " + ( firstDNumber + secondDNumber)) ;

	}//end main method
}
//end class Addition
//AliTorabi_Test_1.java

// a. Write a Java statement that imports the class Scanner.
import java.util.Scanner; //class uses class Scanner

/*
**********************************
* Author: Ali Torabi *
* Due Date: 20 April 2016 *
**********************************
*/
// Class declaration
public class AliTorabi_Test_1 {
	// main method begins execution of java application
	public static void main(String[] args){
		// declaration
		// b. Write a Java statement that declares console to be a Scanner object for inputting data from the standard input device.
		Scanner console = new Scanner(System.in); //to obtain input from command window

		//c. Write Java statements that declare and initialize the following named constants: SECRET of type int initialized to 11; RATE of type double initialized to 12.50.
		//d. Write Java statements that declare the following variables: num1, num2, and newNum of type int; name of type String; hoursWorked and wages of type double.
		final int SECRET;
		final double RATE;
		int num1, num2, newNum;
		String name;
		double hoursWorked, wages;

		// initialization
		SECRET = 11;
		RATE = 12.50;

		// Processing and outprint
		// e. Write Java statements that prompt the user to input two integers and store the first number into num1 and the second number into num2.
		System.out.print("Please enter the first number: "); // prompt for the first number
		num1 = console.nextInt();
		System.out.print("Please enter the second number: "); // prompt for the second number
		num2 = console.nextInt();

		// f. Write a Java statement(s) that outputs the value of num1 and num2, indicating which is num1 and which is num2. For example, if num1 is 8 and num2 is 5, then the output is:
		// The value of num1 = 8 and the value of num = 5.
		System.out.println("The value of num1 = " + num1 + " and the value of num2 = " + num2);

		// g. Write a Java statement that multiplies that value of num1 by 2, adds the value of num2 to it, and then stores the result in newNum. Then write a Java statement that outputs the value of newNum.
		newNum = (num1 * 2) + num2;
		System.out.println("The value of newNum = " + newNum);

		// h. Write a Java statement that updates the value of newNum by adding the value of the named constant SECRET. Then, write a Java statement that outputs the value of newNum with an appropriate message.
		newNum = newNum + SECRET;
		System.out.println("Now the result of newNum + SECRET = " + newNum);

		// i. Write Java statements that prompt the user to enter a person’s last name and then store the last name into the variable name.
		System.out.print("Please enter the last name: "); // prompt for a person’s last name
		name = console.next();

		// j. Write Java statements that prompt the user to enter a decimal number between 0 and 70 and then store the number entered into hoursWorked.
		System.out.print("Please enter a decimal number between 0 and 70: "); // prompt for a number
		hoursWorked = console.nextDouble();

		// k. Write a Java statement that multiplies that value of the named constant RATE with the value of hoursWorked and stores the result into the variable wages.
		wages = RATE * hoursWorked;

		/*
		l. Write Java statements that produce the following output:
		Name: 		//output the value of the variable name
		Pay Rate: $ 	//output the value of the named constant RATE
		Hours Worked: 	//output the value of the variable hoursWorked
		Salary: $ 	//output the value of the variable wages
		*/
		System.out.println("Name: " + name); //output the value of the variable name
		System.out.printf("Pay Rate: $%5.2f\n", RATE); //output the value of the named constant RATE
		System.out.printf("Hours Worked: %5.2f\n", hoursWorked); //output the value of the variable hoursWorked
		System.out.printf("Salary: $%5.2f\n", wages); //output the value of the variable wages
	} // end of main method
} //end of class

/**
 * Programming Assignment 01
 *
 * Ali_Torabi_PV3_A2 class calculates a customer’s bill for a local cable company.
 * There are two types of customers: residential and business.
 * There are two rates for calculating a cable bill: one for
 * residential customers and one for business customers.
 * state information includes:
 * <ul>The inputs:
 * <li>customer’s account number
 * <li>customer code
 * <li>number of premium channels to which the customer subscribes
 * <li>in the case of business customers, the number of basic service connections
 * <ul>The output:
 * <li>Customer’s account number
 * <li>billing amount
 *
 * @author      Ali Torabi
 * @version     1.0
 * @since		19 April 2016
 */

/*
1. Prompt the user to enter the account number
2. Get the customer account number
3. Prompt the user to enter the customer code
4. Get the customer code
5. If the customer code is r or R:
a. Prompt the user to enter the number of premium channels
b. Get the number of premium channels
c. Calculate the billing amount
d. Print the account number
e. Print the billing amount
6. If the customer code is b or B:
a. Prompt the user to enter the number of basic service connections
(420-PV3-AB) Introduction to OOP Assignment 02
Due Date: No later than the beginning of class 6 (as per schedule)
Certificate Program in Internet Programming & Development Page 4 of 4
L a s t U p d a t e d : A p r i l 1 7 , 2 0 1 6
b. Get the number of basic service connections
c. Prompt the user to enter the number of premium channels
d. Get the number of premium channels
e. Calculate the billing amount
f. Print the account number
g. Print the billing amount
7. If the customer code is something other than r, R, b, or B,
output an error message For Steps 5 and 6, the program uses
switch statement to calculate the bill for the desired customer.
(You can also use if…else statement to implement Steps 5 and 6.)
*/


import java.util.Scanner; // This class uses class Scanner

public class Ali_Torabi_PV3_A2 {

	//main method begins execution of class Ali_Torabi_PV3_A2.java
	public static void main(String[] args) {

		// Create a Scanner object (instance) that
		// obtains input from the command window
		Scanner console = new Scanner(System.in);
		//Declare variables
		final double R_BILL_PROC_FEE = 4.50;
		final double R_BASIC_SERV_COST = 20.50;
		final double B_BILL_PROC_FEE= 15.00;
		final double B_BASIC_SERV_COST = 75.00;
		final double B_BASIC_CONN_COST = 5.00;
		final double R_COST_PREM_CHANNEL = 50.00;
		Scanner scanner = new Scanner(System.in) ;
		int accountNumber; // A variable to store customer’s account number
		String customerType; // A variable to store customer code
		int noOfBasicServConn; // A variable to store number of basic service connections to which the customer subscribes
		int noOfPremChannels; // A variable to store the number of premium channels to which the customer subscribes
		double amountDue; // A variables to store the billing amount

		System.out.println("This program computes a cable bill. "); // Program definition
		System.out.print("Enter the account number: "); // Prompting user to enter the account number
		accountNumber = scanner.nextInt(); // Get accountNumber
		System.out.print("Enter the customer type: R 0r r (Residential), B or b (Business): "); // Prompting user to enter customerType
		customerType = scanner.next(); // Get customerType
		System.out.print("Enter the number of basic service connections: "); // Prompting user to enter noOfBasicServConn
		noOfBasicServConn = scanner.nextInt(); // Get noOfPremChannels
		System.out.print("Enter the number of premium channels: "); // Prompting user to enter noOfPremChannels
		noOfPremChannels = scanner.nextInt(); // Get noOfPremChannels

		// If the number of basic service connections is less than or equal to 10,
		// the cost of basic service connections is fixed.
		// If the number of basic service connections exceeds 10,
		// you must add the cost for each connection over
		if (noOfBasicServConn <= 10) {
			amountDue = R_BILL_PROC_FEE + R_BASIC_SERV_COST + noOfPremChannels * R_COST_PREM_CHANNEL;
		} else {
			amountDue = B_BILL_PROC_FEE + B_BASIC_SERV_COST	+ noOfBasicServConn * B_BASIC_CONN_COST;
		}


		// Echo the input by outputting what the program read as input
		System.out.println("Account number:  " + accountNumber);
		// Output the length in inches
		System.out.println("Amount due: $" + amountDue);
	} //end main method
} //end class Ali_Torabi_PV3_A2

/*
This program computes a cable bill.
Enter the account number: 12345
Enter the customer type: R 0r r (Residential), B or b (Business): b
Enter the number of basic service connections: 16
Enter the number of premium channels: 8
Account number: 12345
Amount due: $520.00
*/
import java.util.Scanner; // This class uses class Scanner

/**
 * Programming Assignment 02
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
 * @since		20 April 2016
 */

public class Ali_Torabi_PV3_A2 {

	//main method begins execution of class Ali_Torabi_PV3_A2.java
	public static void main(String[] args) {

		// Create a Scanner object (instance) that obtains input from the command window
		Scanner scanner = new Scanner(System.in);
		//Declaration of constants and variables
		final double R_BILL_PROC_FEE = 4.50;
		final double R_BASIC_SERV_COST = 20.50;
		final double R_COST_PREM_CHANNEL = 7.50;
		final double B_BILL_PROC_FEE= 15.00;
		final double B_BASIC_SERV_COST = 75.00;
		final double B_BASIC_CONN_COST = 5.00;
		final double B_COST_PREM_CHANNEL = 50.00;

		int accountNumber; // A variable to store customer’s account number
		String customerType; // A variable to store customer Type
		int noOfBasicServConn; // A variable to store number of basic service connections to which the customer subscribes
		int noOfPremChannels; // A variable to store the number of premium channels to which the customer subscribes
		double amountDue = 0; // A variables to store the billing amount

		System.out.println("**************** This program computes a cable bill. ****************"); // Program definition
		System.out.println();

		// 1. Prompt the user to enter the account number
		System.out.print("Enter the account number: "); // Prompting user to enter the account number
		// 2. Get the customer account number
		accountNumber = scanner.nextInt(); // Get accountNumber
		// 3. Prompt the user to enter the customer code
		System.out.print("Enter the customer type: R 0r r (Residential), B or b (Business): "); // Prompting user to enter customerType
		// 4. Get the customer code
		customerType = scanner.next(); // Get customerType

		// 5. If the customer code is r or R:
		if(customerType.equals("r") || customerType.equals("R")) {
			// 5.a. Prompt the user to enter the number of premium channels
			System.out.print("Enter the number of premium channels: "); // Prompting user to enter noOfPremChannels
			// 5.b. Get the number of premium channels
			noOfPremChannels = scanner.nextInt(); // Get noOfPremChannels
			// 5.c. Calculate the billing amount
			amountDue = R_BILL_PROC_FEE + R_BASIC_SERV_COST + noOfPremChannels * R_COST_PREM_CHANNEL;
		}
		// 6. If the customer code is b or B:
		else if(customerType.equals("b") || customerType.equals("B")) {
			// 6.a. Prompt the user to enter the number of basic service connections
			System.out.print("Enter the number of basic service connections: "); // Prompting user to enter noOfBasicServConn
			// 6.b. Get the number of basic service connections
			noOfBasicServConn = scanner.nextInt(); // Get noOfPremChannels
			// 6.c. Prompt the user to enter the number of premium channels
			System.out.print("Enter the number of premium channels: "); // Prompting user to enter noOfPremChannels
			// 6.d. Get the number of premium channels
			noOfPremChannels = scanner.nextInt(); // Get noOfPremChannels
			// 6.e. Calculate the billing amount
			// If the number of basic service connections is less than or equal to 10,
			// the cost of basic service connections is fixed.
			if (noOfBasicServConn <= 10) {
				amountDue = B_BILL_PROC_FEE + B_BASIC_SERV_COST + noOfPremChannels * B_COST_PREM_CHANNEL;
			} else { // If the number of basic service connections exceeds 10, you must add the cost for each connection over 10.
				amountDue = B_BILL_PROC_FEE + B_BASIC_SERV_COST	+ noOfPremChannels * B_COST_PREM_CHANNEL + (noOfBasicServConn - 10) * B_BASIC_CONN_COST;
			}
		}
		else{
			System.out.print("You entered: " + customerType + " , Please enter the customer type: R 0r r (Residential), B or b (Business): "); // Prompting user again to enter customerType
		}

		// Print the account number
		System.out.println("Account number: " + accountNumber);
		// Print the billing amount
		System.out.printf("Amount due: $%5.2f\n", amountDue);

	} //end main method
} //end class Ali_Torabi_PV3_A2

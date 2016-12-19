// CustomerTest1.java
import java.util.Scanner; //class uses class Scanner

/*
**********************************
* Author: Ali Torabi *
* Due Date: 19 April 2016 *
**********************************
*/
// Class declaration
public class CustomerTest1 {
		// main method begins the execution java application
	public static void main(String[] args) {
		// declaration datamembers or attributes
		Scanner console = new Scanner(System.in); //to obtain input from command window
		// declaration an instance of class Customer
		Customer firstCustomer = new Customer();
		//declare variables to contain attribute values retrieved
		String customerName, customerAddress, customerPhoneNumber;

		// invoce or run set accessor methods to populate attributes
		System.out.print("Please enter the name: "); // prompt for the name
		firstCustomer.setName(console.nextLine());

		System.out.print("Please enter the address: "); // prompt for the address
		firstCustomer.setAddress(console.nextLine());

		System.out.print("Please enter the phone number: "); // prompt for the phone number
		firstCustomer.setPhoneNumber(console.nextLine());

		customerName = firstCustomer.getName();
		customerAddress = firstCustomer.getAddress();
		customerPhoneNumber = firstCustomer.getPhoneNumber();

		//print the values
		System.out.println("The name of customer is: " + customerName);
		System.out.println("The address of customer is: " + customerAddress);
		System.out.println("The phone number of customer is: " + customerPhoneNumber);
	} // end main method
} // end class CustomerTest1

// CustomerTest3.java
/*
**********************************
* Author: Ali Torabi *
* Due Date: 19 April 2016 *
**********************************
*/
// Class declaration
public class CustomerTest3 {
		// main method begins the execution java application
	public static void main(String[] args) {
		// declaration an instance of class Customer
		NewCustomer firstCustomer, secondCustomer, thirdCustomer;
		// initialize customer instances
		firstCustomer = new NewCustomer("Eleanor", "Atlanta", "123-4567");
		secondCustomer = new NewCustomer("Mike", "Boston", "456-7891");
		thirdCustomer = new NewCustomer("Joan", "St. Luiss", "789-1234");

		//print the values
		System.out.println("The customer 1 is: " + firstCustomer.getName());
		System.out.println("The customer 2 is: " + secondCustomer.getName());
		System.out.println("The customer 3 is: " + thirdCustomer.getName());

		System.out.println();

		System.out.println("The customer 1 is: " + firstCustomer.getAddress());
		System.out.println("The customer 2 is: " + secondCustomer.getAddress());
		System.out.println("The customer 3 is: " + thirdCustomer.getAddress());
	} // end main method
} // end class CustomerTest3

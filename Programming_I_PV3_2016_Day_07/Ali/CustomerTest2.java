// CustomerTest2.java
/*
**********************************
* Author: Ali Torabi *
* Due Date: 19 April 2016 *
**********************************
*/
// Class declaration
public class CustomerTest2 {
		// main method begins the execution java application
	public static void main(String[] args) {
		// declaration an instance of class Customer
		Customer firstCustomer, secondCustomer, thirdCustomer = new Customer();
		// initialize customer instances
		firstCustomer = new Customer();
		secondCustomer = new Customer();
		thirdCustomer = new Customer();

		String customerName1, customerName2, customerName3;

		// invoce or run set accessor methods to populate attributes
		firstCustomer.setName("Eleanor");
		firstCustomer.setAddress("Atlanta");
		firstCustomer.setPhoneNumber("123-4567");

		secondCustomer.setName("Mike");
		secondCustomer.setAddress("Boston");
		secondCustomer.setPhoneNumber("456-7891");

		thirdCustomer.setName("Joan");
		thirdCustomer.setAddress("St. Luiss");
		thirdCustomer.setPhoneNumber("789-1234");

		customerName1 = firstCustomer.getName();
		customerName2 = secondCustomer.getName();
		customerName3 = thirdCustomer.getName();

		//print the values
		System.out.println("The name of customer is: " + customerName1);
		System.out.println("The name of customer is: " + customerName2);
		System.out.println("The name of customer is: " + customerName3);
	} // end main method
} // end class CustomerTest2

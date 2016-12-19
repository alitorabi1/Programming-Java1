// Customer.java

import java.util.Scanner; //class uses class Scanner

/*
**********************************
* Author: Ali Torabi *
* Due Date: 19 April 2016 *
**********************************
*/
// Class declaration
public class Customer {
		// declaration datamembers or attributes
		Scanner console = new Scanner(System.in); //to obtain input from command window
		private String name;
		private String address;
		private String phoneNumber;

		//declare the setter methods
		public void setName(String newName){
			this.name = newName; //this, refers to the active object
		} // end method setName
		public void setAddress(String newAddress){
			this.address = newAddress; //this, refers to the active object
		} // end method setName
		public void setPhoneNumber(String newPhoneNumber){
			this.phoneNumber = newPhoneNumber; //this, refers to the active object
		} // end method setName

		//declare the getter methods
		public String getName(){
			return name;
		} // end method getName
		public String getAddress(){
			return address;
		} // end method getName
		public String getPhoneNumber(){
			return phoneNumber;
		} // end method getName
}// end class Customer

/*
 * Name - Neeraj Kumar Bansal
 * Course - CST8132_301
 * Assessment - Lab2
 * Lab Professor - Dr. Anu Thomas
 */
package Banking_System;   //Package with specific classes information

public class Person {    //Person class for storing credentials details
	
	private String firstName;     //instance variables
	private String lastName;
	private String email;
	private long phoneNumber;
	
	Person(){} //non-arg constructor
	
	Person(String fName,String lName,String email, long ph ){  //parameterized constructor
		firstName = fName;
		lastName = lName;
		this.email = email;
		phoneNumber = ph;
	}
	
	public String getName() {           //accessor for name
		return firstName + " " + lastName;
	}
	
	public String getEmail() {        //accessor for email
		return email;
	}
	
	public long getPhoneNumber() {    //accessor phone number
		return phoneNumber;
	}
	
}//exit class
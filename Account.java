/*
 * Name - Neeraj Kumar Bansal
 * Course - CST8132_301
 * Assessment - Lab2
 * Lab Professor - Dr. Anu Thomas
 */
package Banking_System;    //Package with specific classes information

import java.util.Scanner;  //java API class for input

public class Account {   //class for account details
	
	protected long accNumber;
	private Person accHolder;    //object for importing person class
	protected double balance;
	
	Account(){}                //no-arg constructor
	
	Account(long accountNumber, String n1, String n2, String email, long ph, double money){    //parametrized constructor
		accNumber = accountNumber;
		accHolder = new Person(n1, n2, email, ph);
		balance = money;
	}
	
	public void readAccountDetails(Scanner input) {    //method to person's details
		
		System.out.println("Enter account number: ");
		accNumber = input.nextLong();
		input.nextLine();                            //fushes \n
		System.out.print("Enter first name: ");
		String fName = input.nextLine();
		System.out.print("Enter last name: ");
		String lName = input.nextLine();
		System.out.print("Enter email: ");
		String email = input.nextLine();
		System.out.print("Enter phone number: ");
		long ph = input.nextInt();
		accHolder = new Person(fName, lName, email, ph);     //store entered values according place and type
		System.out.print("Enter balance: ");
		balance = input.nextDouble();
	}
	
	public void displayAccount() {       //method to display account details or ouput
		System.out.printf("%11d | %20s | %21s | %25d | %11.2f \n", accNumber, accHolder.getName(), accHolder.getEmail(), accHolder.getPhoneNumber(), balance);
	}
	
	public void updateBalance() {    //method to update account balance
		System.out.print("Updating the balance of " + accNumber + "\n");
	}

}//exit class
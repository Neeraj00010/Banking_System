/*
 * Name - Neeraj Kumar Bansal
 * Course - CST8132_301
 * Assessment - Lab2
 * Lab Professor - Dr. Anu Thomas
 */
package Banking_System;       //Package with specific classes information

import java.util.Scanner;       //java API class for input

public class Bank{          //Bank class inherits account class
	
	private static String name;
	private int numAccounts;
	private Account []accounts;       //accounts array to account holder details
	
	Bank(){}             //no-arg constructor
	
	Bank(String name, int numAccounts){         //parameterized constructor
		this.name = name;
		this.numAccounts = 0;                  //initialized value of variable
		
		accounts = new Account[numAccounts];       //object with argument
	}
	
	public void readAccount(Scanner input) {           //method to read account details
		
		if (numAccounts > 0 && numAccounts == accounts.length) {            //print statement, if array length reach entered length for array
			System.out.print("**** Maximum limit reached, cannot add more accounts ****\n");
			}
		
		else {
			while(true) {     //boolean value to continue repeating the loop infinite times
				
		    System.out.print("1. Chequing\n2. Savings \nEnter account type: ");
			int type = input.nextInt();                     //local variable to store input value
			
			if(type == 1 && numAccounts < accounts.length) {
				accounts[numAccounts] = new Chequing();           //Class to proceed, if condition is true
				accounts[numAccounts].readAccountDetails(input);  //method to process in Account class and store details in Chequing class
				break;
			}
			
			else if(type == 2 && numAccounts < accounts.length) {
				accounts[numAccounts] = new Savings();             //Class to proceed, if condition is true
				accounts[numAccounts].readAccountDetails(input);   //method to process in Account class and store details in Savings class
				break;          //exit statement imidiately, if above condition is true
			}
			else {
				System.out.print("Invalid input! Re-enter the value, please.\n");
			}
			
			}  //exit while loop
			
			numAccounts++;    //increment numAccount variable vallue everytime loop execute again
			
	}//exit else statement
		
	} //exit method
	
	public void runMonthlyProcess(Scanner input) {     //method to process account details
			
		if(accounts[0] == null) 
				System.out.print("**** No accounts to process ****\n");

				else {
				for(int i = 0; i < accounts.length; i++) { //index variable
					if(accounts[i] != null) {
					   accounts[i].updateBalance();   //method to process in respective to entered details in Chequing and Savings class 
					}//end if statement
					}//end for loop
	           }//exit else statement
	}//exit method
	
	public void displayAccount(Scanner input) {   //method to display account details
		
		if(accounts[0] == null)
			System.out.print("**** No accounts to display ****\n");
		
		else {
			printStar();  //execute method
		    System.out.println(); 
			printTitle();
			for(int i = 0; i < accounts.length; i++)  //index variable
				if(accounts[i] != null) {
	                 accounts[i].displayAccount();  //method to display output in respective to entered details in Chequing and Savings class 
				}//end if statement
				}//exit else statement
	}//exit method
	
	static void printStar() {
		
		for(int i = 100; i>=0; i--)   //print linear stars
			System.out.print("*");
	}//exit method
	
	static void printTitle() {
		
		String space = "";              //local String type variable for formatting
		System.out.printf("%39s BANK", name);
		System.out.println();
		printStar();    //method to print stars
		System.out.println(); 
		System.out.printf("Acc Number  | %15sName  | %15sEmail  | %12sPhone Number  | %5sBalance", space, space, space, space);
		System.out.println();
		printStar();    //method to print stars
        System.out.println(); 
	}//exit method
	
}//exit class
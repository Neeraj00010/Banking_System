/*
 * Name - Neeraj Kumar Bansal
 * Course - CST8132_301
 * Assessment - Lab2
 * Lab Professor - Dr. Anu Thomas
 */
package Banking_System;     //Package with specific classes information

import java.util.Scanner;     //java API class for input

public class BankTest {          //class for Testing program

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);        //input object for taking inputs from user
		
		System.out.print("Enter the name of the bank: ");
		String name = input.nextLine();                //instance variable for storing string input
		
		System.out.print("How many account holders do you have: ");
		int num = input.nextInt();          //instance variable for storing integer input
		
		Bank b = new Bank(name, num);      //object to import Bank class with 2 parameters
		
		while(true) {              //boolean value to continue repeating the loop infinite times
			
			System.out.print("1. Read Accounts \n2. Run monthly process \n3. Display Accounts \n4. Exit \nEnter your option: ");
			int option = input.nextInt();   //local variable store number which to continue
			
			if(option == 1)
				b.readAccount(input);         //method to read with object, if condition is true
			
			else if(option == 2)
				b.runMonthlyProcess(input);   //method to process with object, if condition is true
			
			else if(option == 3)
				b.displayAccount(input);      //method to dispaly with object, if condition is true
			
			else if (option == 4){
				System.out.print("Goodbye... Have a nice day!");   //print statement, if condition is true
			break;                                              //exit statement imidiately, if above condition is true
			}
			
			else                                //print statement, if above conditions is false
				System.out.println("Invalid input... Try a valid number!");
		}//exit while
		
	}//exit main method
}//exit class
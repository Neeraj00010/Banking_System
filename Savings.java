/*
 * Name - Neeraj Kumar Bansal
 * Course - CST8132_301
 * Assessment - Lab2
 * Lab Professor - Dr. Anu Thomas
 */
package Banking_System;     //Package with specific classes information

public class Savings extends Account{   //Savings class inherits Account class
	
	private double interestRate;   //instance variable
	
	Savings(){       //no-arg constructor
		this.interestRate = 0.0399;  //initializing value for instance variable
	}
	
	@Override
	public void updateBalance() {   //polymorphism method with super.method
		super.updateBalance();
		balance = balance + balance*interestRate/12;
	}//exit method
	
}//exit class
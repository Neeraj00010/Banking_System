/*
 * Name - Neeraj Kumar Bansal
 * Course - CST8132_301
 * Assessment - Lab2
 * Lab Professor - Dr. Anu Thomas
 */
package Banking_System;    //Package with specific classes information

public class Chequing extends Account{  //Chequing class inherits Account class
	
	private double fees;  //instance variable
	
	Chequing(){    //no-arg constructor
		this.fees = 13.50;  //initializing value for instance variable
	}
	
	@Override
	public void updateBalance() {  //polymorphism method with super.method
		super.updateBalance();
		balance = balance - fees;
	}//exit method

}//exit class
package com.ualbany.hw1.problem3;

public class CheckingBankAccount {
	
	private double value;
	
	public CheckingBankAccount() {
		this.value = 0.00;
	}
	
	public void deposit(double amount) {
		value += amount;
		System.out.println("Current Balance: $" + value);
	}
	
	public void withdraw(double amount) {
		double valueTemp = value;
		value -= amount;
		
		if (value < 0.0) {
			value = valueTemp;
			System.out.println("Insufficient Funds");
		} else {
			System.out.println("Current Balance: $" + value);
		}	
	}
	
}

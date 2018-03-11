package com.ualbany.hw1.problem3;

public class Bank {

	private String name;
	private Address bankAddress;
	
	public Bank(String line1, String line2, String city, String state, String zip, String name) {
		this.bankAddress = new Address(line1, line2, city, state, zip);
		this.name = name;
	}
	
	public void printAddress() {
		System.out.println(name);
		bankAddress.printAddress();
	}
	
	public String getName() {
		return name;
	}
	
	public static void main (String[] args) {
		
		Person testMan = new Person("123 Marmont Street", "", "Albany", "New York", "12345", "Rob", "Rose");
		Bank testBank = new Bank("456 Barmont Street", "", "Albany", "New York", "12222", "Sefcu Bank");
		
		testMan.OpenAccount(testBank, 1000);
		
		System.out.println("\nDeposit another $1000\n");
		
		testMan.deposit(1000);
		
		System.out.println("\nWithdraw $500\n");
		
		testMan.withdraw(500);
	}
}

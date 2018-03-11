package com.ualbany.hw1.problem3;

public class Person {

	private CheckingBankAccount account;
	private Address address;
	private String first, last;
	private Bank current;
	
	public Person(String line1, String line2, String city, String state, String zip, String first, String last) {
		this.address = new Address(line1, line2, city, state, zip);
		this.first = first;
		this.last = last;
	}
	
	public void OpenAccount(Bank bank, double initial) {
		
		this.current = bank;
		account = new CheckingBankAccount();
		
		System.out.println(first + " " + last + " opened an account at " + current.getName());
		this.deposit(initial);
		
	}

	public void printAddress() {
		System.out.println(first + " " + last);
		address.printAddress();
	}
	
	public void withdraw(double amount) {
		this.printAddress();
		account.withdraw(amount);
	}
	
	public void deposit(double amount) {
		this.printAddress();
		account.deposit(amount);
	}
	
}

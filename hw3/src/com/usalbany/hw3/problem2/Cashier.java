package com.usalbany.hw3.problem2;

public class Cashier extends Person {

	private int sandwitchCost;
	private int totalCash;
	
	public Cashier(String name, int sandwitchCost) {
		super(name);
		this.totalCash = 0;
		this.sandwitchCost = sandwitchCost;
	}

	public boolean charge(Customer payee, SandwitchMaker maker) {
		if (payee.pay(sandwitchCost)) {
			if (maker.makeSandwitch()) {
				payee.incrementSandwitch(); totalCash += sandwitchCost;
				System.out.println("Payment Sucessful!");
				return true;
			} else {
				System.out.println("SandwitchMaker ran out of supplies");
				return false;
			}
		} else {
			System.out.println("Payee does not have enough money...");
			return false;
		}
	}
	
	public String toString() {
		
		return "Cashier Name : \"" + name + "\" Total Cash : \"$" + totalCash + "\"";
	
	}
	
}

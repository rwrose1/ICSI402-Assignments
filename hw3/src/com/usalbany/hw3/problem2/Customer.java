package com.usalbany.hw3.problem2;

public class Customer extends Person {

	private int sandwitch;
	private int totalCash;
	
	public Customer(String name, int totalCash) {
		super(name);
		this.sandwitch = 0;
		this.totalCash = totalCash;
	}

	public boolean pay(int price) {
		totalCash -= price;
		
		if (totalCash >= 0) {
			return true;
		} else {
			totalCash += price;
			return false;
		}
		
	}
	
	public void incrementSandwitch() {
		sandwitch++;
	}
	
	public String toString() {
		
		return "Customer Name : \"" + name + "\" Total Cash : \"$" + totalCash + "\" Sandwitch # : \"" + sandwitch + "\"";
	
	}
	
}

package com.usalbany.hw3.problem2;

public class SandwitchDriver {

	public static void main(String args[]) {
		
		SandwitchMaker steve = new SandwitchMaker("Steve", 7, 3, 4);
		Cashier tom = new Cashier("Tom", 5);
		Customer Lilly = new Customer("Lilly", 20);
		
		System.out.println("Simulating a customer buying as many sandwitches as possible...\n");
		
		while (tom.charge(Lilly, steve)) {
			System.out.println(Lilly.toString());
			System.out.println(tom.toString());
			System.out.println(steve.toString());
			System.out.println("");
		}
		
		System.out.println("\n... Sandwitch simulation terminated.");
		
	}
	
}

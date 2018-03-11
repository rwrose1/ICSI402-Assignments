package com.ualbany.hw2.problem3;

public class FuelGauge {

	private int fuel;
	
	public FuelGauge() {
		fuel = 0;
	}
	
	public int getFuel() {
		return fuel;
	}
	
	public void fill() {
		if (fuel < 15) {
			fuel++;
			System.out.println("Filling up. Car now has " + fuel + " Gallons");
		} else {
			System.out.println("Car is all filled up");
		}
	}
	
	public void use() {
		if (fuel > 0) {
			fuel--;
			System.out.println("Using up fuel.");
		} else {
			System.out.println("Fuel is all used up");
		}
	}	
	
}

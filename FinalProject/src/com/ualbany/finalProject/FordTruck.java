package com.ualbany.finalProject;

import java.util.Random;

public class FordTruck extends Car {

	//Creates a new FordTruck, setting the name of the car to FordTruck, and setting tireP
	//to a random value, from -2 to 8. Both boolean values are made true
	public FordTruck() {
		super("FordTruck");
		Random rand = new Random();
		this.tireP = 2 + (int) rand.nextInt(10);
		this.oilChanged = true;
		this.softwareInst = true;
	}
	
}

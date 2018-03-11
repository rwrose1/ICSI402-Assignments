package com.ualbany.finalProject;

import java.util.Random;

public class FordBroken extends Car {
	
	//Generates a purposely broken car, to demonstrate inspector works
	//The oils not changed, the tire pressure is off, and Software is not
	//installed
	public FordBroken() {
		super("FordBroken");
		Random rand = new Random();
		this.tireP = -10 + (int) rand.nextInt(10);
		this.oilChanged = false;
		this.softwareInst = false;
	}
	
}

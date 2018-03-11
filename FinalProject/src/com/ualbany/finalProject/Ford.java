/**
 * 
 */
package com.ualbany.finalProject;

import java.util.Random;

public class Ford extends Factory<Car> {

	//Creates a FordTruck
	public Car getTruck() {
		return new FordTruck();
	}
	
	//Creates a FordBroken (ALWAYS FAILS INSPECTION)
	public Car getBroken() {
		return new FordBroken();
	}

	//Randomly returns a broken or unbroken car
	public Car get() {
		
		//The random class
		Random rand = new Random();
		int faulty = (int)rand.nextInt(2); //sets faulty to 1 or 0

		//if 1, return a broken car, else return the non faulty one.
		if (faulty == 1) {
			return getBroken();
		} else {
			return getTruck();
		}
	}
	
}

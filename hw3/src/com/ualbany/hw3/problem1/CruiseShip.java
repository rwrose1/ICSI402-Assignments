package com.ualbany.hw3.problem1;

public class CruiseShip extends Ship {

	private int maxPassengers;
	
	public CruiseShip(String name, String year, int maxPassengers) {
		super(name, year);
		
		this.maxPassengers = maxPassengers;
	}
	
	public String toString() {
		
		return "Ship name : \"" + name + "\" year : \"" + year + "\" max passengers : \"" + maxPassengers + "\"";
		
	}
	
}

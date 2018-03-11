package com.ualbany.hw3.problem1;

public class CargoShip extends Ship {

	private int maxTonnage;
	
	public CargoShip(String name, String year, int maxTonnage) {
		super(name, year);
		this.maxTonnage = maxTonnage;
	}
	
	public String toString() {
		
		return "Ship name : \"" + name + "\" year : \"" + year + "\" max tonnage : \"" + maxTonnage + "\"";
		
	}
	
	
}

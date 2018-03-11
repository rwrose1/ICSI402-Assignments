package com.ualbany.hw3.problem1;

public class Ship {

	protected String name;
	protected String year;
	
	public Ship(String name, String year) {
		
		this.name = name;
		this.year = year;
		
	}

	public String toString() {
		
		return "Ship name : \"" + name + "\" year : \"" + year + "\"";
		
	}
	
}

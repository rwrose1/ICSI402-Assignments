package com.usalbany.hw3.problem2;

public class SandwitchMaker extends Person {

	private int lettuce;
	private int tomatoes;
	private int bacon;
	
	public SandwitchMaker(String name, int lettuce, int tomatoes, int bacon) {
		super(name);
		this.lettuce = lettuce;
		this.tomatoes = tomatoes;
		this.bacon = bacon;
	}

	public boolean makeSandwitch() {
		
		lettuce--;
		if (lettuce < 0) { return false;  }
		tomatoes--;
		if (tomatoes < 0) { return false; }
		bacon--;
		if (bacon < 0) { return false; }
		
		return true;
		
	}
	
	public String toString() {
		
		return "Sandwitch Maker Name : \"" + name + "\" Lettuce : \"" + lettuce + "\" + Tomatoes : \"" + tomatoes + "\" Bacon : \"" + bacon + "\"";
	
	}
	
}

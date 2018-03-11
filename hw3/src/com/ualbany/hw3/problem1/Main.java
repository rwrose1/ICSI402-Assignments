package com.ualbany.hw3.problem1;

public class Main {

	public static void main(String args[]) {
		
		Ship array[] = new Ship[10];
		
		//I did this because it would be faster than typing out and thinking of all the
		//names
		for (int i = 0; i < array.length; i++) {
			if ((i % 2) == 0) {
				array[i] = new CruiseShip(("Cruise " + i), ("199" + i), i + 100);
			} else if ((i % 3) == 0) {
				array[i] = new CargoShip(("Cargo " + i), ("199" + i), i * 100 + i);
			} else {
				array[i] = new Ship(("Ship " + i), ("199" + i));
			}
		}

		for (int i = 0; i < array.length; i++) {	
			System.out.println(array[i].toString());
		}
		
	}
	
}

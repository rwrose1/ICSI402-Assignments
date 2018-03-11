package com.ualbany.hw2.problem3;

public class Odometer {
	
	private static int mileage;
	public static FuelGauge carFuel;
	
	public Odometer(FuelGauge car) {
		carFuel = car;
		mileage = 0;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public static void travel() {
		mileage++;
		if (mileage % 22 == 0) {
			if (carFuel.getFuel() != 0) {
				carFuel.use();
				} else {
				System.out.println("Out of gas");
				mileage--;
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		
		FuelGauge guage = new FuelGauge();
		
		for (int i = 0; i < 17; i++) {
			guage.fill();
		}
		
		Odometer odom = new Odometer(guage);
		
		boolean flag = true;
		
		while (flag) {
			odom.travel();
			System.out.println("Current miles: " + mileage + " Current Fuel: " + guage.getFuel());
			if (guage.getFuel() == 0) {
				flag = false;
			}
		}
		
	}
	
}

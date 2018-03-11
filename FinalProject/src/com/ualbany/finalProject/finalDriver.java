package com.ualbany.finalProject;

public class finalDriver {

	public static void main(String args[]) {
		
		//Initializing variables
		Ford fordFactory = new Ford();
		Audi audiFactory = new Audi();
		
		Outlet<Car> fordOutlet = new Outlet<Car>(fordFactory); 
		Outlet<Car> audiOutlet = new Outlet<Car>(audiFactory);
		
		Car audiCar;
		Car fordCar;
		
		Inspector inspector = new Inspector();
		
		//Print the rules inspector follows
		//NOTE: The way each car is set up makes it so that they can either pass OR 
		//fail, because tireP is generated randomly. The only DEFINITIVE failure on one of the cars
		//would be if the fordCar printed out fordBroken as a title.
		//You can run it a few times, and see for yourself that each car will pass and fail, 
		//with adherence to the rules printed.
		System.out.println("In Order to Pass inspection a car must have a tire pressure\n"
						 + "between 1 and 10, a oilChanged value of True and a softwareInst\n"
						 + "value of True. Anything but that fails the inspection.\n");
		//Print values and set a value for fordCar
		System.out.println("New Ford Car = " + (fordCar = fordOutlet.get()));
		
		//If the inspection passes, print the car passed. If not, print it failed
		if (inspector.inspect(fordCar)) {
			System.out.println("The Ford Car Passes!");
		} else {
			System.out.println("The Ford Car Fails!");
		}
		
		//Print values and set a value for audiCar
		System.out.println("\nNew Audi Car = " + (audiCar = audiOutlet.get()));
		
		//If the inspection passes, print the car passed. If not, print it failed
		if (inspector.inspect(audiCar)) {
			System.out.println("The Audi Car Passes!");
		} else {
			System.out.println("The Audi Car Fails!");
		}
		
	}
	
}

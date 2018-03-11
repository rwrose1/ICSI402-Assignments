package com.ualbany.finalProject;

public class Audi extends Factory<Car> {

	//This returns a new AudiR car 
	@Override
	Car get() {
		return new AudiR();
	}

	
	
}

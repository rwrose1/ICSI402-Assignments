package com.ualbany.finalProject;

public class Car {

	//Protected variables, for the subclasses.
	protected int tireP;
	protected boolean oilChanged;
	protected boolean softwareInst;
	protected String name;
	
	//Creates a car
	public Car(String name) {
		
		this.name = name;
		
	}
	
	//gets tireP
	public int getTireP() {
		return tireP;
	}
	
	//gets oilChanged
	public boolean getOil() {
		return oilChanged;
	}
	
	//gets softwareInst
	public boolean getSoftware() {
		return softwareInst;
	}
	
	//gets Name
	public String nameGet() {
		return name;
	}
	
	//The toString method
	public String toString() {
		return name + " " + tireP + " oilChanged " + oilChanged + " softwareInst " + softwareInst;
	}
	
	
}
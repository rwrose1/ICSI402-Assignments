package com.ualbany.finalProject;

public class Outlet<T> {
	
	//Variables
	T thing;
	
	//Sets thing to what the factory returns
	public Outlet(Factory<T> factory) {
		this.thing = factory.get();
	}
	
	//This returns thing
	public T get() {
		return thing;
	}
	
	//The toString method
	public String toString() {
		return thing.toString();
	}
	
}

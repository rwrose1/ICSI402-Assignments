package com.ualbany.hw1.problem3;

public class Address {

	private String line1, line2, city, state, zip;
	
	public Address(String line1, String line2, String city, String state, String zip) {
		this.setLine1(line1);
		this.setLine2(line2);
		this.setCity(city);
		this.setState(state);
		this.setZip(zip);
	}

	public void printAddress() {
		System.out.println(line1 + line2 + "\n" + city + ", " + state +"\n" + zip);
	}
	
	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	

	
}

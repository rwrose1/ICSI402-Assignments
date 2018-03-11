package com.ualbany.hw1.problem1;

public class Employee {

	private String first, last;
	private double salary;
	
	
	//Employee Constructor
	public Employee(String first, String last, double salary) {
		
		this.setFirst(first);
		this.setLast(last);
		
		//If salary < 0.0, set salary to 0 and return.
		if (salary < 0.0) {
			
			this.setSalary(0);
			return;
			
		}
		
		this.setSalary(salary);
		
	}

	//Getters/Setters
	public double getSalary() {
		
		return salary;
		
	}

	public void setSalary(double salary) {
		
		this.salary = salary;
	
	}

	public String getFirst() {
	
		return first;
	
	}

	public void setFirst(String first) {
	
		this.first = first;
	
	}

	public String getLast() {
	
		return last;
	
	}

	public void setLast(String last) {
		
		this.last = last;
	
	}
	
}

package com.ualbany.hw1.problem1;

public class EmployeeTest {
	
	public static void main(String args[]) {
		
		String firstOne = "Tom", firstTwo = "Bob";
		String lastOne = "Hildersburg", lastTwo = "Bildersburg";
		double salaryOne = 1200.00, salaryTwo = 1300.00;
		
		Employee one = new Employee(firstOne, lastOne, salaryOne);
		Employee two = new Employee(firstTwo, lastTwo, salaryTwo);
		
		System.out.println(one.getFirst() + " " + one.getLast() + "'s salary before the 10% raise is " + one.getSalary());
		System.out.println(two.getFirst() + " " + two.getLast() + "'s salary before the 10% raise is " + two.getSalary());
		
		one.setSalary((one.getSalary() * .10) + one.getSalary());
		System.out.println("\nCalculating raise\n");
		two.setSalary((two.getSalary() * .10) + two.getSalary());
		
		System.out.println(one.getFirst() + " " + one.getLast() + "'s salary after the 10% raise is " + one.getSalary());
		System.out.println(two.getFirst() + " " + two.getLast() + "'s salary after the 10% raise is " + two.getSalary());
		
	}
	
}

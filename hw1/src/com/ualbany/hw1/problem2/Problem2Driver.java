package com.ualbany.hw1.problem2;

import java.io.*;

public class Problem2Driver {

	public static HW1Problem2 methods = new HW1Problem2();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter an integer");
		int first = Integer.parseInt(br.readLine());
		System.out.println("Enter another integer");
		int second = Integer.parseInt(br.readLine());
		
		if (methods.multiple(first, second)) {
			System.out.println("Your first int is divisable by the second one\n");
		} else {
			System.out.println("Your first int isn't divisable by the second one\n");
		}
		
		System.out.println("Enter an integer");
		first = Integer.parseInt(br.readLine());
		
		System.out.println(methods.reminder(first) + " is the remainder of " + first + " and 7.\n");
		
		System.out.println("Enter your first x value");
		double x1 = Integer.parseInt(br.readLine());
		System.out.println("Enter your first y value");
		double y1 = Integer.parseInt(br.readLine());
		System.out.println("Enter your second x value");
		double x2 = Integer.parseInt(br.readLine());
		System.out.println("Enter your second y value");
		double y2 = Integer.parseInt(br.readLine());
		
		System.out.println("The distance between your two points is " + methods.distance(x1, y1, x2, y2) + "\n");
		
		System.out.println("BONUS: Simulated coin flips");
		methods.coinFlip();
		
	}
	
}

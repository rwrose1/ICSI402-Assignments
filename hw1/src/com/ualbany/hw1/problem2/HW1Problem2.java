package com.ualbany.hw1.problem2;

import java.math.*;
import java.util.Random;

public class HW1Problem2 {
	
	private Random rand = new Random();
	
	public boolean multiple(int first, int second) {
		
		if ((first % second) == 0) {
			return true;
		}
		
		return false;
	}
	
	public int reminder(int first) {
		
		return first % 7;
	
	}
	
	public double distance(double x1, double y1, double x2, double y2) {
		
		double distance = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		return distance;
		
	}
	
	public void coinFlip() {
		
		int heads = 0;
		int tails = 0;
		
		for (int i = 0; i < 10; i++) {
			
			int decider = rand.nextInt(10) % 2;
			
			if (decider == 0) {
				System.out.println("Heads");
				heads++;
			} else {
				System.out.println("Tails");
				tails++;
			}
			
		}
		
		System.out.println("Heads: " + heads + " Tails: " + tails);

	}	
}

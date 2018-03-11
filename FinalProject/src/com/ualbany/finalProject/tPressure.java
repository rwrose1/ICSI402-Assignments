package com.ualbany.finalProject;

public class tPressure {
	
	//Checks if the tireP is valid
	public boolean check(int tireP) {
		//If tireP is within the range of 1 and 10, return true
		if (tireP >= 1 && tireP <= 10) return true;
		
		//Else, return false
		else return false;
	}

}

package com.ualbany.finalProject;

public class Inspector {
	
	//Initialize check classes
	private tPressure pressure = new tPressure();
	private OilChecker oil = new OilChecker();
	private SoftwareCheck software = new SoftwareCheck();
	
	public boolean inspect(Car carCheck) {
		
		//If pressure.check returns false, return false
		if (!pressure.check(carCheck.getTireP())) return false;
		
		//If oil.check returns false, return false
		if (!oil.check(carCheck.getOil())) return false;
		
		//If software.check returns false, return false
		if (!software.check(carCheck.getSoftware())) return false;
		
		//Else, the car passes, return true
		return true;
	}
	
}

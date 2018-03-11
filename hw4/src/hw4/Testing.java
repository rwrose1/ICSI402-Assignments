package hw4;

import java.util.ArrayList;

public class Testing {

	public static void main(String args[]) {
		
		/* BinaryWord Test */
		
		System.out.println("BinaryWord Test...");
		
		BinaryWord bwTest = new BinaryWord("00101001");
		
		System.out.println(bwTest);
		
		/* PositiveInteger Test */
		
		System.out.println("\nPositiveInteger Test...");
		
		PositiveInteger piTest = new PositiveInteger(5);
		PositiveInteger piTest2 = new PositiveInteger(6);
		ArrayList<PositiveInteger> testPI = new ArrayList<PositiveInteger>();
		testPI.add(piTest);
		testPI.add(piTest2);
		testPI.add(new PositiveInteger(50));
		
		System.out.println(piTest + "\n" + piTest2);
		
		System.out.println("Summed " + piTest.operator(piTest2));
		
		System.out.println("Combination : " + piTest.combine(testPI));
		
		/* RGBColor Test */
		
		System.out.println("\nRGBColor Test...");
		
		RGBColor rgbTest = new RGBColor(32, 96, 128);
		RGBColor rgbTest2 = new RGBColor(0, 99, 255);
		
		ArrayList<RGBColor> testRGB = new ArrayList<RGBColor>();
		testRGB.add(rgbTest);
		testRGB.add(rgbTest2);
		testRGB.add(rgbTest.complement());
		
		System.out.println(rgbTest + "\n" + rgbTest2);
		
		System.out.println("Operation : " + rgbTest.operator(rgbTest2));
		System.out.println("Complement of Operation: " + rgbTest.operator(rgbTest2).complement());
		System.out.println("Combination : " + rgbTest.combine(testRGB));
	
	}
	
}

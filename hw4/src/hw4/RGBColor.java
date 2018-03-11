package hw4;

import java.util.ArrayList;

public class RGBColor extends SemiGroup<RGBColor> implements Complementable<RGBColor> {

	/*
	   RGB INDEX
	   0 is Red 
	   1 is Green
	   2 is Blue   
	*/
	private Integer RGB[] = new Integer[3];
	
	public RGBColor(int red, int green, int blue) {
		
		RGB[0] = new Integer(red);
		RGB[1] = new Integer(green);
		RGB[2] = new Integer(blue);
		
	}
	
	public RGBColor operator(RGBColor operated) {
		int red = (this.RGB[0].intValue() + operated.getRed().intValue()) / 2;
		int green = (this.RGB[1].intValue() + operated.getGreen().intValue()) / 2;
		int blue = (this.RGB[2].intValue() + operated.getBlue().intValue()) / 2;
		
		return new RGBColor(red, green, blue);
	}
	
	public Integer getRed() {
		// TODO Auto-generated method stub
		return this.RGB[0];
	}
	
	public Integer getGreen() {
		// TODO Auto-generated method stub
		return this.RGB[1];
	}
	
	public Integer getBlue() {
		// TODO Auto-generated method stub
		return this.RGB[2];
	}

	@Override
	public RGBColor complement() {
		// TODO Auto-generated method stub
		return new RGBColor((255 - this.RGB[0].intValue()), (255 - this.RGB[1].intValue()), (255 - this.RGB[2].intValue()));
	}

	public String toString() {
		return "[" + RGB[0] + "/" + RGB[1] + "/" + RGB[2] + "]";
	}
	
	public RGBColor combine(ArrayList<RGBColor> collection) {
		RGBColor combined = collection.get(0);
		
		for (int i = 0; i < collection.size(); i++) {
			combined = combined.operator(collection.get(i));
		}
		
		return combined;
	}

	
}

package hw4;

import java.util.ArrayList;

public class PositiveInteger extends SemiGroup<PositiveInteger> {
	
	//ArrayList<Integer> collection;
	
	private Integer PositiveInt;
	
	public PositiveInteger(int posInt) {
		
		PositiveInt = new Integer(posInt);
		
	}
	
	public PositiveInteger operator(PositiveInteger two) {
		
		return new PositiveInteger(this.PositiveInt.intValue() + two.getInteger().intValue());
		
	}
	
	public Integer getInteger() {
		return PositiveInt;
	}
	
	public String toString() {
		
		String retString = "PositiveInteger : " + PositiveInt.intValue();
		
		return retString;
		
	}
	
	public PositiveInteger combine(ArrayList<PositiveInteger> collection) {
		PositiveInteger combined = new PositiveInteger(0);
		
		for (int i = 0; i < collection.size(); i++) {
			combined = combined.operator(collection.get(i));
		}
		
		return combined;
	}

}

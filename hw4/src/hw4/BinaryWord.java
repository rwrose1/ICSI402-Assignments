package hw4;

import java.util.BitSet;

public class BinaryWord implements Complementable<BitSet> {

	private BitSet binWord;
	private BitSet complement;
	private int len;
	
	public BinaryWord(String binary) {
		
		len = binary.length();
		binWord = new BitSet(len);
		
		for (int i = 0; i < len; i++) {
			if (binary.charAt(i) == '1') {
				binWord.set(i);
			}
		}
		
		complement = complement();
		
	}
	
	@Override
	public BitSet complement() {
		BitSet retComp = new BitSet(len);
		
		for (int i = 0; i < len; i++) {
			if (!binWord.get(i)) {
				retComp.set(i);
			}
		}
		
		return retComp;
	}
	
	public String toString() {
		
		String stringWord = "BinWord    : ";
		
		for (int i = 0; i < len; i++) {
			if (binWord.get(i)) {
				stringWord += "1";
			}
			else {
				stringWord += "0";
			}
		}
		
		stringWord += "\nComplement : ";
		
		for (int i = 0; i < len; i++) {
			if (complement.get(i)) {
				stringWord += "1";
			}
			else {
				stringWord += "0";
			}
		}
		
		return stringWord;
		
	}

}

package com.ualbany.hw2.problem2;

import java.util.*;

/*
 * Converts a string to a morse code sequence using a hashmap, initialized in
 * the constructor.
 */

public class MorseConverter {

	private static HashMap<String, String> morseMap;
	//An array of values of a-z and 0-9, containing the "key" to the morse converter.
	private String key[] = {".-", 
			"-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
			"---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",
			"-----",".----","..---","...--","....-",".....","-....","--...","---..","----."};
/*
 * 	The strategy I used to store the morse code is simple, I used a HashMap called morseMap, 
 * 	and a String array called key. In the constructor for the conversion class, I use two for loops,
 * 	one calls a method called addLetters, which adds all the letters to the morseMap with
 * 	their corresponding key
 *  value (stored in the "key" string). The second uses the addNumber function,
 * 	which does the same thing except with numbers.
 */
	public MorseConverter() {
		
		morseMap = new HashMap<String, String>();
		int i = 0;
		
		for(char a = 'a'; a <= 'z'; a++) {
			addLetters(a, key[i]);
			i++;
		}
		
		for (char num = '0'; num <= '9'; num++) {
			addNumbers(num, key[i]);
			i++;
		}

	}
	
	//
	private void addLetters(char lowerCase, String morseCode) {
		String upperCase = (char)('A' - 'a' + lowerCase) + "";
		morseMap.put("" + lowerCase, morseCode);
		morseMap.put("" + upperCase, morseCode);
	}
	
	private void addNumbers(char number, String morseCode) {
		morseMap.put(number+"", morseCode);
	}
	
	public String convertTo(String toBeConverted) {
		
		String converted = "";
		for (char c : toBeConverted.toCharArray()) {
			
			if (containsKey(c))
				converted += morseMap.get(c+"").toString() + " ";
		}
		
		return converted;
	}
	
	private static boolean containsKey(char c) {
		String m = morseMap.get(c+"");
		if (m == null) {
			return false;
		}
		return true;
	}
	
}

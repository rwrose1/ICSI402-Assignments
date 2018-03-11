package com.ualbany.hw2.problem2;

import java.io.*;

public class Main {

	
	//Main method. If args == 0, then the user will input text to the console. 
	//If args > 0, then the program will print all the arguments.
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MorseConverter morse = new MorseConverter();
		String buffer;
		String result;
		boolean flag = true;
		
		System.out.println("This program converts standart ascii text to International Morse Code.");
		
		if (args.length != 0) {
			System.out.println("Printing out the " + args.length + " command line argument[s]");
			for (int i = 0; i < args.length; i++) {
				buffer = args[i];
				result = morse.convertTo(buffer);
				System.out.println(result);
			}
		} else {
			
			while (flag) {
				System.out.print("Enter a string to be converted to morse code.\n"
							   + "(To exit, just press enter)\n");
				buffer = br.readLine();
				if (buffer.isEmpty()) {
					flag = false;
					continue;
				}
					
				result = morse.convertTo(buffer);
				System.out.println(result);
			}
		}
		
	}
	
}

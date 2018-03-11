package com.ualbany.hw5;

import java.util.regex.*;
import java.io.*;

public class GREPhandler implements Runnable {
	
	protected BufferedReader br;
	protected String regex;
	protected int end, start;
	
	public GREPhandler(String fileName, String regex, int start, int end) throws IOException {
		
		//Necessary initializations
		
		br = new BufferedReader(new FileReader(fileName));
		
		this.start = start;
		this.end = end;
		this.regex = regex;
		
		//Sets file pointer to appropriate spot
		for (int i = 1; i <= start; i++) {
			br.readLine();
		}
		
	}
	
	@Override
	public void run() {
		//System.out.println("DONE START " + getStart());
		
		String line; //Line buffer 
		int count = start;
		
		//Try to catch IO Errors
		try {
			//While BR != null and count <= end
			while (((line = br.readLine()) != null) && count <= end ) {
				
				//System.out.println(line);
				
				//If handleLine catches a match
				if (this.handleLine(line, (count+1))) {
					//System.out.println("CAUGHT");
					System.out.println((count+1) + ": " + line);
				}
				count++; //Increment count
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public boolean handleLine(String line, int lineNumber) {
		
		Pattern regexPattern = Pattern.compile(regex); //Pattern used to detect the regex expression regex
		Matcher finder = regexPattern.matcher(line); //A matcher that finds if line matches the regex
		
		//If finder returns true return true, else return false
		if (finder.find()) {
			return true;
		}
		return false;
	}
	
}

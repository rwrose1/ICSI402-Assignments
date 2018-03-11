package com.ualbany.hw5;

import java.io.IOException;
import java.util.ArrayList;

public class GREPhandlerTwo extends GREPhandler implements Runnable {

	private ArrayList<String> lines = new ArrayList<String>(); //To hold all lines in the second thread
	
	public GREPhandlerTwo(String fileName, String regex, int start, int end) throws IOException {
		super(fileName, regex, start, end);
		// TODO Auto-generated constructor stub
	}
	
	//Run
	public void run() {
		
		//System.out.println("DONE START " + getStart());
	
		String line; //Line buffer
		int count = start; //Sets count to start
		
		//Try to catch IO error
		try {
			//While line is not null and count is not greater than end
			while (((line = br.readLine()) != null) && count <= end ) {
				
				//System.out.println(line);
				
				//If handle line catches a match
				if (handleLine(line, (count+1))) {
					//System.out.println("CAUGHT");
					lines.add((count + 1) + ": " + line);
				}
				count++; //Increment counts
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	//Prints the rest of the variables
	public void printRest() {
		for (int i = 0; i < lines.size(); i++) {
			System.out.println(lines.get(i));
		}
	}
	
}

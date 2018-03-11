package com.ualbany.hw5;

import java.io.*;

public class GREP {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Start time calculation
		long startTime = System.currentTimeMillis();
		
		if (args[0].equals("-n")) {
		
			//Creates BufferedReader br for reading file
			BufferedReader br = new BufferedReader(new FileReader(args[2]));
			int halfPoint, end;
			
			double count;
			
			count = 0; //The count to calculate the halfway point and end
			
			while ((br.readLine()) != null) {
				//System.out.println(line);
				count+=1;
			}
			
	
			//Halfpoint is the ceiling count / two
			double halved = count / 2;
			halfPoint = (int) Math.ceil(halved);
			//end = count
			end = (int)count;
			
			//System.out.println(end + " " + halfPoint);
			
			//System.out.println("HalfPoint = " + halfPoint + " end is " + end);
			
			
			//Create GREPhandlers
			GREPhandler one = new GREPhandler(args[2], args[1], 0, halfPoint - 1);
			GREPhandlerTwo two = new GREPhandlerTwo(args[2], args[1], halfPoint, end);
			
			//Create Threads
			Thread oneT = new Thread(one);
			Thread twoT = new Thread(two);
			
			//Start Threads
			oneT.start();
			twoT.start();
			
			//Join threads
			oneT.join();
			twoT.join();
			
			System.out.println("Thread 2");
			//Print the rest of the lines
			two.printRest();
		
		} else {
			System.out.println("Invalid flag (\"-n\" expected as first argument as per the directions)");
		}
		//Finish time calculation
		long endTime = System.currentTimeMillis();
		
		//Print the time
		System.out.println("Parellel Time (in millisec) : " + (endTime - startTime));
		
		
	}
	
}

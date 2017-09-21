package SeatMap;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * 
 * @author george-patterson
 * 
 *
 */

// September 7, 2017


public class SeatMap {
	int count = 0;
	
	public void readFile(String filename) { 
		String[] names = {};
		//String[][] seatingChart = {};
	    	
	    	try {
				File inputFile = new File("names.dat");
				Scanner input = new Scanner(inputFile);
		
				
				while (input.hasNext()) {
					names[count] = input.next();
					count++;
				}

				// output results
				System.out.println("There are " + count + " people in the theater.");
				input.close();
			} catch (IOException e) {
				System.err.println("IOException in reading input file!!!");
			}
	    } 
	
	public void populateArray() {
		int i=9;
			while (count%i != 0) {
				i--;
			}
	}
	
	public String getSeat() {
		return "foo";
	}
	
	public static void main(String[] args) {
		SeatMap mySeatMap;
		mySeatMap=new SeatMap();
		System.out.println(mySeatMap.getSeat());
		//mySeatMap.readFile();
	}
	
	

}

//	Exercise 1.1: The following program presents problems, find which ones and use 
//	all the means to display the 2 instructions, in particular using the exception mechanism 
//	(by the way, where does the getClass() method come from?)


package TryCatchExo;

import java.sql.Date;

public class FoundException {
	
	public static void main(String[] args) {
		Date date = null;  // attribute date created and null "reference" is affected to it "empty reference"
		Date today = new Date(0); //new date "object" is instantiated and assigned to "variable" today class Date
		
		try {
		System.out.println(date.getClass().getName());
		}catch(Exception e) { System.out.println("Something went wrong");}

}	
	

}



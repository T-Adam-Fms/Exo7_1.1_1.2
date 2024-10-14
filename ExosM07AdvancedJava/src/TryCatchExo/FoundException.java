//	Exercise 1.1: The following program presents problems, find which ones and use 
//	all the means to display the 2 instructions, in particular using the exception mechanism 
//	(by the way, where does the getClass() method come from?)


//package TryCatchExo;
//
//import java.sql.Date;
//
//public class FoundException {
//	
//	public static void main(String[] args) {
//		Date date = null;  // attribute date created and null "reference" is affected to it "empty reference"
//		Date today = new Date(0); //new date "object" is instantiated and assigned to "variable" today class Date
//		
//		try {
//		System.out.println(date.getClass().getName());
//		}catch(Exception e) { System.out.println("Something went wrong");}
//
//}	
//
//}

package TryCatchExo;

import java.sql.Date;

public class FoundException {
    public static void main(String[] args) {
        Date date = null;  // attribute date created and null "reference" is affected to it "empty reference"
        Date today = new Date(0); // new date "object" is instantiated and assigned to "variable" today class Date

        try {
            // Check if date is null before calling getClass()
            if (date == null) {
                throw new NullPointerException("The date reference is null.");
            }
            System.out.println(date.getClass().getName());  // This line won't execute if date is null
        } catch (NullPointerException e) {
            // Catch block for handling NullPointerException
            System.out.println("Something went wrong: " + e.getMessage());
        } catch (Exception e) {
            // Catch block for handling any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        // Display the current date (this is valid and will always execute)
        System.out.println("Today's date: " + today);
    }
}

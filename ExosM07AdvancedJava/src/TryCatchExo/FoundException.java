//	Exercise 1.1: The following program presents problems, find which ones and use 
//	all the means to display the 2 instructions, in particular using the exception mechanism 
//	(by the way, where does the getClass() method come from?)


package TryCatchExo;

public class FoundException {
	
	public static void main(String[] args) {
		
		try {
		Date date = null;  // attribute date created and null "reference" is affected to it "empty reference"
		Date today = new Date(); //new date "object" is instantiated and assigned to "variable" today class Date
		}catch(Exception e) { System.out.println("Something went wrong");}

		try {
		System.out.println(date.getClass().getName());
		}catch(Exception e) { System.out.println("Something went wrong");}
		
		try {
		System.out.println(date.getClass().getName());
		}catch(Exception e) { System.out.println("Something went wrong");}

}	
	

}
//
//Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
//	Date cannot be resolved to a type
//	Date cannot be resolved to a type
//	Date cannot be resolved to a type
//
//	at TryCatckExo.FoundException.main(FoundException.java:13)

//*************************************************************

//Using an uninitialized date variable:
//
//    The date variable is initialized to null, which means that it does not refer to any object.
//    When calling date.getClass().getName() a NullPointerException will be thrown 
//	  because date is null and you are trying to access a method on a null reference.
//
//Potential error importing the Date class://
//    You need to import the Date class from the java.util.Date package (or java.sql.Date if that's what you want to use). Otherwise, a compilation error will occur because Java will not know which Date class it is.
//
//getClass() method://
//    The getClass() method is a method inherited from the Object base class in Java. Any class 
//    in Java implicitly inherits from the Object class, which allows any instance to access the getClass() method.



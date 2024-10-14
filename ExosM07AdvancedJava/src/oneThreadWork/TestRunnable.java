package oneThreadWork;

public class TestRunnable implements Runnable { 
    private int number; // Variable to hold the number 

    // Constructor to initialize the number
    public TestRunnable(int number) { 
        this.number = number; 
    }

    @Override 
    public void run() { 
        // Print the number followed by dashes
        System.out.print(number + " "); // Print the number
        
        // Print dashes based on the number
        for (int j = 0; j < number; j++) {
            System.out.print("-"); // Print the dashes
        }
        System.out.println(); // Move to the next line after printing
    } 
}
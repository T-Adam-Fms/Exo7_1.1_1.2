package threadWork;

import java.util.ArrayList;
import java.util.List;

public class TestRunnable implements Runnable {
    private static final Object lock = new Object(); // Lock object for synchronization
    private static final List<Integer> numbers = new ArrayList<>(); // Shared list for numbers
    private int number; // Number to print

    public TestRunnable(int number) {
        this.number = number; 
        synchronized (lock) {
            // Add the number to the static list upon construction
            if (!numbers.contains(number)) {
                numbers.add(number);
            }
        }
    }

    @Override 
    public void run() {
        synchronized (lock) {
            // Print the number followed by dashes
            System.out.print(number + " "); // Print the number
            
            // Print dashes based on the number
            for (int j = 0; j < number; j++) {
                System.out.print("-"); // Print the dashes
            }
            System.out.println(); // Move to the next line
        }

        // Introduce a random sleep time to create a mixed order
        try {
            Thread.sleep((long) (Math.random() * 500)); // Sleep for a random time up to 500 milliseconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupt status
        }
    } 
}
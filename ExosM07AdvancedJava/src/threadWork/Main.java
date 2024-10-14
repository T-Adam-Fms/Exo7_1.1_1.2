package threadWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) { 
        // Initialize the list of numbers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        // Shuffle the list to randomize the order of execution
        Collections.shuffle(numbers);

        // Create and start threads
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            // Create a new thread for each number
            threads[i] = new Thread(new TestRunnable(numbers.get(i))); 
            threads[i].start(); 
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    } 
}

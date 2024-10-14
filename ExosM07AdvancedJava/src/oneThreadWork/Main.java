package oneThreadWork;

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

        // Create a StringBuilder to collect results
        StringBuilder result = new StringBuilder();

        // Create and start threads
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            final int number = numbers.get(i);
            threads[i] = new Thread(() -> {
                // Append number and dashes to result
                synchronized (result) {
                    result.append(number); // Append the number
                    for (int j = 0; j < number; j++) {
                        result.append("-"); // Append the dashes
                    }
                }
            });
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

        // Print the final result
        System.out.println(result.toString());
    } 
}
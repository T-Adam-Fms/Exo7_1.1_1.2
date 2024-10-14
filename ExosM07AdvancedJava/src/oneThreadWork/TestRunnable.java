package oneThreadWork;

package threadWork;

import threadWork.TestRunnable;

public class TestRunnable implements Runnable { 
	
	private char symbol; // Single variable to hold the symbol public TestRunnable(char symbol) {
		this.symbol = symbol; } 

	@Override 
	public void run() { 
		for (int i = 0; i < 10; i++) { 
			System.out.print(symbol); 
			try { 
				Thread.sleep(500); // Pause for half a second 
				} catch (InterruptedException e) { 
					System.out.println(e.getMessage()); } 
			} System.out.println(); 
			// Move to the next line after printing symbols 
			} 
	
}

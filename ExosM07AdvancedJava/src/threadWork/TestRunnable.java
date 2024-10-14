package threadWork;

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
			} public static void main(String[] args) { Thread thread1 = new Thread(new TestRunnable('*')); Thread thread2 = new Thread(new TestRunnable('#')); Thread thread3 = new Thread(new TestRunnable('%')); thread1.start(); thread2.start(); thread3.start(); } } 
		}
	
}
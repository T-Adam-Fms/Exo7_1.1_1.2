package threadWork;

public class Main {

	public static void main(String[] args) {
		// create runnable objects
		Runnable r1 = new TestRunnable ('*');
		Runnable r2 = new TestRunnable ('§');
		Runnable r3 = new TestRunnable ('&');
		Runnable r4 = new TestRunnable ('@');
		Runnable r5 = new TestRunnable ('(');
		
		// run them in separate threads
		new Thread (r1).start();
		new Thread (r2).start();
		new Thread (r3).start();
		new Thread (r4).start();
		new Thread (r5).start();		
		
	}
	

}

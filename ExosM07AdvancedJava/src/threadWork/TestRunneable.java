package threadWork;


class TestRunnable implements Runnable{

		private char symbol;
		
		public TestRunnable (char symbol) {
			this.symbol = symbol;
		}
		
		@Override
		public void run(){
			for (int i =0; i < 5 ; i++) {
				System.out.print(symbol);
				try {
					Thread.sleep(100); 					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(); // new line after each symbol
		}
		
		
		


}

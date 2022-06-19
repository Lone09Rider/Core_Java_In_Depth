package Interrupt;


public class App {
	
	static public int balance = 0;
	public void withdraw(int amount) {
		synchronized (this) {
			if (balance <=0)
			{
				try {
					System.out.println("Waiting for Balance Updation");
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println("Thread Interuptted");
				}
			} 
		}
		balance -= amount;
		System.out.println("Withdrawal Successful");
	}
	public static void main(String[] args) {
		
		App app = new App();
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				app.withdraw(1000);
				
			}
		});
		thread.start();
		if (balance <= 0) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			thread.interrupt();
		}
		
	}

}


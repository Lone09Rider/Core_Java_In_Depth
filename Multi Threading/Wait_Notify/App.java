package Wait_Notify;


public class App {
	
	static public int balance = 0;
	public void withdraw(int amount) {
		synchronized (this) {
			if (balance <=0)
			{
				try {
					System.out.println("Waiting for Balance Updation");
					wait(6000);;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		}
		balance -= amount;
		System.out.println("Withdrawal Successful");
	}
	
	public void deposit(int amount) {
		System.out.println("We are Depositing ......");
		balance += amount;
		synchronized (this) {
			notify();
		}
	}
	
	public static void main(String[] args) {
		
		App app = new App();
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				app.withdraw(1000);
				
			}
		});
		thread.setName("Thread 1");
		thread.start();
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				app.deposit(10000);
				
			}
		});		
		thread2.setName("Thread 2");
		thread2.start();
		
	}

}

package Synchronization_under_Concurrency;

public class App {
	public static int counter = 0;

	public static void main(String[] args) throws InterruptedException {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					App.counter += 1;
				}
				System.out.println("Loop in Thread 1 is Over");
			}
		});
		
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					App.counter += 1;
				}
				System.out.println("Loop in Thread 2 is Over");
			}
		});

		thread.start();
		thread1.start();
		Thread.sleep(2000);
		System.out.println("Value of Counter is : " + App.counter);
	}

}

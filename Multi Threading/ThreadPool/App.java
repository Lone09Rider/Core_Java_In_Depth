package ThreadPool;

class SomeThread extends Thread {
	private String name;

	public SomeThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Starting Thread : " + name);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Running thread : " + name);
	}

}

public class App {

	public static void main(String[] args) {
		SomeThread thread1 = new SomeThread("Thread 1");
		SomeThread thread2 = new SomeThread("Thread 2");
		SomeThread thread3 = new SomeThread("Thread 3");
		SomeThread thread5 = new SomeThread("Thread 5");
		SomeThread thread9 = new SomeThread("Thread 9");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread5.start();
		thread9.start();
	}

}

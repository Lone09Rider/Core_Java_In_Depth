package Synchronization_under_Concurrency.Syncronized_Block;

class Brackets {
	private Object lock = "lock";
	// Can only work for one type of thread object multiple times
	public void genrate() {
//		Synchronized Block
		synchronized (lock) 
		{
			
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i <= 5) {
					System.out.print("[");
				} else {
					System.out.print("]");
				}
			}
			System.out.println();
		
		}

		for (int j = 0; j <= 10; j++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class App {

	public static void main(String[] args) {

		Brackets bracket = new Brackets();

		new Thread(new Runnable() {

			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for (int i = 1; i <= 5; i++) {
					bracket.genrate();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Total Time " + (endTime - startTime));
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				long startTime1 = System.currentTimeMillis();

				for (int i = 1; i <= 5; i++) {
					bracket.genrate();
				}
				long endTime1 = System.currentTimeMillis();
				System.out.println("Total Time " + (endTime1 - startTime1));
			}
		}).start();

	}

}

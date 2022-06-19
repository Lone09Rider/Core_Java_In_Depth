package Creation;

class MyCounter extends Thread {
	private int threadNo;

	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		countMe();
	}

	public void countMe() {
		for (int i = 1; i <= 9; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Value of i is : " + i + " and thread number is : " + threadNo);
		}
	}
}

public class App {

	public static void main(String[] args) throws InterruptedException {

		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);

		long startTime = System.currentTimeMillis();

		counter1.start();// Run Should be Called By JVM  so start()
		System.out.println("*********************");
		counter2.start();// Run Should be Called By JVM so start()

		Thread.sleep(4521);
		long endTime = System.currentTimeMillis();

		System.out.println("Total time : "+(endTime - startTime));

	}

}

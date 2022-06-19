package Join;

public class App {

	public int counter = 0;

	public static void main(String[] args) {

		App app = new App();

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					app.counter++;
				}

			}
		});
		thread.start();
		
//		Method 1: ->
		
//		try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		 Method 2 : ->
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Counter : " + app.counter);
	}

}

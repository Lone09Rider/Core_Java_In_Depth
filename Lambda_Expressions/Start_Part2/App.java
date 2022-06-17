package Start_Part2;


public class App {
	public static void main(String[] args) {
		
//		Thread thread1 =  new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("In thread 1"));
//			}
//		});
		
		Thread thread1 = new Thread (()-> System.out.println("In thread 1"));
		thread1.start();
		
		new Thread(()-> {
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
		}).start();
		
	}
}

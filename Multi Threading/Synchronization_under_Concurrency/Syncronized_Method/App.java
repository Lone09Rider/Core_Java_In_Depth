package Synchronization_under_Concurrency.Syncronized_Method;

class Brackets {
	// Can only work for one type of thread object multiple times not on 2 different
	// objects
	synchronized public void genrate() {
		for (int i = 1; i <= 10; i++) {
			if (i <= 5) {
				System.out.print("[");
			} else {
				System.out.print("]");
			}
		}
		System.out.println();
	}
}

public class App {

	public static void main(String[] args) {

		Brackets bracket = new Brackets();

		new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 1; i <= 5; i++) {
					bracket.genrate();
				}

			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 1; i <= 5; i++) {
					bracket.genrate();
				}

			}
		}).start();

	}

}

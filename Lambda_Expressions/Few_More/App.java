package Few_More;

interface Lambda {
	int demo();
}

public class App {

	public static void main(String[] args) {

		int x = 10;

//		Lambda lambda = new Lambda() {
//
//			@Override
//			public void demo() {
//				int test = 101;
//				System.out.println("Testing Lambda " + x + " " + test);
//			}
//
//		};

//		If Void
//		Lambda lambda = () -> {
//			int y = 101;
//			System.out.println(x + " " + y);
//		};
		
//		If int
		Lambda lambda = () -> 20;

		System.out.println(lambda.demo());
	}

}

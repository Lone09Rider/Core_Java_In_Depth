package Exception_Handling;

public class App {

	public static void main(String[] args) {
		
		App obj = new App();
		obj.case1(10, 0);
		try {
			obj.case2(20, 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("DONE !!!");
		}
	}

	public void case1(int x, int y) {
		if (y != 0) {
			System.out.println(x/y);
		} else
			System.out.println("y is 0");
	}

	public void case2(int x, int y) {
		System.out.println(x/y);
	}

}

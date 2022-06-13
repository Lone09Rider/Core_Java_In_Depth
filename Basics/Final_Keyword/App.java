package Final_Keyword;

public class App {

	public static void main(String[] args) {
		
		B obj = new B();
		System.out.println(obj.getX());
		
//		obj.setX(5); // AFter Final so no setting up values
		System.out.println(obj.getX());
		
		B obj1 = new B();
		obj1.india();
		obj1.USA();
	}

}

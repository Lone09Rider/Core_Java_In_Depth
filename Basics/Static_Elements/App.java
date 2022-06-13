package Static_Elements;

public class App {
	public static void main(String[] args) {
		
		TestStatic obj  = new TestStatic();
		System.out.println(obj.getStaticVar());
		obj.setStaticVar(1);
		System.out.println(obj.getStaticVar());
		
		TestStatic obj2  = new TestStatic();
		System.out.println(obj2.getStaticVar());
		obj2.setStaticVar(24);
		System.out.println(obj2.getStaticVar());
		
		// In Static value changes means even in other class
		
		TestStatic obj3  = new TestStatic();
		System.out.println(obj3.getStaticVar());
		
	}
}

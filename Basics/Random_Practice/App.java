package Random_Practice;

public class App {
	
	public static void main(String[] args) {
		
		String s1 = "Hello World";
		String s2 = "Hello World";
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String s3 = "Hello World";
		String s4 = new String("Hello World");
		System.out.println(s3 == s4);
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s3.equals(s4));
		
		System.out.println(s3.charAt(0));
		System.out.println(s3.codePointAt(3));
	}

}

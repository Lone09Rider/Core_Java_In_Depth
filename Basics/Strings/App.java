package Strings;

public class App {

	public static void main(String[] args) {

		String x = "Study";
		String y = "Java";
		String z = x + y;
		System.out.println(z);
		System.out.println(y.concat(x));
		
		if (z.equals("StudyJava"))
		{
			System.out.println("Text is StudyJava");
		} else {
			System.out.println("Not that");
		}
		
		String a = z.replace("StudyJava", "Java is Best");
		System.out.println(a);

	}

}

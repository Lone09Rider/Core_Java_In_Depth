package Abstract_Classes;

public class Hello {

	public static void main(String[] args) {

		Person nv = new Non_Vegies();
		nv.speak();
		nv.eat();
		
		System.out.println();

		Person v = new Vegies();
		v.speak();
		v.eat();

	}

}

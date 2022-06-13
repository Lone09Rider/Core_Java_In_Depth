package ArrayList;

import java.util.ArrayList;

public class App {

	static ArrayList<String> lisNames = new ArrayList<>();

	public static void main(String[] args) {

		lisNames.add("Meenu");
		lisNames.add("Raja");
		lisNames.add("Tillu");
		lisNames.add("Raju");
		lisNames.add("Timu");
		lisNames.add("Suku");
		lisNames.add("Sonu");
		lisNames.add("Allu");
		lisNames.add("Kulli");

		System.out.println(lisNames);
		System.out.println(lisNames.get(0));

//		lisNames.remove("Tillu"); // Or lisNames.remove(2);
//		System.out.println(lisNames);

		App app = new App();
		app.removeByPosition(2);
		System.out.println(lisNames);

		app.removeByName("Kulli");
		System.out.println(lisNames);

		System.out.println(lisNames.size());
		lisNames.add(0, "Musi");
		System.out.println(lisNames);
		System.out.println(lisNames.size());
		
		lisNames.set(0, "Meenal");
		System.out.println(lisNames);
		System.out.println(lisNames.size());

	}

	void removeByPosition(int x) {
		lisNames.remove(x);
	}

	void removeByName(String x) {
		lisNames.remove(x);
	}

}

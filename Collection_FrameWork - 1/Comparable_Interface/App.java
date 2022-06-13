package Comparable_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Names implements Comparable<Names> {
	private String name;

	public Names(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Names obj) {
		if (name.length() == obj.name.length()) {
			return 0;
		} else if (name.length() < obj.name.length()) {
			return -1;
		} else
			return 1;
	}

	@Override
	public String toString() {
		return name;
	}

}

public class App {
	public static void main(String[] args) {

//		String x = "a";
//		String y = "b";
//
//		System.out.println(x.compareTo(y));

		List<Names> names = new ArrayList<Names>();
		names.add(new Names("Mia"));
		names.add(new Names("Amar"));
		names.add(new Names("Billu"));

		System.out.println(names);

		App app = new App();
		
		app.printList(names);

	}

	void printList(List<Names> list) {
		Iterator<Names> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}

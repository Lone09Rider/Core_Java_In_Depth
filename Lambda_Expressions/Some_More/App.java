package Some_More;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data {
	private String name;

	public Data(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

}

public class App {
	public static void main(String[] args) {
		
		List<Data> list = new ArrayList<>();
		list.add(new Data("Heera"));
		list.add(new Data("Moti"));
		list.add(new Data("Raju"));
		list.add(new Data("Anand"));
		
		
		System.out.println(list);
//		Collections.sort(list, new Comparator<Data>() {
//
//			@Override
//			public int compare(Data o1, Data o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		
		Collections.sort(list, (Data o1, Data o2)->o1.getName().compareTo(o2.getName()));
		
		System.out.println(list);
	}
}

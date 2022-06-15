package Generic_Method;

import java.util.ArrayList;
import java.util.List;

class Data {
	public <E> void printListData(List<E> list) {
		for (E e : list) {
			System.out.println(e);
		}
	}
	
	public <E> void printArray(E[] arrayData) {
		for (E e : arrayData) {
			System.out.println(e);
		}
	}
}

public class App {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		
		Data data1 = new Data();
		data1.printListData(list);
		
		System.out.println("********************");
		
		String[] stringArray = {"Hello", "Bye"};
		Data data = new Data();
		data.printArray(stringArray);
		
	}

}

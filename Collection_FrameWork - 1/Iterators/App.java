package Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class App {
	
	public static void main(String[] args) {
		
		List<String> countries = new ArrayList<String>();
		
		countries.add("INDIA");
		countries.add("USA");
		countries.add("RUSSIA");
		countries.add("SOUTH AFRICA");
		countries.add("NEW ZEALAND");
		countries.add("KOREA");
		
		new App().printList(countries);
		
		System.out.println("***********************");
		
		new App().printList1(countries);
	}

	void printList(List<String> list)
	{
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println("Element : " + it.next());
		}
	}
	
	void printList1(List<String> list)
	{
		ListIterator<String> it = list.listIterator();
		while (it.hasNext()) {
			System.out.println("Element : " + it.next());
		}
	}
}

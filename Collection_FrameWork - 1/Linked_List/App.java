package Linked_List;

import java.util.LinkedList;

public class App {
	
	public static void main(String[] args) {
		
		LinkedList<String> countries = new LinkedList<String>();
		countries.add("INDIA");
		countries.add("USA");
		countries.add("RUSSIA");
		countries.add("SOUTH AFRICA");
		countries.add("NEW ZEALAND");
		countries.add("KOREA");
		
		System.out.println(countries);
		
		App app =new App();
		app.printList(countries);
		
		countries.set(5, "BRITAIN");
		System.out.println(countries);
		System.out.println(countries.getFirst());
		System.out.println(countries.get(1));
		
		countries.remove(4);
		System.out.println(countries);
		
		System.out.println("***********************************");
		
		countries.clear();
		System.out.println(countries);
		
	}
	
	void printList(LinkedList<String> li)
	{
		System.out.println(li);
	}

}

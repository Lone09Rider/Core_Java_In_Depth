package CompareTo_Method;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		List<String> countries = new ArrayList<>();
		
		countries.add("INDIA");
		countries.add("USA");
		countries.add("RUSSIA");
		countries.add("SOUTH AFRICA");
		countries.add("NEW ZEALAND");
		countries.add("KOREA");
		
		int res = countries.get(0).compareTo("INDIA");
		System.out.println(res);
		
		int res2 = countries.get(0).compareTo("I");
		System.out.println(res2);
		
		int res3 = countries.get(0).compareTo("INDIA IS BEST");
		System.out.println(res3);
	}

}

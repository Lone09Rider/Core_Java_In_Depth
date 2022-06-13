package Sorting_Reversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<String> countries = new ArrayList<String>();
		countries.add("INDIA");
		countries.add("USA");
		countries.add("RUSSIA");
		countries.add("SOUTH AFRICA");
		countries.add("NEW ZEALAND");
		countries.add("EGYPT");
		
		System.out.println(countries);
		countries.sort(null);
		System.out.println(countries);
		
		Collections.reverse(countries);
		System.out.println(countries);

		
	}
	
}

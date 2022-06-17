package Threads_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {
	
	public static void main(String[] args) {
		
//		 Lambda excepts only final variable
		final int x = 10;
//		x++;  	// Not Allowed
		new Thread(()->System.out.println(x)).start();
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(7);
		list.add(5);
		list.add(9);
		
//		for (Integer i : list) {
//			if (i>=5)
//				System.out.println(i);
//		}
		
		list.forEach( (i)->System.out.println(i) );
	}

}

package Predicate;

import java.util.function.IntPredicate;

public class App {
	
	public static void main(String[] args) {
		
//		IntPredicate lessthan18 = new IntPredicate() {
//			
//			@Override
//			public boolean test(int value) {
//				if (value < 18) {
//					return true;
//				} else 
//				return false;
//			}
//		};
		
		IntPredicate lessthan18 = (i) -> i<18;
		IntPredicate moreThan10 = (i) -> i > 10; 
		System.out.println(lessthan18.test(20));
		System.out.println(moreThan10.test(11));
		
		System.out.println(lessthan18.and(moreThan10).test(21));
		System.out.println(lessthan18.or(moreThan10).test(21));
	}

}

package Predicate_More;

import java.util.function.IntPredicate;

public class App {

	public static void main(String[] args) {

		IntPredicate lessthan18 = (i) -> i < 18;
		IntPredicate moreThan10 = (i) -> i > 10;

//		System.out.println(lessthan18.and(moreThan10).test(45));
		new App().demo(10, lessthan18, moreThan10);

	}

	public void demo(int x, IntPredicate lessthan18, IntPredicate moreThan10) {
		if (lessthan18.and(moreThan10).test(x)) {
			System.out.println("Less than 18 more than 10");
		} else {
			System.out.println("Invalid");
		}
	}

}

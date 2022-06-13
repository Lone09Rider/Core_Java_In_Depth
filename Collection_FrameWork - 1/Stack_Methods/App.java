package Stack_Methods;

import java.util.Stack;

public class App {

	public static void main(String[] args) {

		Stack<Integer> demo = new Stack<>();
		demo.push(1);
		demo.push(2);
		demo.push(3);
		demo.push(4);
		demo.push(5);

		System.out.println(demo);

		for (Integer i : demo) {
			System.out.print(i + " ");
		}
		System.out.println();
		demo.pop();
		System.out.println(demo);
		System.out.println(demo.pop());
		System.out.println(demo);
		
		System.out.println(demo.isEmpty());
		System.out.println(demo.search(2));

	}

}

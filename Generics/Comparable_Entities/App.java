package Comparable_Entities;

class Data<T extends Comparable<T>> implements Comparable<T> {
	private T myVar;

	public T getMyVar() {
		return myVar;
	}

	public Data(T myVar) {
		this.myVar = myVar;
	}

	@Override
	public String toString() {
		return "Data [myVar=" + myVar + "]";
	}

	@Override
	public int compareTo(T o) {
		
		return getMyVar().compareTo(o);
	}

	
	
}

public class App {

	public static void main(String[] args) {
		
		Data<Integer> data = new Data<Integer>(1); // part 1
		System.out.println(data.compareTo(0)); // part 2
		
//		part1 == part2 = 0
//		part1 > part2 = 1
//		part1 < part2 = -1

	}

}

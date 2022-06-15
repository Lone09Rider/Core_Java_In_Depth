package In_Depth;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T> {
	private T myVar;

	public Data(T myVar) {
		this.myVar = myVar;
	}

	public T getMyVar() {
		return myVar;
	}

	@Override
	public String toString() {
		return "Data [myVar=" + myVar + "]";
	}

}

public class App {

	public static void main(String[] args) {

		List<Data<Object>> elements = new LinkedList<>();
		elements.add(new Data<Object>("Some Text"));
		elements.add(new Data<Object>(5.9));
		elements.add(new Data<Object>(9));
		elements.add(new Data<Object>('a'));
		
		
		App app = new App();
		app.printList(elements);

	}

	void printList(List<Data<Object>> lis) {
		ListIterator<Data<Object>> itr = lis.listIterator();
		while (itr.hasNext()) {
			System.out.println("Element : " + itr.next().getMyVar());

		}
	}

}

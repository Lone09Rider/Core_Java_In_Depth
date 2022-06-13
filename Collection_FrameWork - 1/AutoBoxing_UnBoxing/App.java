package AutoBoxing_UnBoxing;

import java.util.ArrayList;

class intWrapper {
	public int intValue;
	
	public intWrapper(int intValue)
	{
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	
}

public class App {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(1);
		x.add(2);
		x.add(3);
		System.out.println(x); // Auto Boxing
		
		ArrayList<intWrapper> arr = new ArrayList<intWrapper>();
		
		arr.add(new intWrapper(1)); // Boxing by new keyword -> converting int to object
		arr.add(new intWrapper(2));
		arr.add(new intWrapper(3));
		arr.add(new intWrapper(4));
		arr.add(new intWrapper(5));
		arr.add(new intWrapper(9));
		
		
		for (intWrapper i : arr) {
			System.out.print(i.getIntValue() + " "); // UnBoxing
		}
		
	}

}

package Call_By_Value_And_Reference;
// JAVA IS ALWAYS PASS BY VALUE 
public class Pass_By_Value {

	public static void main(String[] args) {

		int value = 10;
		Pass_By_Value app = new Pass_By_Value();
		app.displayValue(value);
		System.out.println("Value in Main " + value);

	}

	void displayValue(int value) {
		System.out.println("Value in displayValue " + value);
		value = 20;
		
	}
}

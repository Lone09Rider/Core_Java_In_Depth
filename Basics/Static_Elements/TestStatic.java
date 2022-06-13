package Static_Elements;

public class TestStatic {
	private static int staticVar = 0;

	public int getStaticVar() {
		return staticVar;
	}

	public static void setStaticVar(int staticVar) {
		TestStatic.staticVar = staticVar;
	}

}

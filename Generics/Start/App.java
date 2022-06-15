package Start;

class Data {
	private Object obj;

	public Data(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}

}

class GenericClass<T> {
	private T data;

	public GenericClass(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}

}

public class App {

	public static void main(String[] args) {

//		Data data = new Data("SomeString");
//		String var = (String) data.getObj();
//		System.out.println(var);
		
		GenericClass<String> gen = new GenericClass<String>("Some data");
		String data = gen.getData();
		System.out.println(data);

	}

}

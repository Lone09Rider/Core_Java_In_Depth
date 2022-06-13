package Throw_And_Throws;

import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) {
		
		try {
			someMethod();
		} catch (FileNotFoundException e) {
			System.out.println("Catch of Main");
		} catch (Exception e) {
			System.out.println("Catch of Main Exception");
		}

	}

	public static void someMethod() throws Exception {
		System.out.println("Message from someMethod");
		throw new Exception();
	}
	
}

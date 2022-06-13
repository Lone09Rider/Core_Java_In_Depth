package Interfaces;

public class Hello {

	public static void main(String[] args) {

		OnePlus5 phone = new OnePlus5();
		String processor = phone.processor();
		System.out.println("One-Plus 5 Processor : " + processor);
		
		Samsung_s20fe s20 = new Samsung_s20fe();
		String processor_s = s20.processor();
		System.out.println("Samsung S20 FE Processor : " + processor_s);

	}

}

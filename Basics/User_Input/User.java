package User_Input;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Your Age : ");
		int age = sc.nextInt();

		System.out.println("You are " + name + " of age " + age);

	}

}

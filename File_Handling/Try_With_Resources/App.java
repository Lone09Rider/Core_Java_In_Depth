package Try_With_Resources;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println(x);
		scan.close();
//		 Always Remember Closing Files
	}

}

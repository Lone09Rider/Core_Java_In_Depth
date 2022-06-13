package Checked_Unchecked_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
	public static void main(String[] args) {
		
//		Checked: We have to handle this
		try {
			FileReader in = new FileReader("file.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
		
//		Unchecked : Can be left unhandled 
		int x = 10, y;
		y = x/0;
		System.out.println(y);
		
	}
}

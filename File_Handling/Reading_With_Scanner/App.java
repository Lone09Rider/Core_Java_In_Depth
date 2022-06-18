package Reading_With_Scanner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		File file = new File("src/Reading_With_Scanner/test_4.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.append("hello");
			bw.newLine();
			bw.append("world");
			bw.newLine();
			bw.append("Hello!!!");
		} catch (Exception e) {
			System.out.println("Unable to Write");
		}
		
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}

}

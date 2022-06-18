package Reading_Files_BufferedReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws Exception {

		File file2 = new File("src/Reading_Files_BufferedReader/test_3.txt");
		try {
			file2.createNewFile();
			System.out.println("Successfully Created !!!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file2, true))) {
			bw.append("Hello");
			bw.newLine();
			bw.append("World !!");
			bw.newLine();
			bw.append("KirA");
			bw.newLine();
			bw.append("Here");

			bw.close();

		} catch (Exception e) {
			System.out.println("Unable to add !!!");
		}

		try {
			BufferedReader br = new BufferedReader(new FileReader("src\\Reading_Files_BufferedReader\\test_3.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		}catch (Exception e) {
			e.getMessage();
		}
		

	}
}

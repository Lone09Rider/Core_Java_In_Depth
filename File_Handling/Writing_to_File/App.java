package Writing_to_File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	
	public static void main(String[] args) {
		
		File file = new File("src/Writing_to_File/test_2.txt");
		try {
			file.createNewFile();
			System.out.println("File Created!!!");
		} catch (IOException e) {
			System.out.println("Error in Creation");
			e.printStackTrace();
		}		
//		true to append else nothing or false to override
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
			bw.write("Hello\n");
			bw.write("World\n");
			bw.write("KirA\n");
			bw.write("The KING");
			System.out.println("Writing Completed");
		} catch (Exception e) {
			System.out.println("Error, Cannot Write");
		}
	}

}

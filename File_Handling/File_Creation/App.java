package File_Creation;

import java.io.File;
import java.io.IOException;

public class App {
	
	public static void main(String[] args) throws IOException {
		{
			File file = new File("src/File_Creation/Test_File_1.txt");
			file.createNewFile();
			System.out.println("File_Created");
		}
	}

}

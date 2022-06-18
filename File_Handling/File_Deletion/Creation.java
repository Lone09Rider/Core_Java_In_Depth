package File_Deletion;

import java.io.File;
import java.io.IOException;

public class Creation {
	
	public static void main(String[] args) {
		
		File file = new File("src/File_Deletion/test_5.txt");
		try {
			file.createNewFile();
			System.out.println("Successfully Created !!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}

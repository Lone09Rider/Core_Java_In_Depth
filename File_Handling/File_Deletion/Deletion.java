package File_Deletion;

import java.io.File;

public class Deletion {
	public static void main(String[] args) {
		
		File file = new File("src/File_Deletion/test_5.txt");
		if (file.delete()) {
			System.out.println("Deleted Successfully !!");
		} else {
			System.out.println("Error in Deletion !!");
		}
		
	}
}

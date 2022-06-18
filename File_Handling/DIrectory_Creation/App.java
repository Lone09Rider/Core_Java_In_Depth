package DIrectory_Creation;

import java.io.File;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		{
			File dir = new File("src/Directory_Creation/new_dir");
			dir.mkdir();
			System.out.println("Created a new Dir");
			
			File dir1 = new File("src/Directory_Creation/new_dir2/KirA");
			dir1.mkdirs();
//			Inserting a file into directory
			File f = new File("src\\Directory_Creation\\new_dir2\\KirA\\text.txt");
			f.createNewFile();
			System.out.println("File_Created");
		}
	}
}

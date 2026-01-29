package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) {
		try {
		FileWriter fw= new FileWriter("Tech.txt");
		fw.write("\nNew line added");
		fw.close();
		System.out.println("Data appended successfully");
	}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}

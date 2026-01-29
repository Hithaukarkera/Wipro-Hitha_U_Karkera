package FileHandling;

import java.io.File;
import java.io.IOException;
//import java.io.FileWriter;
//import java.io.FileReader;
//import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class DeeleteFile {

	public static void main(String[] args) {
		 try {
	            Files.delete(Path.of("Tech.txt"));
	            System.out.println("File deleted successfully");
	        } catch (IOException e) {
	            System.out.println("File not found or access denied");
	        }
	}
}
		
		
		/*File file = new File("Tech.txt");

        if (file.delete()) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("File not found or unable to delete");
        }
		
	}
		
		
}*/
		/*try {
			File file = new File("Tech.txt");
			if(file.delete()) {
				System.out.println("File deleted successfully");
			}
			else {
				System.out.println("File not found");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}*/



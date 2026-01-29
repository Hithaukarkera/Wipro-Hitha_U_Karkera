package FileHandling;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class CreateFile {

	public static void main(String[] args) {
		try {
			File file=new File("Tech.txt");
			
			if(file.createNewFile())
		{
			System.out.println("File created Successfully");
		}
		else
		{
			System.out.println("File alredy exists");
		 
		}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
		 
}
		
		
		
		/*try {

			File fw= new File("Tech.txt");
			//fw.write("Hello,Java");
			//fw.close();
			fw.delete();
		}
			
			/*System.out.println("DataWritten successfully");
		
			BufferedReader br = new BufferedReader(new FileReader("Tech.txt"));
			
			String line =br.readLine();
			//while((line=br.readLine())!=null) {
			System.out.println(line);
			br.close();
		}*/
			
			
			/* FileReader fr = new FileReader("Tech.txt");
			int ch;
			while((ch=fr.read()) !=-1) {
				System.out.print((char) ch);
			}fr.close();
			}*/
			
			/*FileWriter wr= new FileWriter("Tech.txt");
			wr.write("Hello, I am a text file please write something about file handling");
			wr.close();
			
			System.out.println("DataWritten successfully");
		}*/
			
		/*catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}

}*/

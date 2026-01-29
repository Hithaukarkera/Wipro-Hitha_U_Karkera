package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

    // CREATE FILE
    public static void createFile() {
        try {
            File file = new File("Tech1.txt");
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Error while creating file");
            e.printStackTrace();
        }
    }

    // APPEND DATA TO FILE
    public static void appendFile() {
        try {
            FileWriter writer = new FileWriter("Tech1.txt", true); // true = append mode
            writer.write("\nWelcome to Java File Handling");
            writer.close();
            System.out.println("Data appended successfully");
        } catch (IOException e) {
            System.out.println("Error while appending data");
            e.printStackTrace();
        }
    }

    // DELETE FILE
    public static void deleteFile() {
        File file = new File("Tech1.txt");
        if (file.delete()) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("File not found or cannot be deleted");
        }
    }

    public static void main(String[] args) {

        createFile();   // Step 1: Create file
        appendFile();   // Step 2: Append data
        deleteFile();   // Step 3: Delete file
    }
}

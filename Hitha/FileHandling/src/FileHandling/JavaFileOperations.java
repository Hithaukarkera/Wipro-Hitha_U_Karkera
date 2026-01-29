package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFileOperations {

    // CREATE .java FILE
    public static void createJavaFile() {
        try {
            File file = new File("Sample.java");
            if (file.createNewFile()) {
                System.out.println("Java file created successfully");
            } else {
                System.out.println("Java file already exists");
            }
        } catch (IOException e) {
            System.out.println("Error while creating Java file");
            e.printStackTrace();
        }
    }

    // APPEND CONTENT TO .java FILE
    public static void appendJavaFile() {
        try {
            FileWriter writer = new FileWriter("Sample.java", true); // append mode- true will does not overwrite
            writer.write("\npublic class Sample {\n");
            writer.write("    public static void main(String[] args) {\n");
            writer.write("        System.out.println(\"Hello from Sample.java\");\n");
            writer.write("    }\n");
            writer.write("}\n");
            writer.close();
            System.out.println("Content appended to Java file");
        } catch (IOException e) {
            System.out.println("Error while appending Java file");
            e.printStackTrace();
        }
    }

    // DELETE .java FILE
    public static void deleteJavaFile() {
        File file = new File("Sample.java");
        if (file.delete()) {
            System.out.println("Java file deleted successfully");
        } else {
            System.out.println("Java file not found or cannot be deleted");
        }
    }

    public static void main(String[] args) {

        createJavaFile();   // Step 1: Create Sample.java
        appendJavaFile();   // Step 2: Write Java code into it
        deleteJavaFile();   // Step 3: Delete Sample.java
    }
}



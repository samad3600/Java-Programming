import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        // File object
        File file = new File("example.txt");

        try {
            // Create a new file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write to the file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a test file.\nWelcome to file operations in Java!");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            // Read from the file
            FileReader reader = new FileReader("example.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // Delete the file
            if (file.delete()) {
                System.out.println("Deleted the file: " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

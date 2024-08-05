import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String fileContent = "Hello, this is a test file.\nWelcome to file handling in Java!";
                String file = "Hello, this is a test file.\nWelcome to file handling in Java!";

    
    


        // Create and write to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(fileContent);
            writer.write(file);

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from the file
        try (FileReader reader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            System.out.println("File content:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}

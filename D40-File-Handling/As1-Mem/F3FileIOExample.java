// How do you handle exceptions when performing file I/O operations in Java? Provide an example.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F3FileIOExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("filename.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

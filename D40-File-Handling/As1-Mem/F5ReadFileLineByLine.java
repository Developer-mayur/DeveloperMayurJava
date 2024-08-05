// 5.	Write a Java program to read a text file line by line and print each line to the console.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class F5ReadFileLineByLine {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

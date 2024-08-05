import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file1 {

    public static void main(String[] args) {
        File file = new File("abc.txt");

         try {
            if (file.createNewFile()) {
                System.out.println("File is created.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }

         String d = "Hello, World";
        try (FileOutputStream fos = new FileOutputStream(file)) {
            byte[] bytes = d.getBytes();
            fos.write(bytes);
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read data from the file
        try (FileInputStream fis = new FileInputStream(file)) {
            int i;
            System.out.println("Data read from the file:");
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}

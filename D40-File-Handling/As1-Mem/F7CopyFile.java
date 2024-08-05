import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class F7CopyFile {
    public static void main(String[] args) {
        try (InputStream in = new FileInputStream("input.txt");
             OutputStream out = new FileOutputStream("output.txt")) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}

import java.io.FileWriter;
import java.io.IOException;

public class F6AppendToFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("filename.txt", true)) {
            writer.write("appended text");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }
}

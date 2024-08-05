import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class F11WordSearch {
    public static void main(String[] args) {
        String searchWord = "search";
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equals(searchWord)) {
                        count++;
                    }
                }
            }
            System.out.println("Occurrences of '" + searchWord + "': " + count);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

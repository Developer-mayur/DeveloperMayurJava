// How do you create a new file in Java? 



import java.io.File;
import java.io.IOException;

public class F2CreateFileExample {
    public static void main(String[] args) {
        File newFile = new File("filename.txt");
        try {
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

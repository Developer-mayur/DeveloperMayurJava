import java.io.File;

public class ListFilesRecursive {
    public static void main(String[] args) {
        File directory = new File("path/to/directory");
        listFiles(directory);
    }

    public static void listFiles(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    listFiles(file);
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}

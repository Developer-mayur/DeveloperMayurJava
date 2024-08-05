import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class F13UserLoginSystem {
    private static final String CSV_FILE = "users.csv";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim();

        System.out.print("Enter password: ");
        String password = scanner.nextLine().trim();

        boolean loginSuccess = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length >= 2) {
                    String storedUsername = fields[0].trim();
                    String storedPassword = fields[1].trim();

                    if (storedUsername.equals(username) && storedPassword.equals(password)) {
                        loginSuccess = true;
                        break;
                    }
                }
            }

            if (loginSuccess) {
                System.out.println("Login successful! Welcome, " + username + "!");
            } else {
                System.out.println("Login failed. Invalid username or password.");
            }
        } catch (IOException e) {
            System.out.println("Error accessing user data: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

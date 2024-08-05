import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class F15BankAccountSystem {
    private static final String CSV_FILE = "users.csv";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim();

        System.out.print("Enter password: ");
        String password = scanner.nextLine().trim();

        boolean loggedIn = false;
        String email = "";
        double balance = 0.0;

        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length >= 4) {
                    String storedUsername = fields[0].trim();
                    String storedPassword = fields[1].trim();
                    String storedEmail = fields[2].trim();
                    double storedBalance = Double.parseDouble(fields[3].trim());

                    if (storedUsername.equals(username) && storedPassword.equals(password)) {
                        loggedIn = true;
                        email = storedEmail;
                        balance = storedBalance;
                        break;
                    }
                }
            }

            if (loggedIn) {
                System.out.println("Login successful!");
                System.out.println("Welcome, " + username + "!");
                System.out.println("Email: " + email);
                System.out.println("Balance: $" + balance);
            } else {
                System.out.println("Login failed. Invalid username or password.");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error accessing user data: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

 
 import java.io.FileWriter;
 import java.io.IOException;
 
 public class F12UserRegistration {
     public static void main(String[] args) {
         registerUser("username", "hashedPassword", "email");
     }
 
     public static void registerUser(String username, String hashedPassword, String email) {
         try (FileWriter writer = new FileWriter("users.csv", true)) {
             writer.write(username + "," + hashedPassword + "," + email + "\n");
             System.out.println("User registered successfully.");
         } catch (IOException e) {
             System.out.println("Error registering user: " + e.getMessage());
         }
     }
 }
 
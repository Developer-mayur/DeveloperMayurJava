import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        // Allow user to enter multiple strings
        System.out.println("Enter strings to add to the ArrayList  :");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            arrayList.add(input);
        }

        // Prompt the user to enter a string to search for
        System.out.print("Enter the string to search for: ");
        String s = scanner.nextLine();

        // Search for the string and display its position(s)
        boolean found = false;
        System.out.println("Searching for \"" + s + "\"...");
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(s)) {
                System.out.println("Found at position: " + (i + 1));
                found = true;
            }
        }

        if (!found) {
            System.out.println("String \"" + s + "\" not found in the ArrayList.");
            // System.out.println();
        }

    }
}
   

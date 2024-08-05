import  java.util.*;
class solution  {
       public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to calculate its factorial: ");
        
        
        // Handling input exceptions
        try {
          
            int input = scanner.nextInt();
            int number = input;
                     
            if (number < 0) {
                System.out.println("Factorial of negative numbers is undefined.");
            } else {
                long factorial = calculateFactorial(number);
                System.out.println(number + "! = " + factorial);
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Input must be a valid integer.");
        }
        catch(Exception e){
            System.out.println("invalid value.............");
        }

    
    }
    private static long calculateFactorial(int n) {
        long factorial = 1;
        
        // Calculate factorial
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }}

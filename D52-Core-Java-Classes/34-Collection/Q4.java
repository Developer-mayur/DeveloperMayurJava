
// 4.Modify an ArrayList
// Objective: Develop a program to perform operations on an ArrayList.
// Tasks:
// Add 5 integers to an ArrayList.
// Replace the second element with a new integer.
// Remove the third element.
// Display the updated ArrayList.

import java.util.ArrayList;

public class Q4 {
   
public static void main(String[] args) {
    
ArrayList<Integer> l =new ArrayList<>();
// Add 5 integers to an ArrayList.

l.add(6);
l.add(28);
l.add(123);
l.add(123);
l.add(123);

System.out.println(l);
// Replace the second element with a new integer.
l.set(1,34);
System.out.println(l);
// Remove the third element.
l.remove(2);
System.out.println(l);
// Display the updated ArrayList.



 


}
}
 

import java.util.*;

// 2. WAP to store integer values in arraylist and display only those values which are even.
public class Q2 {
public static void main(String[] args) {
    
ArrayList<Integer> l =new ArrayList<>();
l.add(121);
l.add(122);
l.add(123);
l.add(124);
l.add(125);
l.add(126);
l.add(127);
l.add(128);
l.add(129);
l.add(130);


for (int  i: l) {
   if(i%2!=0){
    System.out.println(i);
   }
}


}


}

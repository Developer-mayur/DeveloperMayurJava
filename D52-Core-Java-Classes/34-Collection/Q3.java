// 3. WAP to store integer values in arraylist and display only those numbers which are perfect numbers.

import java.util.*;

 public class Q3 {
public static void main(String[] args) {
    
ArrayList<Integer> l =new ArrayList<>();
l.add(6);
l.add(28);
l.add(123);
l.add(123);
l.add(123);
l.add(123);
l.add(123);
l.add(123);
l.add(123);
l.add(123);


for (int  i: l) {
int j=2;
    if(i%j!=0){
      j++;
   //  System.out.println(i);
   }
   else{
      System.out.println(i);
   }

}


}


}

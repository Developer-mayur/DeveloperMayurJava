

import java.util.*;

// 1. WAP to store string data in arraylist and convert all the names into upper case which starts from a.
public class Q1 {
public static void main(String[] args) {
    
ArrayList<String> l =new ArrayList<>();
l.add("abhay");
l.add("kanha");
l.add("kalu");
l.add("pilu");
l.add("chilu");
l.add("talu");
l.add("galu");
l.add("chhalu");
l.add("chalu");

for (String s : l) {
   if( s.startsWith("a")){
    System.out.println(s);
   }
}


}


}

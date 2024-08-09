

import java.util.HashSet;    //import HashSet Class
import java.util.ListIterator;
public class p6 {
    public static void main(String[]args){

HashSet b= new  HashSet();
b.add("mayur");
b.add("sachine");
b.add("abhay");
b.add("kartik");
b.add("vishal");
b.add("hari");
System.out.println(b);

Iterator itr = b.listIterator();  
   while(itr.hasNext())
   {
    System.out.println(itr.next());

 
    // System.out.println(itr.previous());

   }



    }
}

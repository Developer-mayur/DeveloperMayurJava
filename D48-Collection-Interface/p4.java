import java.util.ArrayList;
import java.util.ListIterator;
public class p4 {
   public static void main(String[]args){
ArrayList l = new ArrayList();

l.add("sdsdf");
l.add("s");
l.add("sddvddcsdf");
l.add("sdddddfdddddddffddfsdf");
l.add("df");
l.add("df");
l.add("sd");

System.out.println(l);

ListIterator itr = l.listIterator();  
   while(itr.hasNext())
   {
    System.out.println(itr.next());

 
   }


 



   }
    


}

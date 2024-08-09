
import java.util.HashMap;
import java.util.Set;
import java.util.*;
import java.util.Iterator;



public class p1 {
 public static void main(String[]args) 
 {

HashMap hm = new HashMap();

hm.put(1,"rahul");
hm.put(2,"fdf");
hm.put(3,"fddf");
hm.put(4,"ff");
hm.put(5,"dfvd");
hm.put(6,"ffdf");

System.out.println(hm.remove(1,"rahul"));
System.out.println(hm.containsValue("fdf"));
System.out.println(hm.containsKey(3));
// System.out.println(hm);
// System.out.println(hm);
// System.out.println(hm);
// System.out.println(hm);



System.out.println(hm);






Set s = hm.entrySet();

 

Iterator itr= s.iterator();
while(itr.hasNext()){
// System.out.println(itr.next());


Map.Entry  entry  = (Map.Entry)itr.next();
System.out.println(entry.getKey()+" "+entry.getValue());


}
 
 }














}

  import  java.util.ArrayList;

public class p1 {
    
public static void main(String[]args){
    ArrayList l= new ArrayList();
 
    l.add("jayesh");
    l.add("vikash ");
    l.add("genesh");
    l.add("Mohit");
    System.out.println(l);

    ArrayList l1= new ArrayList();

    l1.add("abhay");
    l1.add("daksh ");
    l1.add("sawan");
    l1.add("mayur");
    
    System.out.println(l1);

l.addAll(l1);
System.out.println(l);
}


}


public class p3 {
    
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

ListIterator itr = l1.listIterator();  
   while(itr.hasNext())
   {
    System.out.println(itr.next());

 
    System.out.println(itr.previous());

   }
   System.out.println("program");

   while(itr.hasprevious ())
   {
    System.out.println(itr.previous());
   }

}


}

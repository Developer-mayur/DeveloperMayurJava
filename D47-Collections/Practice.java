import java.util.ArrayList;
import  java.util.Iterator;
import java.util.Collections;
class Pr {
    void w1(){

      // 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.

      ArrayList  a = new ArrayList();
a.add("red");
a.add("green");
a.add("blue");
a.add("yellow");
a.add("white");
a.add("black");
a.add("orange");
a.add("grey");
a.add("pick");

System.out.println(a);

    }


   


//   void w2(){
//   //  2. Write a Java program to iterate through all elements in an array list. 

//   ArrayList  a = new ArrayList();
// a.add("red");
// a.add("green");
// a.add("blue");
// a.add("yellow");
// a.add("white");
// a.add("black");
// a.add("orange");
// a.add("grey");
// a.add("pick");


// Iterator  n = new Iterator(a);

// while(n.HasNext()){

// System.out.println(a);

// }


 




  


  void w3(){
    // 3. Write a Java program to insert an element into the array list at the first position.

    ArrayList  a = new ArrayList();
    a.add("red");
    a.add("green");
    a.add("blue");
    a.add("yellow");
    a.add("white");
    a.add("black");
    a.add("orange");
    a.add("grey");
    a.add("pick");
    
    System.out.println(a);
    a.add(0,"mayour");
    System.out.println(a);






  }


  



  void w4(){
    // 4. Write a Java program to retrieve an element (at a specified index) from a given array list. 
    ArrayList  a = new ArrayList();
    a.add("red");
    a.add("green");
    a.add("blue");
    a.add("yellow");
    a.add("white");
    a.add("black");
    a.add("orange");
    a.add("grey");
    a.add("pick");
    
    // System.out.println(a);
    System.out.println( a.get(3));




  }




void w5(){
  // 5. Write a Java program to update an array element by the given element. 
  ArrayList  a = new ArrayList();
  a.add("red");
  a.add("green");
  a.add("blue");
  a.add("yellow");
  a.add("white");
  a.add("black");
  a.add("orange");
  a.add("grey");
  a.add("pick");
  
  System.out.println(a);

  System.out.println( a.set(3,"mayur"));

  System.out.println(a);


}

void w6(){
  // 6. Write a Java program to remove the third element from an array list. 
  ArrayList  a = new ArrayList();
  a.add("red");
  a.add("green");
  a.add("blue");
  a.add("yellow");
  a.add("white");
  a.add("black");
  a.add("orange");
  a.add("grey");
  a.add("pick");
  
  System.out.println(a);
  a.remove(3);
  System.out.println(a);









}



void w7(){
  // 7. Write a Java program to search for an element in an array list. 

  ArrayList  a = new ArrayList();
  a.add("red");
  a.add("green");
  a.add("blue");
  a.add("yellow");
  a.add("white");
  a.add("black");
  a.add("orange");
  a.add("grey");
  a.add("pick");
  
  // System.out.println(a);
  System.out.println(a.contains("pick"));

  // System.out.println(a);




  
}




void w8(){
  // 8. Write a Java program to sort a given array list. 


  ArrayList  a = new ArrayList();
  a.add(1);
  a.add(5);
  a.add(7);
  a.add(4);
  a.add(3);
  a.add(8);
  a.add(6);
  a.add(10);
  a.add(8);
  
 a.sort(null);
 System.out.println(a);



}

// 9. Write a Java program to copy one array list into another. 

void w9(){
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

void w11(){
// 11. Write a Java program to reverse elements in an array list. 
ArrayList  a = new ArrayList();
  a.add(1);
  a.add(5);
  a.add(7);
  a.add(4);
  a.add(3);
  a.add(8);
  a.add(6);
  a.add(10);
  a.add(8);

  Collections.reverse(a);
System.out.println(a);



}


void w12(){
  // 12. Write a Java program to extract a portion of an array list. 
  ArrayList  a = new ArrayList();
  a.add("red");
  a.add("green");
  a.add("blue");
  a.add("yellow");
  a.add("white");
  a.add("black");
  a.add("orange");
  a.add("grey");
  a.add("pick");

  System.out.println(a.subList(3,6));



}




void w13(){
  // 13. Write a Java program to compare two array lists. 

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

  l.cxdfvdfvompare(l1);





}
}



public class  Practice {
public static void main(String[]agrs) {
  Pr  a = new Pr();
// a.w1();
// a.w2();
// a.w3();
// a.w4();
// a.w5();
// a.w6();
// a.w7();
// a.w8();
// a.w9();
// a.w11();
a.w12();
}
}
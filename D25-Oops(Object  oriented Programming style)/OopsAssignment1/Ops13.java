// 13) Create a class to calculate Area of circle with one data member to store the radius and another to store area value. Create method members
// init - to input radius from user
// calc - to calculate area
// display- to display area

import java.util.Scanner;
class circle{
    private  float a ;     // radius
    private  double b ;      // area
    
    
    // init - to input radius from user
    public void setR( int a ){
    
        this.a=a;
    }


// calc - to calculate area
    public void  calc(){
         b=a*a*3.14;
     }
    

     // display- to display area
public  void display(){
    System.out.println(b);
}
    
    }
    
    
public  class  Ops13 {
    public static void main(String[] args) {    
 circle Ob = new circle();
 Scanner Sc = new Scanner(System.in);
 System.out.println("entry redius ");
    int a=Sc.nextInt();
    Ob.setR(a);
    Ob.calc();
    Ob.display();
    }
    }
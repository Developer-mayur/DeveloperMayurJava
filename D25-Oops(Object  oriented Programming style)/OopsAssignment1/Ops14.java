  // 14) Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
// init - to input X and Y from user
// add - to add X and Y and store in R
// multiply - to multiply X and Y and store in R
// power - to calculate X Y and store in R
// display- to display Result R
import java.util.Scanner;
class MathOperation {
private  double X,Y; 
private  double R;


public void  init(double a,double b){
this.X=a;
this.Y=b;
}

public  void add(){
 R=X+Y;
 }

public   void  multiply(){
     R =X*Y;
     }
   
    
public  void  power(){
   R = Math.pow(X, Y) ; 
          }
    

public void display(){
System.out.println("Display chal raha h");
    add();
    System.out.println(R);

     multiply();
     System.out.println(R);
     
     power();
    System.out.println(R);
   
}


}


public class Ops14 {
    public static void main(String[] args) {
       Scanner Sc = new Scanner(System.in);
       MathOperation o= new MathOperation();
System.out.println("enter  2 no.");
Double c = Sc.nextDouble();
Double d = Sc.nextDouble();

o.init(c,d);
System.out.println("adding");
o.add();
System.out.println("Multiply");
o.multiply();
System.out.println("power");
o.power();
o.display();
    }
}

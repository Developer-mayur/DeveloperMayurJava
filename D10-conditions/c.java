import java.util.Scanner;
class p {
    Scanner sc =new Scanner(System.in);

//  1. Take values of length and breadth of a rectangle from user and check if it is square or not.

void m1(){
    System.out.println("tell me length");
    int i=sc.nextInt();
    System.out.println("tell me breadth");
    int j=sc.nextInt();

if(i==j){
System.out.println("It is square");
}
else{
System.out.println("not square");
}
  }


// 2.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
// Ask user for quantity
// Suppose, one unit will cost 100.
// Judge and print total cost for user.
void m2(){
    int price =100;
System.out.println(" tell me  quantity");
int i=sc.nextInt();
int total=i*price;
int discount=0;
if(i>1000){
   discount= i/10*100;
total-= discount;
    
System.out.println("10% "+total);

}
else{
System.out.println("total "+total);


}


}

// 3.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
// Ask user for their salary and year of service and print the net bonus amount.

void m3(){
    String arr[] ={"mayur","kartik","hari"};
System.out.println("welcome to company");
System.out.println("employee service time");
int i = sc.nextInt();
System.out.println("employee Salary");
int j = sc.nextInt();
int  total =0;
if(i>=5){
System.out.println("employee get bonus of 5%");
int bonus = j*5/100;
j=j+bonus;
System.out.println("total"+" "+j);
}
else{
System.out.println("total"+" "+j);

}


}



}








public class  c{
    public static void main(String[]args){
p  n = new p();
// n.();
// n.m2();
n.m3();
    }
}
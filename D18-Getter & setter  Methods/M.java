import  java.util.Scanner;
class N{
    
    private  int a,b;
    
     public N(){
          a=0;
          b=0;

     }
    
    public   N(  int a, int b)
    {
    this.a=a;
    this.b=b;

    }
    
    
    
    public   void SetA(int a)
    {
        this.a= a;
     }
    
    public   void SetB(int b)
    {
        this.b=b;
     }

    public   void show(){

        System.out.println(a);
        System.out.println(b);

    }
    
 }
    
public class M{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N v = new N();
        System.out.println("Default values");
         v.show();
        System.out.println("enter  1st  inreger");
        int a = sc.nextInt();
        System.out.println("enter  2nd inreger");
        int b = sc.nextInt();
        System.out.println("getter settter");

        N d = new N(a,b);

        d.show();
        System.out.println("set A method");
        int c = sc.nextInt();
        d.SetA(c);

System.out.println("set B method");
 int e = sc.nextInt();
    d.SetB(e);
    System.out.println("Show  method");

    d.show();
    }
    
    
    }

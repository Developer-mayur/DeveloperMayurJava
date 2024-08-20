import java.util.Scanner;
class All{
Scanner sc=new Scanner(System.in);

void  St_1000(){
 System.out.println("Enter the number");
String n=sc.next();
int i=1;
while(i<=1000){
System.out.println(n);
i++;
}
    }

// 2)WAP to print N natural number.  

void  N_natural(){

System.out.println("enter n number");
int n = sc.nextInt();

for(int i=1;i<=n;i++)
{
    System.out.println(i);
}


}


// 3)WAP to find out the sum of N natural number.


void  Ns_natural(){

    System.out.println("enter n number");
    int n = sc.nextInt();
    int sum =0;
    for(int i=1;i<=n;i++)
    {sum = sum+i;
    }
    System.out.println(sum);
    
    
    }




    // 4)WAP to print table of a number.
void Table(){

    System.out.println("enter n number");
    int n = sc.nextInt();
    int tb =1;
    for(int i=1;i<=10;i++)
    {
        tb = i*n ;
        System.out.println(tb);

    }

    }




    // 5)WAP to find out the factorial of a number.
    void factorial(){
        System.out.println("Enter a Number");
        int n =sc.nextInt();
        int i=1;
        while (n!=0) {
        
           i = i*n;
            n--;
        }
        System.out.println(" "+i);
        
        
        }
        


  // 6)WAP to find out the factors of a number.

void  factor(){



    System.out.println("Enter the number for the factor");
    int n = sc.nextInt();
    for(int i=2; n!=1; i++)
    {

if(n%i==0){
    n=n/i;
}
System.out.println(i);
    }
}




// 7)WAP to check whether entered number is prime or not.
void prime(){
System.out.println("entered number is prime or not");
int n = sc.nextInt();
for (int i=2; i<=n/2; i++)
{
if(n%i==0)
{
System.out.println("ints not prime");
}
if{
System.out.println();



}




}



}




}




public class  As2{
public static void main(String []args){
All Ob = new All();

//  Ob.St_1000();

// Ob.N_natural();
// Ob.Ns_natural();  
// Ob.Table();
Ob.factor();
}
















}
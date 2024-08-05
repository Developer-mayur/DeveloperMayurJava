import java.util.Scanner;

class loop{
    Scanner sc = new Scanner(System.in);
// 1)WAP to print a statement 1000 number of times.
    void s_Statement(){
        int  i =1;
        while(i<=1000){
        System.out.println("Mayur"+i);
        i++;
        }
    }

    // 2) WAP to print N natural number.
    void N_natural2(){
        System.out.print("Enter  Num For Natural Num = ");
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
    }  
    //3) WAP to find out the sum of N natural number.
    void s_Nnum3(){
        int i=1;
        int sum=0;
        System.out.print("ENter N Number = ");
        int n = sc.nextInt();
        while (i<=n){
            sum=sum+i;
            i++;
        }System.out.println("sum = "+sum);
    }
    // 4) WAP to print table of a number.
    void table_Nnum4(){
        System.out.print("Enter Any Num For Table = ");
        int n = sc.nextInt();
        int i=1;
        while (i<=10) {
            System.out.print(" "+i*n);
            i++;
        }
    }
    //5) WAP to find out the factorial of a number.
    void factorial5(){
        System.out.print("Enter Any Num For Table = ");
        int n = sc.nextInt();
        int i=0;
        int sum=1;

        while (n!=0){
             sum=sum*n; 
             n--;
        }
        System.out.println(" "+sum);
    }
    //7) WAP to check whether entered number is prime or not.
    void check_n_prime7(){
        System.out.print("Enter num for Checking num is prime or not = ");
        int n = sc.nextInt();
        int i=2;
        boolean num = true; 
        while (i<n) {
            if(n%i==0){
            num = false;
            break;
            }
            System.out.println(i);
            i++;
        }if(num==true)
        System.out.println("You Entered Number is prime = "+n);
        else
        System.out.println("You Entered Number is not prime = "+n);
    }
    //8) WAP to print Fibonacci series.
    void Fibonacci8(){
        System.out.print("Enter Any num for Fabonacci Num  = ");
        int n = sc.nextInt();
        int i=1;
        int a=1;
        int b=1;
        System.out.print("0 1 1");
        while (i<=n) {
        int temp =a;  
            a=b;
            b=temp+b;
            System.out.print(" "+b);
            i++;
        }
    }
    // 9) WAP to print N even numbers.
    void Neven_num9(){
        System.out.print("Enter num for extract Even Num = ");
        int n = sc.nextInt();
        int i=1;
        while(i<n){
            if(i%2==0){
                System.out.print(" "+i);
            }
            i++;
        }
    }
    //11) WAP to print N odd numbers.
    void Nodd_num11(){
        System.out.print("Enter num for extract Odd Num = ");
        int n = sc.nextInt();
        int i=1;
        while(i<n){
            if(i%2!=0){
                System.out.print(" "+i);
            }
            i++;
        }
    }
    //13) WAP to print N natural numbers in reverse order
    void N_natural_rev13(){
        System.out.print("Enter N Natural num in Reveres Order = ");
        int n = sc.nextInt();
        int i=n;
        while(i!=0){
            System.out.print(i+" ");
            i--;
        }
    } 
    // 14) WAP to print alphabets in uppercase
    void Alpha_Upper_14(){
        char alphabets = 'A';
        while (alphabets<91) {
            System.out.print(" "+alphabets);
            alphabets++;
        }
    }
    // 15) WAP to print alphabets in lowercase
    void alpha_Lower_15(){
        char alphabets = 'a';
        while (alphabets<123) {
            System.out.print(" "+alphabets);
            alphabets++;
        }
    }
    //16) …... -6	-3	0	3	6	9	……. n terms	 
    void integer_Anth16(){
        System.out.print("Enter N Natural num in Reveres Order = ");
        int n = sc.nextInt();
        int i=1;
        int a= -6;
        int b=-3;
        int d=b-a;
        int anth ;

        anth = a+(n-1)*d;
        System.out.println(anth);

        // while (i<=n) {

        //      System.out.println(anth);
        //     i++;
        // }
    }


//  17) 1 	2	 4	 7	 11	 16 	…… n terms
void  Terms(){
int a = 1;
int d=0;
 int rs=0;
 Scanner Sc = new Scanner(System.in);
 System.out.println("enter series n th term");
 int n=Sc.nextInt();
for(int i=1;i<=n;i++){
 rs = a+d;
 System.out.println(rs);

rs = rs+a;
 a= rs-a;
 rs= rs-a;

d++;
 

}
 

}





// 18)1	2	2	4	8	32	…… n terms


void  T(){
int a = 1;
int d=0;
 int rs=0;
 Scanner Sc = new Scanner(System.in);
 System.out.println("1	2	2	4	8	32	…… n terms");
 int n=Sc.nextInt();
for(int i=1;i<=n;i++){
 rs = a+d;
  System.out.println(rs);
d++;
 
}

}





// 19)1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum)

// Sn = n/2 [2a + (n-1)d]

void su(){
double a= 1,b=0.5 ;
int n;
double d =b-a;
double sum,c=d;
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
  
sum = (n/2)*(2*a+(n-1)*d);
System.out.println(sum);

}


// 20)0	7	14	21	28	35	…..
void se(){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
  int a =0,b=7 ,d=b-a,sum=0;  
for(int i=0;i<n;i++){

sum= a+d;
sum=sum+a;
a=sum-a;
sum=sum-a;
System.out.print("  "+a);

}
  }


//   21)1,	4,	9,	16,	25	…..
void s(){
int a=0,an;
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
 n=n*2;
for(int d=1;d<=n;d++){
 if(d%2!=0){

 an=a+d;
an = a+an;
a=an-a;
an=an-a;
 System.out.println(a);
    }
}}






// 22)1	8	27	64	125	…..

void v(){


    
}













    //33) WAP to print Alphabets in reversing order.
    void Alpha_Revers_33(){
        char i = 122;
        while(i>96){
            System.out.print(" "+i);
            i--;
        }
    }

 
 




    //35) WAP to count number of digits
    void count_nDigits35(){
        System.out.print("Enter any num we count digits of that num = ");
        int n = sc.nextInt();
        int i=0;
        while (n>0){
            int divid = n%10;
                    n = n/10;
                    i++;
        }System.out.println("Total Digits Are = "+i);
    }
    //36) WAP to reverse a number
    void Reveres_num36(){
        System.out.print("Enter any num For Revers of that num = ");
        int n = sc.nextInt();
        int i=0;
        while (n>0){
            int divid = n%10;
                    n = n/10;
                    i=((i*10)+divid);
        }System.out.println("Riveres of num is = "+i);
    }
    
    //37) WAP to check whether entered number is palindrome or not
    void Check_palindrome37(){
        System.out.print("Enter any num For Checking num is palindrome or not = ");
        int n = sc.nextInt();
        int i=0;
        int temp = n;
        while (n>0){
            int divid = n%10;
                    n = n/10;
                    i=((i*10)+divid);
        }
        if(temp==i)
            System.out.println("Number is palindrome  "+temp+" = "+i);
        else
        System.out.println("Number is not palindrome "+temp+" = "+i);
    }




//   41)WAP to find out Lcm of a number by user input.
                   void Lcm(){
                   System.out.print("Enter a number = ");
                   int n = sc.nextInt();
                   int i= 2;
                   int temp = 1;
                      if(n==1||n==0){
                   System.out.println("o and 1 have same factorial as lcm");
                       System.out.println(n);
                   }else{
                   while(n>1){
                       if(n%i==0){
                   n= n/i ;
                   // temp = temp*i;
                   System.out.print(" "+i);
                   } else {
                       i++;
                    }}
                   }
                
                   



}



















//   42)WAP to find out Hcf of a number by user input.
                   void HCF(){
                   System.out.print("Enter a number = ");
                   int n = sc.nextInt();
                   int i= 2;
                   int temp = 1;
                   int check=1;
                      if(n==1||n==0){
                   System.out.println("o and 1 have same factorial as lcm");
                       System.out.println(n);
                   }else{
                   while(n>1){
                       if(n%i==0){
                       n= n/i ;
                           if(check<=1){
                            temp=temp*i;
                   System.out.println(" "+i);
                            check++;
                           }else{
                            check=1;
                           }
                   } else {
                       i++;
                       check=1;
                    }}
                   }System.out.println("HCF  is  = "+temp);
                
                   


                }
}

 

































public class As3 {
    public static void main(String[] args) {
        loop l = new loop();
        // l.s_Statement();
        // l.N_natural2();
        // l.s_Nnum3();
        // l.table_Nnum4();
        // l.factorial5();
        // l.check_n_prime7();
        // l.Neven_num();
        // l.Fibonacci8();
        // l.Neven_num9();
        // l.Nodd_num11();
        // l.N_natural_rev13();
        // l.Alpha_Upper_14();
        // l.alpha_Lower_15();
        // l.integer_Anth16();
        // l.Alpha_Revers_33();
        // l.count_nDigits35();
        // l.Reveres_num36();
        // l.Check_palindrome37();
        // l.Lcm
        // l.HCF();
        // l.Terms();
        // l.T() ;
        // l.su();
        // l.se();
        l.s();
     }
}

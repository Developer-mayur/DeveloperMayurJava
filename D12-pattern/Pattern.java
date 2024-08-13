
class P{
 
 //1.
    // 12345
    //  1234
    //   123
    //    12
    //     1
void p1(){
for(int i=5 ; i>=1;i--)
{ 

    for(int j=5; j>=i;j--){
        
        System.out.print(j);

    }
}}

 
// *****
// ****  
// ***
// **
// *

void p2(){
int n = 5;
for(int  i=n; i!=0;i--){
for(int j=1; j<=i;j++){
System.out.print("*");

}

System.out.println();
}
}

void p3(){
    int n = 5;
    for(int  i=0; i<n;i++){
    for(int j=n; j!=i;j--){
    System.out.print("*");
    
    }
    
    System.out.println();
    }
    }




void p4(){
int n=9;


for( int  i=0; i<n;i++){
System.out.println(i);

if(i<=n/2){



    

}

}
}








}










public class Pattern {
    public static void main(String[] args){
         P p = new P();
        // p.p1();
        // p.p2();
        // p.p3();
        p.p4();
    }
}
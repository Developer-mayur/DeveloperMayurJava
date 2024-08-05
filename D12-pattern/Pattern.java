
class P{
 //1.
    //  5
    //  54
  //    543
//      5432
//      54321
void p1(){
for(int i=5 ;i>=1;i--)
{ 

    for(int j=5; j>=i;j--){
        System.out.print(j);

    }
 

    System.out.println(" ");
}

}



// *       *     *
// *             *
// *       *     *
// *             *
// *             *
// *             *
void p2(){
    for(int i=1; i<=7; i++ )

    
{
for(int j=1; j<=7;j++){
  System.out.print(" ");  
 if(i==1||i==7||i==4||(j==1||j==4)){
System.out.print("*");


}
}

System.out.println(" ");

}



}








}












public class Pattern {
    public static void main(String[] args){
         P p = new P();
        p.p1();
        p.p2();
    }
}
// @1 wap to define an array of integer of size 6.Take input from user and display it in reverse
// order
import java.util.Scanner;




class Pr{

 void  P1(){
  System.out.println("@1 wap to define an array of integer of size 6.Take input from user and display it in reverse order");
  Scanner sc = new Scanner(System.in);
int arr[] =new  int[6];

//arr.length  hamesh total length   jo deta h vo 1 kam deta h (0) ko vo nhi ginta h
for(int i=0; i<arr.length;i++){
  arr[i] = sc.nextInt();


}

System.out.println("printting   in reverse  order");
int k= arr.length-1;
 
for(int j=0; k>=j; k--){

  System.out.println(arr[k]);


}

}



void P2(){
// @2 wap to ask 5 names from user and check if particular name exists in array or not.




}


}


public class Practice{
public static void main(String[]args){
Pr  p=new Pr();
p.P1();
p.P2()

}



}



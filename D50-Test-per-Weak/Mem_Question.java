import java.util.Scanner;

class Question{
  Scanner sc = new Scanner(System.in);
// @1 wap to define an array of integer of size 6.Take input from user and display it in reverse
// order
void t1(){

int []  arr =  new int[6];
for(int i=0; i<arr.length; i++){
  arr[i] = sc.nextInt();
    }

  System.out.println("reverse");

for(int j=arr.length-1; j>=0; j--){
  System.out.println(arr[j]);
}


}

// @2 wap to ask 5 names from user and check if particular name exists in array or not.

void t2(){
String []  arr =  new String[5]; 
boolean flag = false;
for(int i=0; i<arr.length; i++){
  arr[i] = sc.next();
    }

  System.out.println("cheake name");
  String s = sc.next();
  

  for(int j = 0; j<arr.length; j++){
    if(s.equals(arr[j])){
      flag = true;      
    }
    
  }
  if(flag){
    System.out.println("true");
    }
  
  if(!flag){
  System.out.println("false");
  }

}


// @3 wap to define an array of integer and assign value in program and print sum of all values
void t3(){
int arr[] = new  int [5];
int sum =0;
    for(int i =0; i<arr.length; i++){
     arr[i]= sc.nextInt();
sum+=arr[i];
     }
     System.out.println(sum);


}



// @4 wap to print max and minimum value in given array

void t4(){
  int [] arr = {1,2,3,4,5,6,7,8,9,0};
  int max =0;
  int min =0;
  for(int i=0; i<arr.length; i++){
if(arr[i]>=max){
  max= arr[i];
}
if(arr[i]<=min){
  min = arr[i];
}

  }
  System.out.println("max"+max);
  System.out.println("min"+min);
}

// @5 wap to find and print even numbers in given array

void t5(){
int arr[] = {1,2,3,4,5,6,7,8,9};
for(int i=0; i<arr.length; i++){
  if(arr[i]%2==0){
    System.out.print(arr[i]+",");
  }
}
System.out.println();
}


// @6 wap to find and print prime numbers in given array
void t6(){
int [] arr = {1,2,3,4,5,6,7,8,9} ;
boolean  flag= true;
for(int a : arr) {
      if (a <= 1) {
           flag = false;
      }
      for (int i = 2; i <= Math.sqrt(a); i++) {
          if (a % i == 0) {
              flag = false;
        
          }
          else{
             System.out.println(a);
          }
    
      }
   }




}


}
public class  Mem_Question{
public static void main(String []args){
Question q = new Question();
//  q.t1();
//  q.t2();
// q.t3();
// q.t4();
// q.t5();
q.t6();
 }

}

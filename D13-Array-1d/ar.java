// 1.Write a Java program to sort a numeric array and a string array.
// 2.Write a Java program to sum values of an array .
// 3.Write a Java program to calculate the average value of array element .
// 4.Write a Java program to test if an array contains a specific value .
// 5.Write a Java program to find the index of an array element .
import java.util.*;
class  arr{
 // 1.Write a Java program to sort a numeric array and a string array.

 void  m1(){
    int ar[] = {4,2,7,8,9,3,5,6,7,8,4,3,2,5,6,7,7,8,5,4,3,};
for(int i=0; i<ar.length;i++){

for(int j=i+1; j<ar.length;j++){
if(ar[i] > ar[j]){
 int temp = ar[i];
 ar[i]=ar[j];
 ar[j]=temp;

}
}
}
for(int k=0; k<ar.length;k++){

System.out.println(ar[k]);
}


 }


 void m02(){
// 1.Write a Java program to sort a string array.

String [] str = {"may","dfds","dfd","sdsd"};
 }



 void  m2(){
// 2.Write a Java program to sum values of an array .
 int ar[] = {3,4,4};

int sum= 0;
for(int i=0; i<ar.length;i++)
{
System.out.println(ar[i]);
sum=ar[i]+sum;

}
System.out.println("sum");

System.out.println(sum);
 }



 void m3(){
// 3.Write a Java program to calculate the average value of array element .
int arr[] = {2,3,4,5,6,4,4,3};
double sum=0,count =arr.length;
for(int i=0; i<arr.length;i++){
// System.out.println(arr[i]);
sum+=arr[i];
}
double avg= 0;
avg=sum/arr.length;
System.out.println(sum);
System.out.println(count);

System.out.println(avg);

 }


void m4(){
// 4.Write a Java program to test if an array contains a specific value .
int value =5;
int [] a = {2,3,4,5,6,7,8,9,9};
for(int i=0; i<a.length; i++){
    
if(a[i]==value){

System.out.println("contain" +" "  +value+   " "  +"this value");
}

}


}



// 5.Write a Java program to find the index of an array element .
void m5(){

int [] a = {1,4,5,6,7,5,45,4,3,3,3,34,5,5,1,4,5,};
int value = 1;
for(int i=0; i<a.length;i++){
if(a[i]==value)
System.out.println(i);
}

}


// @1 wap to define an array of integer of size 6.Take input from user and display it in reverse
// order

void m6(){
    int arr[]= new int[6];
 
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
      arr[i]= sc.nextInt();
    }
    System.out.println("reverse print");

    for(int j=arr.length-1; j>=0;j--){

System.out.println(arr[j]);

    }






}




// @2 wap to ask 5 names from user and check if particular name exists in array or not.
void m7(){
    // String[] arr= {"mayur","kartik","ramesh","dinesh"};
    String[] arr = {"mayur", "kartik", "hari", "uma", "sumit"};
    Scanner sc = new Scanner(System.in);
    String s =sc.next();
    // System.out.println(arr[0]);
for(int i=0; i<arr.length;i++){
     if(arr[i].equals(s)){
 System.out.println("exist||");

    System.out.println(arr[i]);
}
// System.out.println("looop");
}
}


// @3 wap to define an array of integer and assign value in program and print sum of all values

void  m8(){
int arr[] = new int[5];
Scanner sc =new Scanner(System.in);
int sum=0;

for(int i=0; i<arr.length; i++){
arr[i]= sc.nextInt();
sum+=arr[i];

}

System.out.println("sum =>"+" "  +sum);

}





// @4 wap to print max and minimum value in given array

void m9(){
int arr[] = {3,5,6,5,44545,3,6,6,4,1,7,54,0,6};
int max = 0;
int min=arr[0] ;

for(int i=0; i<arr.length; i++){
if(arr[i] >= max){
max = arr[i];
}

if(arr[i]<=min){

min = arr[i];

}


}
System.out.println(max);
System.out.println(min);




}

// @5 wap to find and print even numbers in given array

void m10(){
int arr[] ={1,2,3,4,5,6,7,8,9,9,8,6,56,4,3,2,2};
for(int i=0; i<arr.length;i++){

if(arr[i]%2==0){
System.out.println(arr[i]);

}

}

}




// @6 wap to find and print prime numbers in given array
void m11(){




}





}


 


 public class ar{
 public static void main(String[]args){
arr  a = new arr();
// a.m1();
// a.m11();
// a.m2();
// a.m3();
// a.m4();
// a.m5();
// a.m6();
// a.m7();
// a.m8();
a.m9();
a.m10();
 }
 }
// 1.Write a Java program to sort a numeric array and a string array.
// 2.Write a Java program to sum values of an array .
// 3.Write a Java program to calculate the average value of array element .
// 4.Write a Java program to test if an array contains a specific value .
// 5.Write a Java program to find the index of an array element .
import java.util.*;

class  arr{
            Scanner sc = new Scanner(System.in);

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
void m21(){
int arr[] ={1,0,5,9,4,3,7,8,9,};
int prime =0;
         for(int i=0; i<arr.length;i++){
            boolean flag=true;
         for(int k=2; k<arr[i];k++){   
            if(arr[i]%k==0){
                     flag=false;
                     break;      
            }
         }if(flag){
            if(arr[i]>1){
                System.out.println(arr[i]+" is prime:");
            }
            else{
                System.out.println("0 and 1 is not considered as prime number.");
            }
            }
        
         }


}

// @7 wap to search a particular number in given array and print its position
void m22()
{
    
int[] arr ={2,3,4,5,6,7,8,93,3,3,4,5,6};
int value=sc.nextInt();
for(int i=0; i<arr.length; i++){
if (arr[i]==value){
    System.out.print("index=>");
    System.out.print(i);  
     System.out.print(",");
}

}
}


// @8. Write a program to find the sum and product of all elements of an array.

void m24()
{
    int sum =0;
    int product =0;
int[] arr ={2,3,4,5,6,7,8,93,3,3,4,5,6};
for(int i=0; i<arr.length; i++){
for(int j=0; j<arr.length; j++){
sum =arr[i]+arr[j];
System.out.print("("+arr[i]+"+"+arr[j]+")"+"==>"+sum);
System.out.print(",");
System.out.println();
product = arr[i]*arr[j];
System.out.print("("+arr[i]+"*"+arr[j]+")"+"===>"+product);
System.out.println();



}
}

}



// @9.Initialize and print all elements of a 2D array.

void  m25(){
    int[][][] arr = new int [3][3][3];

for(int i=0; i<arr.length;i++){
    for(int j=0; j<arr.length;j++){
      for(int k=0; k<arr.length;k++){
     arr[i][j][k]=sc.nextInt();
    }
    }
}
 for(int k=0; k<arr.length;k++){
    for(int l=0; l<arr.length;l++){
        for(int m=0; m<arr.length;m++){
        System.out.print(arr[k][l][m]);

    }
    } System.out.println();
}


}



//  Q1. Find the majority element in array.
// (A majority element in an array is an element that appears more than n/2 times where n is the size of the array.)
 void m11(){
 int arr[]= {1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2};

    int maxIndex = arr.length/2;

for(int i =0; i<arr.length; i++){
int n =0;
    boolean flag=true;
    for(int k=0; k<i; k++){
        if(arr[i]==arr[k]){
            flag=false;
            break;
        }
    }
if(flag){
for(int j=i;  j<=arr.length-1; j++ ){
if(arr[i]==arr[j]){
    n++;
}
 }
 
if(n>=maxIndex){
    System.out.println("max");
    System.out.println(" "+arr[i]);
}

}
}
}









// Q2.Java Program To Find Two Elements whose Sum is Closest to Zero.
// ( Two elements in a given array of positive  and negative numbers such that their sum is close to zero.)
// for example- taking array   {-2,-1,3,6,5}
// output:  -2 and 3
void m12(){
    int a=0;
  int arr[] = {-2,-1,3,6,5} ;
  
     for(int i=0; i<arr.length-1;i++){
       for(int j=i+1; j<arr.length;j++){

          if(arr[i]+arr[j]==1){
            System.out.println(arr[i]+" "+arr[j]);
}
}

 }
    

 } 

// Q3.  To check the number is facinating number or not. 
// (A fascinating number is a number that, when multiplied by 2 and 3, 
// results in a concatenation of the original number and its products (in any order), 
// containing all digits from 1 to 9 exactly once. For example, the number 192 is a fascinating number because:
// 192 * 1 = 192
// 192 * 2 = 384
// 192 * 3 = 576
// Concatenating the results: 192384576 contains all digits from 1 to 9 exactly once.)



// Q4. Permutation of string.

    
// Q5. WAP To  Convert a String to an Integer .
// for example-
// Input-"56789"
// Output-56789.








// Q6.
// 3 3 3 3 3
// 3 2 2 2 3 
// 3 2 1 2 3
// 3 2 2 2 3
// 3 3 3 3 3
   
void m16(){
for(int i=1;i<=5;i++){
for(int j=1;j<=5; j++){

if(i==1||i==5|| j==1||j==5){
    System.out.print("3");
}


 else 
 if(i==3&&j==3){
System.out.print("1");
}

else{
    System.out.print("2");
}

}
System.out.println();
} 
}
  









    //Q.1 Peak an element

// An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
// Given an array arr[] of size N, find the index of any one of its peak elements.
// Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.

    void peak_1(){
            int arr[]={12,1,5,3,7,15,16,18,2,0};
            System.out.println("Enter the element you want to check");
            int n = sc.nextInt();
            boolean flag=false;
            boolean flag2=false;
            for(int i=0;i<arr.length;i++){
                if (arr[i]==n) {
                    flag2=true;
                }
                if(i==0 && arr[i]==n){
                    if(arr[i]>arr[i+1]){
                        System.out.println("It is peak element");
                        flag=true;
                        break;
                    }
                }
                else if (i==arr.length-1) {
                    if(arr[i]>arr[i-1] && arr[i]==n ){
                        System.out.println("It is peak element");
                        flag=true;
                        break;
                    }
                }
                else{
                    if (arr[i]==n && arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
                        System.out.println("It is peak element");
                        flag=true;
                        break;
                    }
                }

            }
            if (!flag) {
                System.out.println("It is not a peak element");
            }
            if (!flag2) {
                System.out.println("Also it is not present in array");
            }
    }




// @10. Take 20 integer inputs from user and print the following:
// number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of Os.
void  m31(){

int[] arr = new int[20];
for(int i=0;i<arr.length;i++){
arr[i]= sc.nextInt();
}

for(int j=0; j<arr.length;j++){
 if(arr[j]>=0){
  System.out.println("Positive"+arr[j]);
 }

for(int k=0; k<arr.length;k++){
         if(arr[k]<=0){
         System.out.println("Nagative"+arr[k]);
         }
}

for(int l=0; l<arr.length;l++){
         if(arr[l]%2==0){
         System.out.println("even"+arr[l]);
         }

         else{
         System.out.println("odd"+arr[l]);
         }
}

         
        

}

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
// a.m9();
// a.m10();
// a.m1();
// a.m12();
// a.m16();
// a.m21();
// a.peak_1();
// a.m22();
// a.m24();
// a.m25();
a.m31();
 }
 }
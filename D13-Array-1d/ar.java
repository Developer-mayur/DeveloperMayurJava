// 1.Write a Java program to sort a numeric array and a string array.
// 2.Write a Java program to sum values of an array .
// 3.Write a Java program to calculate the average value of array element .
// 4.Write a Java program to test if an array contains a specific value .
// 5.Write a Java program to find the index of an array element .

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


 void m11(){
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





 }


 public class ar{
 public static void main(String[]args){
arr  a = new arr();
// a.m1();
a.m11();
// a.m2();
// a.m3();
// a.m4();
// a.m5();
 }
 }
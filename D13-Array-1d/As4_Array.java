import java.util.Scanner;
class Array{
Scanner sc=new Scanner(System.in);

// Q.1 Peak an element

// An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
// Given an array arr[] of size N, find the index of any one of its peak elements.
// Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.

// Example 1:
// Input:
// N = 3
// arr[] = {1,2,3}
// Output: 1
// Explanation: index 2 is 3.
// It is the peak element as it is 
// greater than its neighbour 2.
// Example 2:
// Input:
// N = 2
// arr[] = {3,4}
// Output: 1
// Explanation: 4 (at index 1) is the 
// peak element as it is greater than 
// its only neighbour element 3.
// Constraints:
// 1 ≤ N ≤ 105
// 1 ≤ A[] ≤ 106
void  peak(){
int arr[] =  {1,2,3};
System.out.println("Enter Input");
int N= sc.nextInt();

for (int i=1; i<=arr.length; i++){
if(arr[0]>=arr[1]){
if(arr[0]>=arr[2]){
    System.out.println("index 0 is peak element");
}


if (arr[1]>=arr[2]){
    if(arr[0]>=arr[1]){
        if(arr[0]>=arr[2]){
            System.out.println("index 1 is peak element");
       
            
        
        
        }


    else{
        System.out.println(arr[3]+ "is peack element");
    }    

        }}
}









}






}




//Q.2 Find minimum and maximum element in array
void M_M_element(){
int arr[]={1,7,3,8,2,45,4,45,45,45,45,45,45,3434,345,2};
int max= arr[0];
int min= arr[0];

for(int i=1 ;i<arr.length; i++)
{
if(max<arr[i]){
    max= arr[i];  
 }


if (min>arr[i]){
    min= arr[i];
}
}
System.out.println("maximun element ="+max);
System.out.println("minimum element ="+min);

}



// Q.3 Write a program to reverse the array.
void  Reverse_arrey(){
int arr[]=  {1,5,2,3,4,9,6,6,8};

int j = arr.length-1;
 for(int i=0; j>=i;j--){
System.out.println(arr[j]);

 }


 
}



// Q.4 Write a program to sort the array

void  sort(){

int arr[]= {6,4,8,3,9,1,0,2};
for(int i=0; i<arr.length; i++){
for(int j=0; j<arr.length; j++){
System.out.println(arr[j]);


}
}
}



// Q.5 Find the kth largest and kth smallest element in array.

void Kth_Elements(){
    int arr[]={1,2,3,4,5,6,7,8,9};
    int max= arr[0];
    int min= arr[0];
    
    for(int i=1 ;i<arr.length; i++)
    {
    if(max<arr[i]){
        max= arr[i];  
     }
    
    
    if (min>arr[i]){
        min= arr[i];
    }
    }
    System.out.println(" 'kth' maximun element ="+max);
    System.out.println(" 'kth'minimum element ="+min);
    
    }


    // Q.5.2 Find occurance of an integer number in array.
void  Int_array(){
int arr[]= {1,1,2,3,4,5,6,7,4,6,3,4,4,4,4};
for(int i=0 ; i<=arr.length; i++){
    int count;
    //   arr[i];



    for(int j=0 ; j<=arr.length; j++){
System.out.println(i);


    }





}




}









}
public class  As4_Array{
public static void main(String []args){
Array Ob = new Array();
// Ob.peak();
// Ob.M_M_element();
Ob.Reverse_arrey();
// Ob.sort();
// Ob.Kth_Elements();
// Ob.Int_array();
 }

}

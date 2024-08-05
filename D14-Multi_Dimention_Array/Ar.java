import java.util.Scanner;
class Array{
    Scanner sc = new Scanner(System.in);

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
// Q.2 Find minimum and maximum element in array
  void  min_max_2(){
        System.out.println("Enter Size of an array");
        int n = sc.nextInt();
        System.out.print("Enter values in Array = ");
        int arr1[] = new int[n];
        int max=0,min=2147483647;                              

        for(int i=0; i<arr1.length; i++){
             arr1[i] = sc.nextInt();
        }
        for(int j=0; j<arr1.length; j++){
            if(arr1[j]>max){
                max=arr1[j];
            }if(arr1[j]<min){
                min=arr1[j];
            }
        }System.out.println("Maximum Value of arrray is = "+max);
        System.out.println("Minimum Value of arrray is = "+min);
    }
//Q.3 Write a program to reverse the array.

    void reverse_3(){
        int arr[] = {1,2,3,4,5};
        int arr2[]= new int[arr.length];
        System.out.print("Reverse of array is 1,2,3,4,5 = ");
        for(int i=0; i<arr.length; i++){
            arr2[i]=arr[arr.length-i-1];
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr2[i]+", ");
        }
       
    }
//3.2
    void reverse_3_2(){
        int arr[] = {1,2,3,4,5};
        System.out.print("Reverse of array is 1,2,3,4,5 = ");
        for(int k=arr.length-1; k>=0; k--){
            System.out.print(arr[k]+",");
        }
    }
//3.3
void reverse_3_3(){
    int arr[] = {1,2,3,4,5};
    System.out.print("Reverse of array is 1,2,3,4,5 = ");
    for(int i=0,j=arr.length-1; i<j;i++,j--){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+", ");
    }
    }

//Q.4 Write a program to sort the array
void Short_4(){
    int arr[] = {2,4,7,3,8,5,6};
    System.out.print("Shorting of Array is 2,4,7,3,8,5,6 = ");
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr.length-1-i;j++)
        if(arr[j]>arr[j+1]){
        int temp =arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
        }
    }
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+", ");
    }
}
//Q.5 Find the kth largest and kth smallest element in array.
void kth_larg_small_5(){
    int arr[]={2,3,4,56,6,5,7,9,0,34,76,10};
    System.out.print("Enter largest kth element in the array bw 1  to 12 = ");
        int n = sc.nextInt();
        System.out.print("Enter Smalest kth element in the array bw 1  to 12 = ");
        int m = sc.nextInt();
    System.out.print("arr of 2,3,4,56,6,5,7,9,0,34,76,10 =");
    for(int i=0;i<arr.length; i++){
        for(int j=0; j<arr.length-1-i; j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
        for(int i=0; i<arr.length-1; i++){
        System.out.print(arr[i]+", ");
    }
    System.out.println("\nSmallest elment is"+n+" = "+arr[n-1]);
    System.out.println("Largest elment is"+m+" = "+arr[arr.length-m-1 ]);

    
}
//Q.5 Find occurance of an integer number in array.
void occurance_5_1(){
    int arr[] ={12,3,4,1,3,5,4,63,7,34,6,8,2,5,67,9};
        System.out.print("Enter number for finding Occurance  = ");
        int n = sc.nextInt();
        boolean flag = false;
        int count=0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]==n){
            count++;
            flag=true;
        }
    }
    if(!flag){
        System.out.println("you Entered number is out of the array");
    }else
    System.out.println("Ocurance you enterd number is = "+count);
}
//Q.6 Sort the array of 0s , 1s and 2s.
void Short_0s_1s_2s_6(){
    int arr[] =  { 0,1,2,0,0,1,1,0,0,2,2,};
    System.out.print("array convert in to 0s,1s,2s = 0,1,2,0,0,1,1,0,0,2,2,= ");
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr.length-1; j++){
            if(arr[j]>arr[j+1]){
            int temp =arr[j];
            arr[j]=arr[j+1];    
            arr[j+1]=temp;
            }
        }
    }
    for(int i=0; i<arr.length-1; i++){
        System.out.print(arr[i]+"," );
    }
}
//Q.7 Sub array with given sum
//Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
void Sub_Sum_7(){
    int arr[] =  { 1,3,4,5,2,7,11,14,21,19,9,8};
    System.out.print("Enter Element for sum check sum is equal in the Array elements  or not = ");
    int s = sc.nextInt();
    int sum;
    boolean flag = true;
    for(int i=0; i<arr.length; i++){
        sum=0;
        for(int j=i; j<arr.length; j++){
            sum+=arr[j];
            if(sum==s){
                System.out.println("Sum of element from "+i+" position to  "+j+" position");
                flag = false;
                break;
            }
            if(sum>s){
                break;
            }
        }
        if(!flag){
            break;
        }
    }if(flag){
        System.out.println("You enterd Number sum is not present in array");
    }  
}
//Q.8 Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

// Example 1:
// Input : 
// N = 8
// arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
// Output : 
// 1  3  2  11  6  -1  -7  -5

void saperate_posi_negative_8(){
    int arr[] =  { 1,-5,-2,8,-3,2,3,-7,-2,2,3,-2,4,6,-3,9,-3,9 };
    System.out.print("Saperate Array positive or Negative Values 1,-5,-2,8,-2,2,3,-2,4,6,-3,9,-3,9 = ");
    int k=0;
    for(int i=0; i<=arr.length+1; i++,k++){
        if(arr[k]<0){
            int temp=arr[k];
        for(int j=k; j<arr.length-1; j++){
            arr[j]=arr[j+1];
        }
        arr[arr.length-1]=temp;
        // if(k==arr.length)
        // break;
        if(arr[k]<0){
            --k;
        }
        
    }
    }
    System.out.println();
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    } 

}
// Q.9 Find the Union and Intersaction of two sorted array.
// Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays. 
// Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.
// Example 1:
// Input:
// 5 3
// 1 2 3 4 5
// 1 2 3
// Output: 
// 5

// void  union_9(){
    // int arr[] =  {1,2,5,7,9,10};
    // int arr2[] =  { 1,2,4,5,6,7,8,9,2};
    // int union[] = new int[arr.length+arr2.length];

    //   int union[]=arr[]+arr2[];
    // for(int i=0; i<union.length; i++){
    //     union[i]=arr[i];
    // }

    // for(int i=0; i<arr2.length; i++){
    //     boolean flag=true;
    //     for(int j=0; j<arr2.length; j++){
    //         if(arr[i]==arr2[j]){

    //             flag=false;
    //         }
    //         if(i==arr.length-1)
    //         break;
    //     }
    //     if(flag)
    //     union[i]=arr[i];
    // }
    // for(int i=0; i<union.length; i++){
    //     System.out.print(union[i]);
    // }

// }
void union_9(){
    int arr[] =  {1,2,5,4};
    int arr2[] =  { 1,2,4,4,7,8,9};
    int union[] = new int[arr.length+arr2.length];
    for(int i=0; i<union.length; i++){
        if(i>=arr.length)
        union[i]=arr2[i-arr.length];
        else
        union[i]=arr[i];
    }
    for(int i=0; i<union.length; i++){
        System.out.print(" "+union[i]);
    }System.out.println();

    int temp=0;
    for(int i=0; i<union.length-temp; i++){
        for(int j=i+1; j<union.length-temp; j++){
            if(union[i]==union[j]){
            for(int k=j; k<union.length-1; k++){
                union[k]=union[k+1];
            }
             j--;
            temp++;
          }
        }
    }
    System.out.println();
    System.out.print("Union of array = ");
    for(int i=0; i<union.length-temp; i++){
        System.out.print(union[i]+" ");
    }
}

// Q.10. Write a program to cyclically rotate array by one.
void cyclically_ratate_10(){
    int arr[] = {1,2,3,4,5};
    int temp=arr[arr.length-1];
    for(int i=0; i<arr.length-1; i++){
        arr[arr.length-i-1]=arr[arr.length-2-i];
    } 
    arr[0]=temp;
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
        } 
}

//Q.11 Count pair with given sum.
// Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
// 
// Example 1:
// Input:
// N = 4, K = 6
// arr[] = {1,5,7,1}
// Output: 2
// Explanation: 
// arr[0] + arr[1] = 1 + 5 = 6 
// and arr[1] + arr[3] = 5 + 1 = 6.
void sum_pair_count_11(){
    int arr[] = {1,2,4,5,7,8,10,15,26,38,27};
    System.out.print("Enter any number for find how many pair sum in Array = ");
    int n = sc.nextInt();
    int count=0;
    for (int i = 0; i<arr.length; i++) {
        for (int j=i; j<arr.length; j++) {
           int sum = arr[i]+arr[j];
            if(sum==n){
                count++;
            }
        }
    }System.out.println(count);
}

// Q.12
// Find common elements in three sorted arrays.
// Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
// Note: can you take care of the duplicates without using any additional Data Structure?
// Example 1:
// Input:
// n1 = 6; A = {1, 5, 10, 20, 40, 80}
// n2 = 5; B = {6, 7, 20, 80, 100}
// n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
// Output: 20 80
// Explanation: 20 and 80 are the only
// common elements in A, B and C.

void common_in_three_arr_12(){
    int arr1[] = {1,2,4,5,7,8,10,};
    int arr2[] = {8,10,15,26,38,27};
    int arr3[] = {5,7,8,10,15,26,38,27};

    for(int i=0; i<arr1.length; i++){
        for (int j=0; j<arr2.length; j++) {
        if(arr1[i]==arr2[j]){
            for (int k=0; k<arr3.length; k++) {
                if(arr1[i]==arr3[k]){
                    System.out.print(arr3[k]+" ");
                }
            }
        }
    }
  } 
}

// Q.13
// Find the first repeating element in array of integers 
void First_repeating_13(){
int arr[] = {5,7,8,10,2,4,5,6,4};
boolean flag=false;
for(int i=0; i<arr.length; i++){
    for (int j=i+1; j<arr.length-1; j++){
        if(arr[i]==arr[j]){
            System.out.println("First Repating element in the Array is = "+arr[j]);
            flag = true;
            break;
        }        
    }
    if (flag)
    break;

  }
}

// Q.14. Find the first non-repeating elment in given array of integers
// Find the first non-repeating element in a given array arr of N integers.
// Note: Array consists of only positive and negative integers and not zero.
// Example 1:
// Input : arr[] = {-1, 2, -1, 3, 2}
// Output : 3
// Explanation:
// -1 and 2 are repeating whereas 3 is 
// the only number occuring once.
// Hence, the output is 3.

void First_non_repeating_14(){
    int arr[] = {5,7,8,10,2,4,5,6,4};
    boolean flag=false;
    for(int i=0; i<arr.length; i++){
        flag=false;
        for (int j=i+1; j<arr.length-1; j++){
            if(arr[i]==arr[j]){
                flag = true;
                break;
            }        
        }
        if (flag==false){
            System.out.println("First Non Repating element in the Array is = "+arr[i]);
            break;
        }
    
      }
    }

    // Q.15
    // Sub with equal 0s and 1s
    // Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s. 
    // Example 1:
    // Input:
    // n = 7
    // A[] = {1,0,0,1,0,1,1}
    // Output: 8
    // Explanation: The index range for the 8 
    // sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), 
    // (4, 5) ,(2, 5), (0, 5), (1, 6)
    // Example 2:
    // Input:
    // n = 5
    // A[] = {1,1,1,1,0}
    // Output: 1
    // Explanation: The index range for the 
    // subarray is (3,4).
    
void equal_pair_0s_1s_15(){
    int arr[] = {1,0,0,1,0,1,1};
    int zero=0,one=0,count=0;
    for(int i=0; i<arr.length; i++){
        zero=0;one=0;
        for (int j=i; j<arr.length; j++){
            if(arr[j]==0)
            zero++;
            else
            one++;
        if (zero==one){
           count++;
        }
    
      }
    } System.out.println("Total pair of equal 0s and 1s is = "+count);
}

// Q.16
// Rearrange the array in alternating positive and negative items
// Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
// Note: Array should start with positive number.
// 
// Example 1:
// Input: 
// N = 9
// Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
// Output:
// 9 -2 4 -1 5 -5 0 -3 2
// Example 2:
// Input: 
// N = 10
// Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
// Output:
// 5 -5 2 -2 4 -8 7 1 8 0 

void unsorted_pos_neg_pos_neg_3_16(){
    int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, -3, -8};
    int p=0,n=0;
    System.out.println(" -5, -2, 5, 2, 4, 7, 1, 8, -3, -8 = ");

    for (int i=0; i<arr.length; i++){
        if(arr[i]>0)
        p++;
        else
        n++;
    }

    int pos[] = new int[p];
    int neg[] = new int[n];
    p=0;n=0;

    for (int i=0; i<arr.length; i++){
        if(arr[i]>0){
        pos[p]=arr[i];
        // System.out.println("pos = "+pos[p]);
        p++;
        }
        else{
        neg[n]=arr[i];
        // System.out.println("neg = "+neg[n]);
        n++;
        }
    }

    // for (int i = 0; i < neg.length; i++) {
        
    //     System.out.print(neg[i]+" ");
    // } for (int i = 0; i < pos.length; i++) {
    //     System.out.print(pos[i]+" ");
    // }


    p=0;n=0;
    for (int i=0; i<arr.length; i++) {
        if(pos.length>p && neg.length>n){
            if(i%2==0){
                arr[i]=pos[p];
                ++p;
                // System.out.println(" p = "+arr[i]); 
            }else{
                arr[i]=neg[n];
                ++n;
                // System.out.println(" n = "+arr[i]);
            }
        }else{
            if(pos.length>p){
                arr[i]=pos[p];
                // System.out.println(arr[i]);
                p++;
            }else{
                arr[i]=neg[n];
                // System.out.println(arr[i]);
                n++;
            }
        }

    }

    
    for (int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
}

// Q.17 Find it there is any subarray with sum equals to zero
// Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
// Example 1:
// Input:
// 5
// 4 2 -3 1 6
// 
// Output: 
// Yes
// 
// Explanation: 
// 2, -3, 1 is the subarray 
// with sum 0.
// Example 2:
// Input:
// 5
// 4 2 0 1 6
// 
// Output: 
// Yes
// 
// Explanation: 
// 0 is one of the element 
// in the array so there exist a 
// subarray with sum 0.

void array_sum_zero_17(){
    int arr[] = { 4,2 ,-3,1,6};
    int sum=0;
    boolean flag=false;
    for(int i=0; i<arr.length; i++){
        sum=0;
        for (int j=i; j<arr.length; j++){
            sum += arr[j];
            if(sum==0){
                flag = true;
                break;
            }        
        }
        if (flag){
            System.out.println("Yes array have present sum is eual to zero");
            break;
        }
    
      }if(!flag){
        System.out.println("NO array have not present sum is eual to zero ");
      }
}

// Q.18) Find largest sum contigeous sub array
// Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
// 
// Example 1:
// Input:
// N = 5
// Arr[] = {1,2,3,-2,5}
// Output:
// 9
// Explanation:
// Max subarray sum is 9
// of elements (1, 2, 3, -2, 5) which 
// is a contiguous subarray.
// Example 2:
// Input:
// N = 4
// Arr[] = {-1,-2,-3,-4}
// Output:
// -1
// Explanation:
// Max subarray sum is -1 
// of element (-1)

void max_sum_array_18(){
    int arr[] = {1,2,3,-2,5};
    int max=arr[0];
    for(int i=0; i<arr.length; i++){
        int sum=0;
        for (int j=i; j<arr.length; j++){
            sum += arr[j];
            if(sum>max){
                max=sum;
            }        
        }
        
      }System.out.println("Maximum sum in the array is = "+max);
}

// Q.19) Find Maximum product contigeous sub array 
// 
// Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.
// Example 1:
// Input:
// N = 5
// Arr[] = {6, -3, -10, 0, 2}
// Output: 180
// Explanation: Subarray with maximum product
// is [6, -3, -10] which gives product as 180.
// Example 2:
// Input:
// N = 6
// Arr[] = {2, 3, 4, 5, -1, 0}
// Output: 120
// Explanation: Subarray with maximum product
// is [2, 3, 4, 5] which gives product as 120.

void max_produc_array_19(){
    int arr[] = {6, -3, -10, 0, 2};
    int max=arr[0];
    for(int i=0; i<arr.length; i++){
        int sum=1;
        for (int j=i; j<arr.length; j++){
            sum *= arr[j];
            if(sum>max){
                max=sum;
            }        
        }
        
      }System.out.println("Maximum Production in the array is = "+max);

}

// Q.20 Longest consecutive sequence.
// Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
//  
// Example 1:
// Input:
// N = 7
// a[] = {2,6,1,9,4,5,3}
// Output:
// 6
// Explanation:
// The consecutive numbers here
// are 1, 2, 3, 4, 5, 6. These 6 
// numbers form the longest consecutive
// subsquence.
// Example 2:
// Input:
// N = 7
// a[] = {1,9,3,10,4,20,2}
// Output:
// 4
// Explanation:
// 1, 2, 3, 4 is the longest
// consecutive subsequence.

void consecutive_array_20(){
   int  arr[] = {1,9,3,10,4,20,2};
    for(int i=0;i<arr.length; i++){
        for(int j=0; j<arr.length-1-i; j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }

    // for (int i = 0; i < arr.length; i++) {
    //     System.out.print(arr[i]+" ");
    // }

    int count=1;
    int count2=0;

    for (int i=0; i<arr.length-1; i++) {

        if(arr[i]==arr[i+1]-1){
            count++;
        }else{
            count=1;
        }
        if(count>count2)
        count2=count;
    }
    System.out.println(" Total Consecutive element in the array is = "+count2);
}

// Q.21 Max Sum in configuration
// 
// Given an array(0-based indexing), you have to find the max sum of i*A[i] where A[i] is the element at index i in the array.The only operation allowed is to rotate(clock-wise or counter clock-wise) the array any number of times.
// Example 1:
// Input:
// N = 4
// A[] = {8,3,1,2}
// Output: 29
// Explanation: Above the configuration
// possible by rotating elements are
// 3 1 2 8 here sum is 3*0+1*1+2*2+8*3 = 29
// 1 2 8 3 here sum is 1*0+2*1+8*2+3*3 = 27
// 2 8 3 1 here sum is 2*0+8*1+3*2+1*3 = 17
// 8 3 1 2 here sum is 8*0+3*1+1*2+2*3 = 11
// Here the max sum is 29


void Max_configuration_rotat_array_21(){
     int arr[] = {8,3,1,2};
     int max=0;
    for (int i=0; i<arr.length-1; i++) {
        int sum=0;
        for (int j =0; j<arr.length; j++) {
            sum=sum+(arr[j]*j);
        }
        if(sum>max){
            max=sum;
        }
        int temp=arr[0];
        for (int j=0; j<arr.length-1; j++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }
    System.out.println("Max sum Configuration in rotated array is = "+max);
}

// Q.22) C program to find nearest lesser and greater element in array
// Given an array of N elements and we have to find nearest lesser and nearest greater element using C program.
// Example:
    // Input:
    // Enter the number of elements for the arrray : 3  
//  
    // Enter the elements for array_1.. 
    // array_1[0] : 1   
    // array_1[1] : 2   
    // array_1[2] : 3   
//  
    // Enter the number : 2 
//  
    // Output:
    // Element lesser than 2 is : 1 
    // Element greater than 2 is : 3

    void user_enterd_nearest_leaser_grater_22(){
        int arr[] = {1,3,8,2,4,9,7,10,5,11,6,12};
        System.out.println(" Remember one thing is num must be grater than 1 and less than 12 ");
        System.out.print(" Enetr a num to find nearest lowest and gratest num in the array = ");
        int user = sc.nextInt();
        int idx=0;
        boolean flag=false;
       for (int i=0; i<arr.length; i++) {
        if(user==arr[i]){
            flag=true;
            idx=i;
            break;
        }
       }
       int grater=0;
       int lowest=0;
       if(flag){
        for(int i=1,j=1; i<arr.length; i++,j++){
            if(user<arr[idx+i] && arr[idx+i]>arr[idx-j]){
                grater=arr[idx+i];
                break;
            }else if(user<arr[idx-j] && arr[idx-j]>arr[idx+i]){
                grater=arr[idx-j];
                break;
            }else{
                if(idx-j-1==0)
                j--;
                if(idx+i+1==arr.length-1)
                i--;
            }
        }for(int i=1,j=1; i<arr.length; i++,j++){
            if(user>arr[idx+i] && arr[idx+i]<arr[idx-j]){
                lowest=arr[idx+i];
                break;
            }else if(user>arr[idx-j] && arr[idx-j]<arr[idx+i]){
                lowest=arr[idx-j];
                break;
            }else{
                if(idx-j-1==0)
                j--;
                if(idx+i+1==arr.length-1)
                i--;
            }
        }
        System.out.println("Lowest element of entred is "+user+" = "+lowest);
        System.out.println("Gratest element of entred is "+user+" = "+grater);
       }else
       System.out.println("you entered num is wrong....\n please retry...");
    }   

// 23. Write a Java program to find the sum and average of one dimensional integer array. 

     void Average_sum_array_23(){
        int arr[] = {1,3,8,2,4,9,7,10,5,11,6,12};
        float sum=0;
        for (int i=0; i<arr.length; i++){
            sum = sum+arr[i];            
        } sum=sum/arr.length;
        System.out.println("average of one dimensional integer array is.... = "+sum);
     }

    //  24. Write a Java program to swap first and last element of an integer 1-d array.

    void Swap_first_last_1D_array_24(){
        System.out.println("first and last element of an integer 1-d array is.... =1,3,8,2,4,9,7,10,5,11,6,12 ");
        int arr[] = {1,3,8,2,4,9,7,10,5,11,6,12};

        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        
        } 
     }

    //  25. Write a Java program to reverse the element of an integer 1-D array. 

    void Reverse_1D_array_25(){
        System.out.println("reverse the element of an integer 1-D array is.... = 1,2,3,4,5,6,7,8 ");
        int arr[] = {1,2,3,4,5,6,7,8};

        
        for (int i=0,j=arr.length-1; i<j; i++,j--) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        }
        
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        } 
     }

    //  26. Write a Java program to find the largest and smallest element of an array.

    void  largest_smallest_elem_array_26(){
        System.out.print("Enter Size of an array = ");
        int n = sc.nextInt();
        System.out.println("Enter values in Array = ");
        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++){
             arr[i] = sc.nextInt();
        }
        int largest=arr[0],smallest=arr[0];                              

        for(int j=0; j<arr.length; j++){
            if(arr[j]>largest){
                largest=arr[j];
            }if(arr[j]<smallest){
                smallest=arr[j];
            }
        }System.out.println("Largest Value of arrray is = "+largest);
        System.out.println("Smallest Value of arrray is = "+smallest);
    }

     

    void  find_val_presnt_or_not_array_28(){
        System.out.print("Enter Size of an array = ");
        int n = sc.nextInt();
        System.out.println("Enter values in Array = ");
        int arr[] = new int[n];
        int num = sc.nextInt();
        System.out.println("Enter values for Finding in the Array = ");

        for(int i=0; i<arr.length; i++){
             arr[i] = sc.nextInt();
        }

        boolean flag=true;
        for(int j=0; j<arr.length; j++){
            if(arr[j]==num){
                flag=false;
                System.out.println("Element present in the array index is = "+j);
        }
    }if(flag)
    System.out.println("Element not present in the array");
}

// 29. Suppose a one-dimensional array AR containing integers is arranged in ascending order. Write a java program to search for an integer from AR with the help of Binary search method, 

void  find_val_presnt_or_not_array_by_Binary_Search_29(){
    // System.out.print("Enter Size of an array = ");
    // int n = sc.nextInt();
    // System.out.println("Enter values in Array = ");
    // int arr[] = new int[n];

    int arr[] ={1,2,3,4,5,6,7,8,9,11};
    

    // for(int i=0; i<arr.length; i++){
    //      arr[i] = sc.nextInt();
    // }

    System.out.print("Enter values for Finding in the Array = ");
    int num = sc.nextInt();
    int start=0;
    int end=arr.length-1;
    int mid=(arr.length-1)/2;
    System.out.println(0/2);
    boolean flag=true;
    int k=1;
    while(start<end){
        System.out.println(k);
        if(arr[mid]==num){
            flag=false;
            System.out.println("Element present in the array index is = "+mid);
            break;
        }else if (arr[mid]>num){
            end=mid-1;
            mid=((end-start)/2)+start;
        }else{
            start=mid+1;
            mid=((end-start)/2)+start;
        }
        ++k;
    }if(flag){
        System.out.println("Element is not present in the array...");
    }

}

// 30. Suppose A, B, C are arrays of integers of size M, N, and M + N respectively.
//     The numbers in array A appear in ascending order while the numbers in array B appear in descending order.
//  Write a java progtam to produce third array C by merging arrays A and B in ascending order. . 

   void array_A_accen_B_decen_C_merge_AB_Accendding_30(){
    int a1[]={1,2,3,4,5};
    int a2[]={6,7,8,9,10};
    int c[]=new int[a1.length+a2.length];
    
    for (int i=0; i<c.length; i++) {
        if(i<a1.length)
        c[i]=a1[i];
        else
        c[i]=a2[i-a1.length];
    }

    for (int i=0; i<c.length-1; i++) {
        for(int j=i+1; j<c.length; j++){
            if(c[i]>c[j]){
            int temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            }
        }
    }

    for (int i=0; i<c.length; i++) {
        System.out.print(c[i]+" ");
    }
   }

//    31. Suppose X. Y, Z are arrays of integers of size M, N, and M + N respectively. The numbers in array X and Y appear in descending order.
//  Write a java program to produce third array Z by merging arrays X and Y in descending order. 

void array_X_deccen_Y_decen_Z_merge_AB_Deccendding_31(){
    int a1[]={5,4,3,2,1};
    int a2[]={6,7,8,9,10};
    int c[]=new int[a1.length+a2.length];
    
    for (int i=0; i<c.length; i++) {
        if(i<a1.length)
        c[i]=a1[i];
        else
        c[i]=a2[i-a1.length];
    }

    for (int i=0; i<c.length-1; i++) {
        for(int j=i+1; j<c.length; j++){
            if(c[i]<c[j]){
            int temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            }
        }
    }

    System.out.print(" array_X_deccen_Y_decen_Z_merge_AB_Deccendding ");
    for (int i=0; i<c.length; i++) {
        System.out.print(c[i]+" ");
    }
   }

// 32. Given two arrays of integers A and B of sizes M and N respectively.
// Write a Write a c program, which will produce a third array named Java.
// sequence is followed. 
// All even numbers of A from left to right are copied into C from left to right. 
// All odd numbers of A from left to right are copied into C from right to left. 
// All even numbers of B from left to right are copied into C from left to right. 
// All old numbers of B from left to right are copied into C from right to left.
// e.g., A is {3, 2, 1, 7, 6, 3} and B is {9, 3, 5, 6, 2, 8, 10} the resultant array C is {2, 6, 6, 2, 8, 10, 5, 3, 9, 3, 7, 1, 3} 

    void Even_odd_left_right_32(){
        int a[]={3,2,1,7,6,3};
        int b[]={9,3,5,6,2,8,10};
        int c[]= new int[a.length+b.length];

        int odd=1,even=0;
        for (int i=0; i<c.length; i++) {
           if(i<a.length){
            if(a[i]%2==0){
           c[even]=a[i];
           even++;
            }
           else{
           c[c.length-odd]=a[i];
           odd++;
           }
           }
           else{
            if(b[i-a.length]%2==0){
           c[even]=b[i-a.length];
           even++;
            }
           else{
           c[c.length-odd]=b[i-a.length];
           odd++;
           }
        }
    }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }
    }

}
  public  class  Ar {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Array arr = new Array();
        // arr.peak_1();
        // arr.min_max_2();
        // arr.reverse_3();
        // arr.reverse_3_2();
        // arr.reverse_3_3();
        // arr.Short_4();
        // arr.kth_larg_small_5();
        // arr.occurance_5_1();   
        // arr.Short_0s_1s_2s_6();    
        // arr.Sub_Sum_7();
        // arr.saperate_posi_negative_8();
        // arr.union_9();
        // arr.cyclically_ratate_10();
        // arr.sum_pair_count_11();
        // arr.common_in_three_arr_12();
        // arr.First_repeating_13();
        // arr.First_non_repeating_14();
        // arr.equal_pair_0s_1s_15();
        // arr.unsorted_pos_neg_pos_neg_3_16();
        // arr.array_sum_zero_17();
        // arr.max_sum_array_18();
        // arr.max_produc_array_19();
        // arr.consecutive_array_20();
        // arr.Max_configuration_rotat_array_21();
        // arr.user_enterd_nearest_leaser_grater_22();
        // arr.Average_sum_array_23();
        // arr.Swap_first_last_1D_array_24();
        // arr.Reverse_1D_array_25();
        // arr.largest_smallest_elem_array_26();
        // arr.find_val_presnt_or_not_array_28();
        // arr.find_val_presnt_or_not_array_by_Binary_Search_29();
        // arr.array_A_accen_B_decen_C_merge_AB_Accendding_30();
        // arr.array_X_deccen_Y_decen_Z_merge_AB_Deccendding_31();
        arr.Even_odd_left_right_32();


    }
}

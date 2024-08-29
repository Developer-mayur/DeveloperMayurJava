import java.util.Scanner;
class t{







    
// Q56.Write a Java program to test two arrays' equality.
 Scanner sc = new Scanner(System.in);
void t1(){
 int arr[] = {2,3,4,5,5};
 int ar [] = {3,2,4,5,5};
boolean flag = false;
 if(arr.length != ar.length){
 System.out.println("length is not same");
 }
 else{
for(int i=0; i<arr.length; i++){
    for(int j=0; j<ar.length; j++){
       if(arr[i]==arr[j]){
 System.out.println(arr[i]);
       }
}
}
}
}

// Q57.Write a Java program to find common elements in three sorted (in non-decreasing order) arrays.                                                           
void t2(){
int [] arr= {1,4,6,8,7,3,4,5};
int [] ar=  {1,2,5,6,3};
int [] a =  {1,3,6,9,2,3,4};
for(int i=0; i<arr.length; i++){
   for(int j=0; j<ar.length; j++){
       if(arr[i]==ar[j]){
         for(int k=0;k<a.length; k++){
           if(ar[j]==a[k]){
            System.out.println(arr[i]+"=="+ar[j]+"=="+a[k]);
        
           }
          }

          }



}

}


}
}

public class  test{
public static void main(String []args){
Question q = new Question();
//  q.t1();
 q.t2();
 }

}

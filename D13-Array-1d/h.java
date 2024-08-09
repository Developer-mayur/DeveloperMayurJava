public class h {
    
public static  void main(String[]args){
int arr[]={1,17,3,5,9,7,4};

int max1 = arr[0];
int max2=arr[0];
for(int i=1;i<arr.length;i++){

if(max1<arr[i]){
 
max1 = arr[i];

if(max1>arr[i]){
    max2 =arr[max1];
}

  }


    }
    System.out.println(max1);
    System.out.println(max2);


}






}






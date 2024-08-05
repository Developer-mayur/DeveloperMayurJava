// 13) Explain the importance of toString() and equals() method of the Object class and override them on class Employee (empId,name,salary).
// Create class for main method(say XYZ),and accept five employees information and store in an array. Also ensure if entered empId already exist or not (use equals method).
// Display all employee info using toString() method.
    



import  java.util.Scanner;



class Employee  {
  private   int[] empId ;
   private  String[] Name;
   private  double[]  salary;

    
public  int  DetailsId(int empId){
 for(int i=0;i<=5;i++){
empId[i]=i;
}
return  empId;

    }
}










class XYZ{


public static void main(String[] args) {
    

 Scanner sc = new Scanner(System.in);
 Employee o = new Employee();
 for(int i=1;i<=5;i++){
System.out.println("employee details ="+i);
System.out.println(" employee name ="+i);
System.out.println(" employee id ="+i);
o.DetailsId(i);
 empId =

 }




 
 
 
}

}
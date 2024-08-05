interface MyInterface {
    void myMethod(); // Abstract method
int A =9;
      void myDefaultMethod() ;
}

class MyClass implements MyInterface {
    // You only need to override myMethod()
    public void myMethod() {
        System.out.println("MyClass implementation");
 
    }

       public void  myDefaultMethod() {
        System.out.println("This is the default implementation.");
    }

public static void main(String[] args) {
    MyClass  O= new  MyClass();
    O.myDefaultMethod();
    O.myMethod();
   System.out.println( O.A);
}

}




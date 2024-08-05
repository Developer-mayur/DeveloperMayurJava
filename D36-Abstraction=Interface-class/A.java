  
 class A {
 
      void stop() {
        System.out.println("Vehicle stopped using default method");
    }

     static void service() {
        System.out.println(" Static  ");
    }
}

class B extends  A {
       public void stop() {
        System.out.println("Car stopped");
    }

      void  service() {
        System.out.println("Vehicle ddgdddddfgddfgdfdfgdfg");
    }

    public static void main(String[] args) {
        A myCar = new B();
         myCar.stop();

         A.service();
    }
}

 
 interface Vehicle {
    void start();

    default void stop() {
        System.out.println("Vehicle stopped using default method");
    }

     static void service() {
        System.out.println(" Static  ");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
      public void stop() {
        System.out.println("Car stopped");
    }

      public void service() {
        System.out.println("Vehicle ddgdddddfgddfgdfdfgdfg");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.stop();

    myCar.service();  
    }
}

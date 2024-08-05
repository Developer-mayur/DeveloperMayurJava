interface Vehicles {
    void start();

    default void stop() {
        System.out.println("Vehicle stopped using default method");
    }

    // Static method in the interface
    static void service() {
        System.out.println("Vehicle serviced");
    }

    // Nested interface
    interface Engine {
        void run();
    }

    // Nested class
    class Tire {
        public void rotate() {
            System.out.println("Tire is rotating");
        }
    }

    // Nested enum
    enum FuelType {
        PETROL, DIESEL, ELECTRIC;
    }
}

class Cars implements Vehicles, Vehicles.Engine {
    public void start() {
        System.out.println("Car started");
    }

    public void run() {
        System.out.println("Car engine running");
    }

    public static void main(String[] args) {
        Vehicles myCar = new Cars();
        myCar.start();
        myCar.stop();

        // Calling the static method from the interface
        Vehicles.service();

        // Using nested interface
        Vehicles.Engine myEngine = new Cars();
        myEngine.run();

        // Using nested class
        Vehicles.Tire myTire = new Vehicles.Tire();
        myTire.rotate();

        // Using nested enum
        Vehicles.FuelType fuelType = Vehicles.FuelType.PETROL;
        System.out.println("Fuel type: " + fuelType);
    }
}

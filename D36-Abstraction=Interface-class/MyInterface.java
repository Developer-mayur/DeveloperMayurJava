 // Interface with default method
public interface MyInterface {
    void abstractMethod(); // Abstract method (must be implemented by implementing class)

    default void defaultMethod() { // Default method with implementation
        System.out.println("Default implementation in the interface.");
    }
}

// Class implementing the interface
  class MyClass implements MyInterface {
    // Implementing the abstract method
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implementation in MyClass.");
    }

    // Optionally overriding the default method
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in MyClass.");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.abstractMethod(); // Output: Abstract method implementation in MyClass.
        obj.defaultMethod();  // Output: Overridden default method in MyClass.
    }
}

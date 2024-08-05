#                                    Polymorphism
#             Polymorphism is an ability of a class instance to take different forms based on the instance
#             its acting upon.
#             Polymorphism is primarily achieved by subclassing or by implementing an interface. The
#             derived classes can have its own unique implementation for certain feature and yet share
#             some of the functionality through inheritance.
#             Behaviour of object depends specifically on its position in the class hierarchy.
#             Consider you have a Furniture class, which has addLegs() method; and a Chair and a
#             Table class, both extend Furniture class and have their own implementation of addLegs()
#             method. In this situation, the implementation of addLegs() method that gets called is
#             determined by the runtime, depending whether you have a Chair or a Table instance.
#             public abstract class Furniture {
#             public abstract void addLegs();
#             public void print(String message){
#             System.out.println(message);
#             }
#             }
#        class Chair extends Furniture {
#        @Override
#        public void addLegs() {
#        print(“Chair Legs Added”);
#        }
#        }
#        class Table extends Furniture{
#        @Override
#        public void addLegs() {
#        print(“Table Legs Added”);
#        }
#        }
#        Furniture furniture = new Chair();
#        // This prints “Chair Legs Added”
#        furniture.addLegs();
#        furniture = new Table();
#        // This prints “Table Legs Added”
#        furniture.addLegs();



#                                  Benefits of polymorphism
#        The real power and benefit of polymorphism can be achieved when you can code to an
#        abstract base class or an interface. Based on the context, polymorphism enables the
#        selection of most appropriate class implementation. Not only in production code, it also
#        paves way to have an alternate implementation for testing.


Questions
What is Polymorphism?
What are different ways to achieve polymorphism?
How is inheritance useful to achieve polymorphism?
What are the benefits of polymorphism?
How is polymorphism concept useful for unit testing?









#                                   Parametric polymorphism
#             In Java, Generics facilitates implementation for Parametric polymorphism, which enables
#             using the same code implementation with the values of different types, without
#             compromising on compile time type safety check.
#             In the example below, we added an upper bound to type parameter T such that it
#             implements an interface that guarantees getWheelsCount() method in the type T.
#             interface Vehicle {
#             int getWheelsCount();
#             }
#             class Car<T extends Vehicle> {
#             private T vehicle;
#             public Car(T vehicle) {
#             this.vehicle = vehicle;
#             }
#             public int getWheelsCount() {
#             return vehicle.getWheelsCount();
#             }
#             }
#             It takes parameter of type T and returns count of wheels, without worrying about what
#             type T actually is.



Questions
What is Parametric Polymorphism?
How Generics is used to achieve Parametric Polymorphism?
How are Type Wildcards used to achieve Parametric Polymorphism?
Can you achieve Parametric Polymorphism without Generics?






#                                    Subtype polymorphism
#             In Subtype polymorphism, also known as inclusion polymorphism, the parameter
#             definition of a function supports any argument of a type or its subtype.
#             In the code below, the method printWheelsCount() takes Vehicle as parameter and prints
#             count of wheels in the Vehicle. The main method shows subtype polymorphic calls,
#             passing objects of Car and Bike as arguments to the printWheelsCount() method. Every
#             place where it expects a type as parameter, it also accepts subclass of that type as
#             parameter.

#                                 abstract class Vehicle{
#                                 public abstract int getWheelsCount();
#                                 }
                    
#                                 class Car extends Vehicle{
#                                 @Override
#                                 public int getWheelsCount() {
#                                 return 4;
#                                 }
                    
#                                 }
                    
#                                 class Bike extends Vehicle{
#                                 @Override
#                                 public int getWheelsCount() {
#                                 return 2;
#                                 }
                    
#                                 }
#                                 public void printWheelsCount(Vehicle vehicle) {
#                                 print(vehicle.getWheelsCount());
#                                 }
                    
#                                 public void main(String[] args) {
#                                 printWheelsCount(new Car());
#                                 printWheelsCount(new Bike());
#                                 }




Questions
What is Subtype Polymorphism?
What is Inclusion Polymorphism?
What is the difference between Parametric Polymorphism and SubType
Polymorphism?
Can you achieve SubType polymorphism using Generics?



#                                          Overloading
#           Method overloading is defining more than one method with the same name, but with
#           different parameters.
#           Method overloading is an example of static or compile-time polymorphism.
#           In static polymorphism, it’s while writing the code, decision is made to call a specific
#           implementation.
#           Rules for method overloading
#           Method can be overloaded by defining method with the same name as an existing
#           one, having
#           Different number of argument list.
#           Different datatype of arguments.
#           Different order of arguments.
#           Return type of the overloaded method can be different.
#           Method with the same name and exactly the same parameters cannot be defined,
#           when they differ only by return type.
#           Overloading method is not required to throw same exception as the method its
#           overloading.
#           Operator Overloading
#           Operator overloading is an ability to enhance the definition of language dependent
#           operators. For example, you can use + operator to add two integers and also to concat two
#           strings.


Questions
Explain method overloading?
What is static polymorphism?
What is the difference between static and dynamic polymorphism?
Can you override a method such that all the parameters are same with the difference
only in the return type?
What is operator overloading?
What are the benefits of method overloading?
What is the difference between overriding and overloading
##                                             Diamond Problem
#               Java doesn’t allows extending multiple classes because of the ambiguity that could arise
#               when more than one super class has method with the same signature, and compiler can’t
#               decide which super class method to use.
#               Consider the inheritance hierarchy depicted in the figure below. If the method calculate()
#               defined in the Base class is overridden by both, DerivedLeft and DerivedRight, then it
#               creates ambiguity regarding which version of calculate() does the Confused class inherits.
#               
#               In the code below there is an ambiguity regarding which version of calculate()
#               should be called. This is known as Diamond Problem in Java.
#               public static void main (String [] args){
#               Base base = new Confused();
#               base.calculate();
#               }




#                Diamond Problem with Default Interface Method
#                With the introduction of Default Interface methods, if Base, DerivedLeft and DerivedRight
#                are Interfaces, and there exists calculate() as default interface method is all three, it will
#                cause the Diamond Problem.
#                In such scenario the Confused class has to explicitly re-implement the calculate() method;
#                otherwise, the ambiguity will be rejected by the compiler.


Questions 
Explain Diamond Problem in Java?
Why Java does not provide multiple inheritances?
Using default interface methods, class can still inherit two interfaces with same
signature method; would this not cause Diamond Problem? How can you solve it?






#                               Programming to interface
#                 Programming to interface forms basis for modular software development by facilitating
#                 decoupling between software components. High level of decoupling improves
#                 maintainability, extensibility and testability of software components. Modular software
#                 design also helps to improve speed to market, as it facilitates parallel software
#                 development between multiple teams working with the same code base.
#                 It’s the Programming to Interface design paradigm that forms the foundation for Inversion
#                 of Control, which manages dependency relationships in any large software application.
#                 Let’s take a very simple example. Suppose we have a method to sort a collection, which is
#                 defined with Interface Map as its parameter. This means, that the sort() method is not tied
#                 to any specific type of Map implementation and you can pass any concrete
#                 implementation of the Map interface.
#                 public static void main (String [] args){
#                 sort(new HashMap<>());
#                 sort(new TreeMap<>());
#                 sort(new ConcurrentSkipListMap<>());
#                 sort(new TreeMap<>());
#                 }
#                 public static void sort(Map map){
#                 // perform sort
#                 }








#                          Benefits of programming to interface
#          Based on the context, you can select the most appropriate behaviour, runtime.
#          For testing, you can pass mock objects or stubs implementation.
#          The interface/API definitions or the contract does not change frequently.
#          Programming to Interface also facilitates parallel development between teams, as
#          developers from different ream can continue writing code against interfaces before
#          doing integration.





Questions
What is the concept of programming to interface?
What are the benefits of programming to interface?
How does programming to interface facilitate decoupling between software
components?
How dependency injection and programming to interface are inter-related? Can you
achieve dependency injection without supporting programming to interface?
What are the benefits of modular software?
How does programming to interface helps in unit testing?






#                                  Abstract Class vs Interface


#                                          Abstract Class
#    Abstract class cannot be instantiated but can be extended. You should extend abstract
#    class when you want to enforce a common design and implementation among derived
#    classes.



#                                            Interface
#      Interface is set of related methods, which defines its behaviour and its contract with the
#      outside world. Use interface when you want to define common behaviour among unrelated
#      classes. Interfaces can also be used without methods and are known as marker interface;
#      such interfaces are used to categorize the classes. Example of marker interface is
#      java.io.Serializable, which does not define any method but must be implemented by the
#      classes that support serialization.


#                        Difference between Abstract Class and Interface
#      Abstract class can be updated to add more capabilities to the class whereas Interface
#      can be added to implement new behaviour to the class. Though with introduction of
#      default interface methods, even Interfaces can be extended to have more capabilities.
#      Interface can be multiple inherited; whereas, abstract class cannot.
#      Interfaces can be applied to unrelated classes; whereas, related classes extend
#       Abstract class.
#      Abstract class methods can have any type of access modifier; whereas, Interface has
#      all public members.
#      Abstract class can have state associated, which is not possible with Interface.
#      Abstract class can be extended without breaking the class that extends it; whereas,
#      any change in interface, except made for default and static methods, will break the
#      existing implementation.



Questions
If an abstract class cannot be instantiated, why would you define a constructor for an
Abstract class?
Constructor can be used to perform the required field initialization and also to
enforce class constraints.
Define Abstract class? What role an Abstract class plays in class design?
Define Interface? What role an Interface plays in class design?
When would you prefer using Abstract class over Interface and vice-versa?
Explain various differences between Abstract Class and Interface?
What are marker interfaces? How are marker interfaces used?
Can you declare an interface method static?
With the introduction of default interface methods; how Abstract class is still
different from an Interface?


#                           Default Interface Method
#        Default interface methods are directly added to an Interface to extend its capabilities.
#        Default interface method can be added to enhance an Interface that is not even under
#        your control.
#        It does not break any existing implementation of the interface it is added to.
#        Implementing class can override the default methods defined in the interface.
#        Default method is also known as Defender or Virtual extension method.
#        In this code example default Interface method, getAdditonSymbol(), is added to an existing
#        interface Calculator.
#        public interface Calculator {
#        public <T> T add(T num1, T num2);
#        default public String getAdditionSymbol(){
#        return “+”;
#        }
#        }



#                       Limitations with Default method
#        If the class inherits multiple interfaces having default methods with same signature,
#        then the implementing class has to provide implementation for that default method to
#        resolve ambiguity.
#        If any class in the inheritance hierarchy has a method with the same signature, then
#        default methods become irrelevant.
#        Default method vs Abstract method
#        Following are couple of minor differences:
#        Abstract methods allows defining constructor.
#        Abstract methods can have a state associated.
#        With Default method - Abstract class vs Interface
#        With the introduction of default methods, now even the Interfaces can be extended to add
#        more capabilities, without breaking the classes that inherit from the Interface.




Questions
What are default interface methods?
What are the benefits of default interface methods?
Can you add default interface methods to enhance an interface that is not directly
under your control?
Can you override the default interface methods to provide different implementation?
What happens when a class inherits two interfaces and both define a default method
with the same signature?
How defining a default method in an interface is different from defining the same
method in an abstract class?



#                                              Static Interface Method
#               Static Interface methods are directly added to an interface to extend its capabilities.
#               Static Interface methods are generally used to implement utility functions like:
#               validations, sorting, etc.
#               Static interface methods are also used when you want to enforce specific behaviour in
#               the classes inheriting the Interface.
#               Implementing class cannot override the static methods defined in the interface it is
#               inheriting.
#               Static Interface method can even be added to enhance an interface which is not under
#               your control.
#               Similar to default Interface method, even the static interface method does not break
#               any existing implementation of the interface.
#               In this code example, static Interface method, getUtcZonedDateTime(), is added to an
#               existing interface DBWrapper.
#               public interface DBWrapper {
#               static ZonedDateTime getUTCZonedDateTime(
#               Instant date ){
#               ZoneId zoneId =
#               TimeZone.getTimeZone(“UTC”).toZoneId();
#               ZonedDateTime zonedDateTime =
#               ZonedDateTime.ofInstant(date, zoneId);
#               return zonedDateTime;
#               }
#               }
Questions
What are static interface methods?
Where can you use static interface methods?
Can you override static interface methods?
What is the difference between static and default interface methods?
Can you add static interface method to enhance an interface, which is not directly
under your control?
What happens if a class inherits two interfaces and both define a static interface
method with the same signature?




#                           Annotations
#        An annotation associates metadata to different program elements. Annotations may be
#        directed at the compiler or at runtime processing.
#        Annotation metadata can be used for documentation, generating boilerplate code,
#        performing compiler validation, runtime processing, etc. Annotations do not have any
#        direct effect on the code piece they annotate.
#        We can apply annotations to a field, variable, method, parameter, class, interface, enum,
#        package, annotation itself, etc.
#        Usage
#        User defined annotations are directly placed before the item to be annotated.
#        @Length(max=10, min=5)
#        public class ParkingSlot {
#        // Code goes here
#        }
#        Few built-in annotations
#        @Deprecated - signifies that method is obsoleted.
#        @Override - signifies that a superclass method is overridden.
#        @SupressWarnings - used to suppress warnings.


Questions
What are annotations?
Where can you use annotations?
What are the different Java entities where you can apply annotations




#                    Internationalization and Localization
#                          Internationalization
#        Internationalization of software is the process to ensure that software is not tied to only
#        one language or locale. Its shortened name is i18n.
#        Localization
#        Localization of software is the process to ensure that software has all the resources
#        available to support a specific language or locale. Its shortened name is l10n.


# Note
# Internationalization facilitates localization.


Questions
What is Internationalization?
What is localization?
What is the difference between localization and internationalization?
Can you achieve localization without building support for Internationalization?


#                              Immutable Objects
#         An object is considered immutable when there is no possibility of its state change after its
#         construction.
#         Advantages
#         Easier to design and implement, as you don’t have to manage state change.
#         Immutable objects are inherently thread safe because they cannot be modified after
#         creation. So there is no need to synchronize access to it.
#         Immutable object has reduced Garbage Collection overhead.
#         Disadvantages
#         A separate object needs to be defined for each distinct value, as you cannot reuse an
#         Immutable object.
#         Rule for defining Immutable Objects
#         Declare the class final.
#         Allow only constructor to create object. Don’t provide field setter.
#         Mark all the fields private.


#         Example of an immutable class, Employee.
#         final public class Employee {
#         final private int id;
#         final private String name;
#         final private String department;
#         public Employee(int id,
#         String name,
#         String department) {
#         this.id = id;
#         this.name = name;
#         this.department = department;
#         }
#         public int getId() {
#         return id;
#         }
#         public String getName() {
#         return name;
#         }
#         public String getDepartment() {
#         return department;
#         }
#         }


Questions
What is an immutable object?
What are the rules for defining an immutable object?
What are the advantages/disadvantages of an immutable object?
How do you create an immutable object?
What are the different situations where you can use immutable objects?
What is the difference between final and immutable object?
How does declaring a variable final helps with optimization?
Can you list some of the problems with Immutability?
It’s harder to define constructors with lots of arguments.
Since it’s left to the developer to enforce immutability, even a single setter
added accidentally, can break it.





#                               Cloning
#        Cloning is process of creating copy of an object.
#        Simply assigning an existing object reference to an object results in two references
#        pointing to the same object.
#        There are two types of cloning, shallow cloning and deep cloning.
#        Shallow Cloning
#        Shallow cloning simply copies the values of the properties. For primitive property
#        members, exact copy is created and for reference type members, its address is copied. So
#        the reference type members, both original and the newly created, points to the same object
#        in heap.
#        Deep Cloning
#        Deep cloning recursively copies the content of each member to the new object. Deep
#        cloning always creates an independent copy of the original object. To create a deep clone,
#        a dedicated method generally known as CopyConstructor should be written.




Questions
What is cloning?
What is shallow cloning?
Explain drawbacks with shallow cloning?
What is deep cloning?
What is CopyConstructor?
When would you prefer deep cloning over shallow cloning and vice versa
#                                         Inheritance
#       Inheritance is an object oriented design concept that deals with reusing an existing class
#       definition (known as super class) and defining more special categories of class (know as
#       sub class) by inheriting that class. It focuses on establishing IS-A relationship between sub
#       class and its super class. Inheritance is also used as technique to implement
#       polymorphism; when a derived type implements method defined in the base type.
#       Rules for Inheritance
#       There can be a multiple level of inheritance, based on the requirements to create
#       specific categories.
#       Only single class inheritance is allowed in Java, as multiple inheritance comes with
#       its share of complexity; see Diamond Problem.
#       Class declared final cannot be extended.
#       Class method declared final cannot be overridden.
#       Constructor and private members of the base class are not inherited.
#       The constructor of base class can be called using super().
#       The base class’s overridden method should be called using super keyword, otherwise
#       you will end up calling the overriding method in the sub class recursively.



Questions
Explain inheritance?
What is the purpose of inheritance?
What should be the criteria to decide inheritance relation between two classes?
How inheritance plays an important role in polymorphism?
Can you inherit final class?
What happens if you don’t use super keyword to call an overridden member?
Why can’t you inherit static members defined in the super class?
What are the challenges you can face if multiple inheritance is possible in Java?




#                                       Composition
#       Composition is an object oriented design concept that is closely related to inheritance, as it
#       also deals with reusing classes; but it focuses on establishing HAS-A relationship between
#       classes. So unlike Inheritance, which deals with extending features of a class, composition
#       reuses a class by composing it. Composition is achieved by storing reference of another
#       class as a member.



#                                Inheritance vs Composition
#      Problem with inheritance is that it breaks encapsulation as the derived class becomes
#      tightly coupled to the implementation of the base class. The problem becomes complex
#      when a class is not designed keeping future inheritance scope and you have no control
#      over the base class. There is possibility of breaking a derived class because of changes in
#      the base class.
#      So, inheritance must be used only when there is perfect IS-A relationship between the base
#      and the derived class definitions; and in case of any confusion prefer composition over
#      inheritance.




Questions
Explain composition?
What is the difference between inheritance and composition?
What should be the criteria to decide composition relation between two classes?
Explain few problems with inheritance that can be avoided by using composition?
When would you prefer composition over inheritance and vice versa




#                         Widening vs Narrowing Conversions



#                         Widening Conversions
#        Widening conversions deals with assigning an object of sub class (derived class) to an
#        object of super class (base class). In the example below, Car is derived from Vehicle.
#        Car car = new Car();
#        Vehicle vehicle = car;


#                       Narrowing Conversions
#    Narrowing conversions deals with assigning an object of super class (base class) to an
#    object of sub class (derived class). An explicit cast is required for conversion. In the
#    example below, Bike is derived from Vehicle.
#    Vehicle vehicle = new Vehicle();
#    Bike bike = (Bike)vehicle;




Questions
What is widening conversion?
What is narrowing conversion?
Is there any possibility of loss of data in narrowing conversion
#                                  Overriding
#      Method overriding is redefining the base class method to behave in a different
#      manner than its implementation in the base class.
#      Method overriding is an example of dynamic or runtime polymorphism.
#      In dynamic polymorphism, runtime takes the decision to call an implementation, as
#      compiler does not know what to bind at compile time.
#      Rules for method overriding
#      Method arguments and its order must be same in the overriding method.
#      Overriding method can have same return type or subtype of base class method’s
#      return type.
#      Access modifier of overridden method cannot be more restrictive than its definition
#      in base class.
#      Constructor, static and final method cannot be overridden.
#      Overridden method cannot throw checked exception if its definition in base class
#      doesn’t, though overridden method can still throw unchecked exception.



Questions
What is method overriding?
What is dynamic polymorphism?
Why can’t you override static methods defined in super class or interface?
Can you override a final method defined in super class?
Can you override a public method in super class and mark it protected?
Why can’t you override constructor of super class?
Can an overriding method throw checked exception; when the overridden method in
the super class does not? Why?
What are the benefits of method overriding?




#                                             @Override
#          @Override annotation is way to explicitly declare the intention of overriding the method
#          implementation in the base class. Java performs compile time checking for all such
#          annotated methods. It provides an easy way to mistake proof against accidentally writing
#          wrong method signature, when you want to override from base class.
#          If a derived class defines a method having the same signature as a method in the base
#          class, the method in the derived class hides the one in the base class. By prefixing a
#          subclass’s method header with the @Override annotation, you can detect if an inadvertent
#          attempt is made to overload instead of overriding a method.



Questions
What is the purpose of @Override annotation?
What happens if you define a method with the same signature as defined in the super
class and not use @Override annotation?
What are the benefits of @Override annotation
#                                         getters and setters
#                     The following code demonstrates the usage of getter and setter.
#                     public class Person {
#                     private String name;
#                     public String getName() {
#                     return StringUtils.capitalize(name);
#                     }
#                     public void setName(String name) {
#                     if(name.isEmpty()){
#                     System.out.println(“Name string is empty”);
#                     //throw exception
#                     }
#                     this.name = name;
#                     }
#                     }




#                         Benefits of using getter and setter
#        Validations can be performed in the setter or can be added later when required.
#        Value can have alternative representation, based on internal (storage) or external
#        (caller’s) requirement.
#        Hides the internal data structure used to store the value.
#        Internal fields can be changed, without requiring changing any user of the code.
#        Encapsulates the internal complexity in retrieving or calculating the value.
#        Provides ability to specify different access modifiers for getter and setter.
#        Provides ability to add debugging information.
#        Can be passed around as Lambda expressions.
#        Many libraries like mocking, serialization, etc. expects getters/setters for operating on
#        the objects.



Questions
Why do you need getters and setters when you can directly expose the class field?
Explain few benefits of using getters and setters
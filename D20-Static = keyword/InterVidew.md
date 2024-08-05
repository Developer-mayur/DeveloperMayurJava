#                               static
#                           static class
#     Only nested/inner classes can be defined as static and not the outer class.
#     static variable and method
#     When static keyword is used with the variables and the methods, it signifies that these
#     members belongs to the class and these members are shared by all the objects of the class.
#     Static members does not have a copy and are stored only at a single location is memory.
#     These members should be accessed using class name.
#     Static method does not have access to instance methods or properties, because static
#     members belong to the class and not the class instances.


Questions
What are static classes?
Can any class be declared as static class?
What are static methods?
What are static variables?
Who owns the class members that are static? How is that different for non-static
members?
How should you access class members that are static?
Does static method has access to an instance member? Why




#                                static Initialization Block
#        static initialization block is generally used to ensure that all the required class
#        resources (like drivers, connection strings, etc.) are available before any object of the
#        class is used.
#        static block does not have access to the instance members.
#        static block is called only once for a class.
#        A class can define any number of static blocks, which gets called in order of their
#        definition in the class.
#        You can only throw unchecked exception from a static block.
#        In this code example static initialization block creates connection string only once for the
#        class.
#        private static String connectionString;
#        static {
#        connectionString = getConnectionSting();
#        }



Questions
What is static initialization block?
What is the primary purpose of the static initialization block? What kind of things
should you do in the static block?
Can you access instance members from static initialization block? Why?
Does static initialization block gets called every time when an instance of the class is
created?
How many static blocks can be defined in a class?
When multiple static blocks are defined, what is the criterion for their order of
execution?
Can you throw exception from static initialization block? What type
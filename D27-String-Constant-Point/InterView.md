#                                                 STRINGS
#                                           String Immutability
#                   The String object is immutable, which means once constructed, the object which String
#                   reference refers to, can never change. Though you can assign same reference to another
#                   String object.
#                   Consider the following example:
#                   String greeting = “Happy”;
#                   greeting = greeting + ” Birthday”;
#                   The code above creates three different String objects, “Happy“, “Birthday” and “Happy
#                   Birthday”.
#                   Though you cannot change the value of the String object but you can change the
#                   reference variable that is referring to the object. In the above example, the String
#                   reference greeting starts referring the String object “Happy Birthday”.
#                   Note that any operation performed on String results into creation of new String.
#                   String class is marked final, so it’s not possible to override immutable behaviour of
#                   the String class.
#                   Advantages
#                   As no synchronization is needed for String objects, it’s safe to share a String object
#                   between threads.
#                   String once created does not change. To take advantage of this fact for memory
#                   optimization, Java environment caches String literals into a special area in memory
#                   known as a String Pool. If a String literal already exists in the pool, then the same
#                   string literal is shared.
#                   Immutable String values safeguard against any change in value during execution.
#                   As hash-code of String object does not change, it is possible to cache hash-code and
#                   not calculate every time it’s required.
#                   Disadvantages
#                   String class cannot be extended to provide additional features.
#                   If lots of String literals are created, either new objects or because of any string
#                   operation, it will put load on Garbage Collector.



Questions
Why String objects are called immutable?
How is String object created in memory?
What are the advantages and disadvantages of String Immutability?
Why String objects are considered thread safe?
What are the advantages of declaring the String class final?
What memory optimization is performed by the Java environment for Strings?
Why you don’t have to calculate hash-code of the String object every time it’s used?








#                                  String Literal vs Object
#                                       String Literal
#            String literal is a Java language concept where the String class is optimized to cache all
#            the Strings created within double quotes, into a special area known as String Pool.
#            String cityName = “London”;
#            String Object
#            String object is created using new() operator, like any other object of reference type, into
#            the heap.
#            String cityName = new String(“London”);



Questions
What is String literal?
What are the differences between String Literal and String Object?
How are the String Literals stored?




#                                           String Interning
#           String interning is a concept of storing only single copy of each distinct immutable
#           String value.
#           When you define any new String literal, it is interned. Same String constant in the
#           pool is referred for any repeating String literal.
#           String pool literals are defined not only at the compile time, but also during runtime.
#           You can explicitly call a method intern() on the String object to add it to the String
#           Pool, if not already present.
#           Placing extremely large amount of text in the memory pool can lead to memory leak
#           and/or performance issue.
#           Note: Instead of using String object, prefer using string literal so that the compiler can
#           optimize it.



Questions
What is String interning?
How can you intern a String Object?
What happens when you store a new String literal value that is already present in the
string pool?
What are the drawbacks of creating large number of String literals?
Which one is preferred: String Object or String Literal? Why?




#                                    String Pool Memory Management
#       String pool is a special area in memory managed by the Java compiler for String memory
#       optimization. If there is already a String literal present in the string pool, compiler refers
#       the new String literal reference to the existing String variable in the pool, instead of
#       creating a new literal. Java compiler is able to perform this optimization because String is
#       immutable.
#       In this example below, both the String objects are different object and are stored into
#       Heap.
#       String cityNameObj = new String(“London”);
#       String capitalObj = new String (“London”);
#       Whereas in this example below, both String literal refer to the same object in memory
#       pool.
#       String cityName = “London”;
#       String capital = “London”;



Questions:
Explain String Pool Memory Management?
How are String Literals stored in memory?
How String Pool is optimized for memory?
How are String Objects stored in memory?
Why can’t Java use mechanism similar to String Pool, to store objects of other data
types?




#                                Immutability - Security Issue
#      It’s the responsibility of the Garbage Collector to clear string objects from the memory;
#      though you can also use reflection to do so, but that’s not recommended.
#      Since Strings are kept in String Pool for re-usability, chances are that the strings will
#      remain in memory for long duration. As String is immutable and its value cannot be
#      changed, a memory dump or accidental logging of such String can reveal sensitive content
#      like password or account number, stored into it.
#      So instead, it’s advisable to use char array (char []) to store such sensitive information,
#      which can be explicitly overwritten by an overriding content, thus reducing the window of
#      opportunity for an attack.



Questions:
How are String literals cleared from the String Pool?
Can you use reflection to clear a String object?
What are the security issues associated with the immutable Strings?
Why you shouldn’t use String to store sensitive information like password, access
key, etc.?
Why using char array is advisable to store password, instead of String?




#                               Circumvent String Immutability
#        Immutability feature in String can be bypassed using reflection, though using reflection to
#        do so is NOT recommended, because it’s a security violation and is considered as an
#        attack. The following code demonstrates how reflection can be used to circumvent string
#        immutability:
#        String accountNo = “ABC123”;
#        Field field = String.class.getDeclaredField(“value”);
#        field.setAccessible(true);
#        char[] value = (char[])field.get(accountNo);
#        // Overwrite the content
#        value[0] = ‘X’;
#        value[1] = ‘Y’;
#        value[2] = ‘Z’;
#        // Prints “XYZ123”
#        System.out.println(accountNo);




Questions
Can you override String class to modify its immutability?
Is it technically possible to circumvent string immutability?
Is it recommended to circumvent string immutability using reflection? Why
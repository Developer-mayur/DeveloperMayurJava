#                                       Collections


#    Collections are data structures that are basic building blocks to create any production level
#    software application in Java. Interviewers are interested in understanding different design
#    aspects related to correct usage of collections. Each collection implementation is written
#    and optimized for specific type of requirement, and interview questions are to gauge
#    interviewee’s understanding of such aspects.
#    Questions are often asked to check whether the interviewee understands correct usage of
#    collection classes and is aware of alternative solutions available.
#    Following are few aspects on which questions on collections are asked:
#    Collection types in Java.

Unique features of different collection types.
Synchronized collection.
Concurrent collection.
Ordering of elements in a collection.
Speed of reading from collection.
Speed of writing to collection.
Uniqueness of elements in a collection.
Ease of inter-collection operation.
Read-only collections.
Collection navigation.



#                            Collection Fundamentals
#     Collection is a container that groups multiple elements together. Following is a simple
#     example of a collection.
#     // Create a container list of cities
#     List<String> cities = new ArrayList<>();
#     // add names of cities
#     cities.add(“London”);
#     cities.add(“Edinburgh”);
#     cities.add(“Manchester”);


#  Notes
#  Collections work with reference types.
#  All collection interface implementation are Generic.
#  All collection types can grow or shrink in size, unlike arrays.
#  Java provides lots of methods to manipulate collections based on its usage, so before
#  you add one, always check the existing methods.
#  Collection Framework
#  Collection framework is defined by the following components.
#  Interfaces - are the abstract types defined for each specific type of usage and
#  collection type.
#  Implementation - are concrete implementation classes to create object to represent
#  different type of collections.
#  Algorithms - are applied to these collections to perform various computation and to
#  manipulate the elements in the collection.
#  Collection Framework helps you to reduce programming efforts, by providing data
#  structures and algorithms to operate on them.



Questions
Explain collections?
How collections and Generics related?
Can you use collections with the primitive types?
How can you use collection with the primitive types?
Explain difference between collections and arrays?
What is the benefit of collection framework?
What are the different components of collection framework?




#                              Collection Interfaces
#  An interface defines its behaviour in the form of signature of methods it defines. To use a
#  collection, you should always write code against collection interfaces and not class
#  implementations, so that the code is not tied to a specific implementation. This protects
#  from possible changes in underlying implementation class.



Following are the most important interfaces that define collections and their behaviour.
Each child node below is inherited from its parent node.
+ Collection
+ Queue
+ BlockingQueue
+ TransferQueue
+ BlockingDeque
+ Deque
+ BlockingDeque
+ List
+ Set
+ SortedSet
+ NavigableSet
+ Map
+ SortedMap
Questions
Why should you write code against the collection interface and not concrete
implementation?







#                               Collection Types
#                   Set - Set contains unique elements.
#                   List - List is an ordered collection.
#                   Queue - Queue holds elements before processing in FIFO manner.
#                   Deque - Deque holds elements before processing in both, FIFO and LIFO manner.
#                   Map - Map contains mapping of keys to corresponding values.



Questions
What are the different collection types?
Define Set collection Type?
Define List collection Type?
Define Queue collection Type?
Define Deque collection Type?
Define Map collection Type?
What is the difference between Queue and Deque
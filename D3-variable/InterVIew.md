#                                   Naming Convention


#                               Camel Case vs Pascal Case
#           Camel Case is practice of writing composite words such that the first letter in each word is
#           capitalized, like BorderLength; it is also known as Pascal Case or Upper Camel Case. But
#           in programming world, Camel case generally starts with the lower case letter, like
#           borderLength; it is also known as Lower Camel Case. For this discussion, let’s consider
#           the format BorderLength as Pascal Case and the format borderLength as Camel Case.
#           Naming Convention
#           Naming convention is a set of rules that govern the naming for the identifiers representing
#           interface, class, method, variables, and other entities. Choice and implementation of
#           naming conventions often becomes matter of debate.
#           Standard naming convention improves the code readability, which helps in review and
#           overall understanding of the code.


#                                           Interface
#                                Name should be Pascal Case.
#                Name should be an adjective if it defines behaviour, otherwise noun.
#                public interface Runnable


#                                           Class
#                             Name should be Pascal Case.
#                             Name should be a noun, as a class represents some real world object.
#                             public class ArrayList
             

#                                          Method
#                                Name should be Camel Case.
#                                public boolean isEmpty()


#                                       Variable
#                             Name should be Camel Case.
#                             private long serialVersion = 1234L;


#                                      Constants
#                     Name should be all uppercase letters. Compound words should be separated by
#                     underscores.
#                     private int DEFAULT_CAPACITY = 10;


#                                         Enum
#                          Enum set name should be all uppercase letters.
#                          public enum Duration {
#                          SECOND, MINUTE, HOUR
#                          }


#                                       Acronyms
#                Even though acronyms are generally represented by all Upper Case letters, but in
#                Java only the first letter of acronyms should be upper case and rest lower case.
#                public void parseXml(){}


Questions
What is naming convention?
Why do you need naming convention?
What is the difference between Camel Case and Pascal Case?
What is the difference between Upper Camel Case and Lower Camel Case?
Explain naming convention for interface, class, method, variable, constant, enum and
acronyms?
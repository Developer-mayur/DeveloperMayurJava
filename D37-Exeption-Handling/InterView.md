#                             ERROR  AND EXCEPTION  EXCEPTION
#                Exception class hierarchy in java
#                Exception is an abnormal situation that interrupts the flow of program execution.
#                All exceptions inherit from Throwable.
#                You subclass Exception class if you want to create a checked exception or
#                RuntimeException if you want to create unchecked exception.
#                Though you can theoretically subclass Throwable class too to create checked
#                exception, but that’s not recommended, as Throwable is superclass for all exceptions
#                and errors in Java.



Questions
What is an Exception?
Explain root level exception super classes in Java?
Which super class should you sub class to create checked exception?
Which super class should you sub class to create unchecked exception?



#                 Checked vs Unchecked vs Error
#                 Checked Exception
#                 Checked exceptions are checked at compile time.
#                 Checked exceptions extend Throwable or its sub-classes, except RunTimeException
#                 and Error classes.
#                 Checked exceptions are programmatically recoverable.
#                 You can handle checked exception either by using try/catch block or by using throws
#                 clause in the method declaration.
#                 Static initializers cannot throw checked exceptions.
#                 public static void main(String args[]) {
#                 FileInputStream fis = null;
#                 try {
#                 fis = new FileInputStream(“details.txt”);
#                 } catch (FileNotFoundException fnfe) {
#                 System.out.println(“Missing File :” + fnfe);
#                 }
#                    }


#                                Unchecked Exception
#                Unchecked exceptions are checked at runtime.
#              Unchecked exceptions extend RuntimeException class.
#            You cannot be reasonably expected to recover from these exceptions.
#            Unchecked exceptions can be avoided using good programming techniques.
#            Throwing unchecked exception helps to uncover lots of defects.
#            public int getAccountBalance(
#            String customerName) {
#            int balance = 0;
#            if (customerName == null)
#            throw new IllegalArgumentException(“Null argument”);
#            // logic to return calculate balance
#            return balance;
#            }


#                                   Error
#        Error classes are used to define irrecoverable and fatal exceptions, which
#        applications are not supposed to catch.
#        Programmers cannot do anything with these exceptions.
#        Even if you catch OutOfMemoryError, you will get it again because there is high
#        probability that the Garbage Collector may not be able to free memory.
#        Use checked exception only for the scenario where failure is expected and there is a very
#        reasonable way to recover from it; for anything else use unchecked exception.



Questions
What are checked exceptions?
What are unchecked exceptions?
What types of exceptions does the Error class in Java defines?
How can you handle checked exceptions?
What happens if an exception is un-handled?
What are the different ways to handle checked exceptions?
Which exception classes can you use in the catch block to handle both checked and
unchecked exceptions?
How do you make choice between checked and unchecked exceptions?
Can you recover from unchecked exception?
How can you avoid unchecked exception?
Can you throw checked exceptions from static block? Why?
You cannot throw because there is no specific place to catch it and it’s called
only once. You have to use try/catch to handle checked exception.
What should you do to handle an Error?



##                    Exception Handling Best Practices
Even though exception handling is primarily driven by context, but it’s very important that
there must be a consistency in the exception handling strategy. Following are few
exception handling best practices:

1. Never suppress an exception - as it can lead your program to unsafe and unstable
state.
2. Don’t perform excessive exception handling - specifically when you do not know
how to completely recover from it.
3. Never swallow an exception - as it may lead the application into an inconsistent state,
and even worst, without recording reason for it.
4. Don’t catch and continue program execution - with some default behaviour. Default
behaviour defined today may not be valid in future.
5. Don’t show generic error message to user - instead clean the exception handling code
to report user-friendly message with suggestion about the next step.
6. Don’t put more than one exception scenarios in single try catch - as it will be
impossible to ascertain reason for the exception.
7. Don’t catch multiple checked exceptions in single catch block - as it will be
impossible to ascertain reason for the exception.
8. Don’t unnecessarily wrap the exception - which may mask the true source.
9. Don’t reveal sensitive information - instead sanitize exceptions generated specifically
from the sources that may reveal sensitive information.
10. Always log exception - unless there is compelling reason not to do so.
11. Don’t catch Throwable -as it will be impossible to ascertain reason for the exception.
12. Don’t use exception to control the flow of execution - instead use boolean to validate
a condition where possible.
13. Handle different scenarios programmatically - instead of putting all coding logic
in try block.
14. Explicitly name the threads - in a multithreaded application, it significantly eases the
debugging.
15. Never throw a generic exception - as it will be impossible to ascertain reason for the
exception.




Questions
Describe some exception handling best practices?
What are the pitfalls of suppressing an exception?
What is the problem with showing a generic error message?
What is the downside of swallowing an exception?
What are the pitfalls of handling multiple exceptions in a single catch block?
What would you do if an exception is thrown from a source that contains sensitive
information? What would you log in such case and what message would you show to
the user?
What is the pitfall of wrapping all the exceptions into a Generic exception class?
Why you shouldn’t use exceptions to control the flow of program execution?
Should you log all the exceptions? Why?
Why you shouldn’t use Throwable or some other root level class to catch exceptions?
What should be the criteria to select the code block that should be enclosed into a try
block?
If a nested call is made, which passes through multiple methods, would you
implement try-catch in each method? Why?



#                                try-with-resource
#     try-with-resource is Java language construct, which makes it easier to automatically close
#     the resources enclosed within the try statement.
#     try (FileInputStream fis =
#     new FileInputStream(“details.txt”)) {
#     // code to read data
#     }
#     The resource used with try-with-resource must inherit AutoCloseable Interface.
#     You can specify multiple resources within a try block.



Questions
Which java construct can you use to close the system resources automatically?
To use a class object within try-with-resource construct, which Interface should the
class inherit from?



#                                   finally
#       The primary purpose of a finally block is to ensure that the application is brought back to a
#       consistent state, after the operations performed in the try block. Within the finally block,
#       usually resources like streams and database connections can be closed to prevent leaks.
#       InputStream is = null;
#       try{
#       is = new FileInputStream(“input.txt”);
#       }
#       finally {
#       if (is != null) {
#       is.close();
#       }
#       }
#       finally block execution
#       Compiler does all in its power to execute the finally block, except in the following
#       conditions:
#       If System.exit() is called.
#       If current thread is interrupted.
#       If JVM crashes.
#       Return from finally
#       You must never return from within the finally block. If there is a return statement present
#       in the finally block, it will immediately return, ignoring any other return present in the
#       function.


Questions
How do you guarantee that a block of code is always executed?
What kind of things should you do in a finally block?
What kind of things should you do in a catch block?
Does finally block always execute? What are the conditions when the finally block
does not execute?
Should you ever return from the finally block? Why?


#                                finalize()
#     When the Garbage Collector determines that there in no reference to an object exist, it
#     calls finalize() on that object; just before removing that object from memory.
#     finalize() will not be called if an object does not become eligible for garbage collection, or
#     if JVM stops before garbage collector gets chance to run.
#     finalize() could be overridden to release the resources like: file handles, database
#     connections, etc.; but you must not rely on finalize() method to do so, and release such
#     resources explicitly.
#     There is no guarantee that finalize() will be called by the JVM, and you should treat
#     finalize() method only as a backup mechanism for releasing resources. Where possible,
#     use try-with-resource construct to automatically release the resources.
#     If an uncaught exception is thrown by the finalize() method, the exception is ignored
#     before terminating the finalization.


Questions
What is finalize method in Java?
When does the finalize method gets called?
Who calls the finalize method?
What kind of things can be done in the finalize method?
Should you explicitly call finalize method to release resources? Why?
What are some alternate mechanisms that can be used to release system resources?
What happens if an unhanded exception is thrown from the finalize method
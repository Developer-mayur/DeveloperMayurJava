#                                          FUNCTIONAL
#                   PROGRAMMING
#                   Functional Interface
#                   Functional Interface is an interface with only one abstract method; but can have any
#                   number of default methods.
#                   @FunctionalInterface
#                   public interface Greator<T> {
#                   public T greater(T arg1, T args2);
#                   }
#                   Annotation @FunctionalInterface generates compiler warning when the interface is not a
#                   valid functional interface.
#                   Function Interface Greater

#                   @FunctionalInterface
#                   public interface Greator<T> {
#                   public T greater(T arg1, T args2);
#                   }

#                   Account class, defined below, used as an argument to the functional interface Greater.
#                   public class Account {
#                   private int balance;
#                   public Account(int balance) {
#                   this.balance = balance;
#                   }
#                   public int getBalance() {
#                   return balance;
#                   }
#                   @Override
#                   public String toString() {
#                   return “Account{” +
#                   “balance=” + balance +
#                   ‘}’;
#                   }
#                   }

#                   Code below demonstrates the usage of Lambda expression to find the account with the
#                   greater balance. Similarly same functional interface , Greater, can be used to compare
#                   other similar business objects too.
#                   public static void main(String [] args){
#                   Greator<Account> accountComparer =
#                   (Account acc1, Account acc2) ->
#                   acc1.getBalance() > acc2.getBalance() ?
#                   acc1 :
#                   acc2;
#                   Account account1 =
#                   new Account(6);
#                   Account account2 =
#                   new Account(4);
#                   System.out.println(
#                   ” Account with greater balance: “
#                   + accountComparer.greater(account2, account1));
#                   }
#                   Java also provides set of predefined functional interfaces for most common scenarios.



Questions
What is Function Interface?
What are the benefits of using Functional Interface




#                                   Lambda Expression
#               Lambda expressions provide a convenient way to create anonymous class. Lambda
#               expressions implements Functional Interface more compactly. Lambda Expressions are
#               primarily useful when you want to pass some functionality as argument to another method
#               and defer the execution of such functionality until an appropriate time.
#               Lambda expression can be just a block of statement with method body and optional
#               parameter types, but without method name or return type. It can be passed as a method
#               argument and can be stored in a variable.
#               // lambda expressions
#               () -> 123
#               (x,y) -> x + y
#               (Double x, Double y) -> x*y


Questions
What is Lambda Expression?
How is Lambda Expression and Anonymous class related?
Can you pass Lambda Expression as method parameter?
What is the meaning of deferred execution of functionality, using a Lambda
Expression?
What are the benefits of using Lambda Expression?
How’s Lambda Expression and Functional Interface related?




#                                 Pure Functions
#       Pure functions are function whose results depend only on the arguments passed to it and is
#       neither affected by any state change in the application nor it changes the state of the
#       application. Pure functions always return the same result for the same arguments.
#       public int increaseByFive(int original){
#       int toAdd = 5;
#       return original + toAdd;
#       }



Questions
What is a Pure Function?
What is the use of Pure Function in Functional Programming?
How is it guaranteed that the Pure Function will always return the same results for
the same arguments?





<======================================Not done by Mem  ==========================================>

#                             Fluent Interface
#      Fluent interface is used to transmit commands to subsequent calls, without a need to
#      create intermediate objects and is implemented by method chaining. The fluent interface
#      chain is terminated when a chained method returns void. Fluent interface improves
#      readability by reducing the number of unnecessary objects created otherwise.
#      In the code below, Fluent Interface is used to add a new Employee.
#      employee.create()
#      .atSite(“London”)
#      .inDepartment(“IT”)
#      .atPosition(“Engineer”);
#      Fluent interfaces are primarily used in scenarios where you build queries, create series of
#      objects or build nodes in hierarchal order.


Questions
What is Fluent Interface?
What are the benefits of defining and using Fluent Interface?
Describe some usage of Fluent Interface
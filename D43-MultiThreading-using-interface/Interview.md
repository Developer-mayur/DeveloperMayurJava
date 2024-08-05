#                                            THREADING


#                                          @Threading Terms
#                       Thread is a smallest piece of executable code within a process.
#                       Program is set of ordered operations.
#                       Process is an instance of a program.
#                       Context Switch is expensive process of storing and restoring the state of thread.
#                       Parallel processing is simultaneous execution of same task on multiple cores.
#                       Multithreading is the ability of a CPU to execute multiple processes or threads
#                       concurrently.
#                       Deadlock occurs when two threads are waiting for each other to release lock.


#                                              Basic Concepts
#                        All Java programs begin with main() method on a user thread.
#                        Program terminates when there is no user thread left to execute.
#                        Thread maintains a private stack and series of instructions to execute.
#                        Thread has a private memory called thread local storage, which can be used to store
#                        thread’s current operation related data, in a multi-threaded environment.
#                        JVM allows process of have multiple threads.
#                        Each thread has a priority.





Questions
@1 What is a thread?                                               
@2 What is a program?
@3 What is a process?
@4 What is the difference between a thread and a process?
@5What is the difference between a program and a process?
@6 Explain context switching of thread?
@7 What is parallel processing?
@8 What is multi-threading?
@9 How parallel processing and multi-threading related?
@10 What is deadlock?
@11 What is a user thread?
@12 What is thread local storage? What are the things would you store with thread local
         storage?
@13 Do threads share stack memory?




#                                Thread Lifecycle
#                       are various stages of thread states .
#                      New - Thread is created but not started.
#                      Runnable - Thread is running.
#                      Blocked - Thread waiting to enter critical section.
#                      Waiting - Thread is waiting by calling wait() or join().
#                      Time-waiting - Thread waiting by calling wait() or join() with specified timeout.
#                      Terminated - Thread has completed its task and exited.
#                      Notes
#                      You can get the state of thread using getState() method on the thread.






  Questions
@1 Describe different stages of thread lifecycle?
@2 What is difference between blocked state and waiting state?
@3 How can you find thread’s state?
@4 How thread sleep() method is different from thread wait() method?


#                      Thread Termination
#                      The thread should be stopped calling interrupt() method. Calling thread interrupt even
#                      breaks out of Thread.sleep().
#                      The operation executing on thread should recurrently call isInterrupted() method to check
#                      if thread is requested to be stopped, where you can safely terminate the current operation
#                      and perform any required cleanup.
#                      if (Thread.currentThread().isInterrupted()) {
#                      // cleanup and stop execution
#                                  }


#                       Notes
#                       stop(), suspend() and resume() methods are deprecated, as using these may lead the
#                       program to an inconsistent state.
#                       Questions
#                       Define a good strategy to terminate a thread?
#                       What is thread interrupt? How thread’s interrupt method is different from thread’s
#                       stop method?
#                       What happens if a thread is sleeping and you call interrupt on the thread?
#                       Does calling interrupt stops the thread immediately?
#                       Why you shouldn’t call thread’s stop and suspend methods?
#                       Implementing Runnable vs Extending Thread
#                       Thread instantiated implementing Runnable Interface
#                       public class RunnableDerived
#                       implements Runnable {
#                       public void run() {
#                       }
#                       }
#                       Thread created extending Thread class
#                       public class ThreadDerived
#                       extends Thread {
#                       public void run() {
#                       }
#                       }
#                       Runnable’s run() method does not create a new thread but executes as a normal
#                       method in the same thread it’s created on, whereas Thread’s start() methods creates a
#                       new thread.
#                       Runnable is preferred way to execute a task on a thread, unless you are specializing
#                       Thread class, which is unlikely in the most of the case.
#                       By Implementing Runnable, you are providing a specialized class an additional
#                       ability to run too.
#                       Also by separating the task as Runnable, you can execute the task using different
#                       means.


Questions
@1 What are the different ways to create a thread?
@2 How implementing Runnable interface is different from extending Thread class?
@3 When should you extend Thread class?
@4 When should you inherit Runnable Interface?
@5 Between Runnable and Thread, which one is the preferred way?
@6 Does implementing Runnable creates a thread?
@7 Both Thread class and Runnable Interface have run methods, what is the difference?






<======================================Not done by pawan sir==========================================>

#                                 Runnable vs Callable Interface

#                           Runnable Interface

#                       @FunctionalInterface
#                       public interface Runnable {
#                       public abstract void run();
#                       }

#                       Callable Interface
#                       @FunctionalInterface
#                       public interface Callable<V> {
#                       V call() throws Exception;
#                       }

#                       Runnable cannot return result and cannot throw a checked exception.
#                       A Callable needs to implement call() method while a Runnable needs to implement
#                       run() method.
#                       A Callable can be used with ExecutorService methods but a Runnable cannot be.





Questions
@1 What is the difference between Callable and Runnable interface?                  

@2 What is the benefit of using Runnable over Callable?   

@3 Can you throw checked exception from Runnable interface?   

@4 Why Runnable and Callable interfaces are called Functional Interface?   

@5 Which of the Interface returns result: Runnable or Callable?   




<======================================Not done by pawan sir==========================================>

#                                  Daemon Thread
#              A daemon thread is a thread, which allows JVM to exit as soon as program finishes, even
#              though it is still running. As soon as JVM halts, all the daemon threads exists without
#              unwinding stack or giving chance to finally block to execute. Daemon thread executes on
#              very low priority.
#              Threads inherit the daemon status of parent thread, which means that any thread that is
#              created by the main thread will be a non-daemon thread.
#              Generally the daemon threads are used to support background tasks or services for the
#              application. Garbage Collection happens on Daemon thread.
#              You can create a daemon thread like following:
#              Thread thread = new Thread();
#              thread.setDaemon(true);
#              All non-daemon threads are called user threads. User threads stop the JVM from closing.
#              The process terminates when there are no more user threads. The Java main thread is
#              always a user thread.










Questions
What is Daemon thread?
What is user thread? What is main thread?
Can a program exit if Daemon thread is still running?
Can a program exit if user thread is still running?
When JVM halts exiting all running Daemon thread, does the finally block on a
Daemon thread still gets a chance to execute?
When a new thread is created; is it created as a user thread or a Daemon thread?
What happens when no user thread is running but a Daemon thread is still running?
What is Java main thread: a user thread or a Daemon thread?
When you create a new thread on the main thread, what’s the type of thread created:
daemon or user?
For what type of jobs should you use Daemon thread?


<======================================Not done by pawan sir==========================================>
#                            Race Condition and Immutable Object
#          Race condition occurs when multiple threads concurrently access a shared data to modify
#          it. As it is not possible to predict the order of data read and write by these threads, it may
#          lead to unpredictable data value.
#          An object is considered immutable when there is no possibility of its state change after its
#          construction. If an object is immutable, it can be shared across multiple threads without
#          worrying about race condition.
#          To make an object Immutable
#          Declare the class final.
#          Allow only constructor to create object. Don’t provide field setter.
#          Mark all the field private.
#          Questions
#          How immutable objects help preventing race condition?
#          Why race condition may produce unpredictable results?
#          Why immutable objects are considered safe in multi threaded environment?
#          Why should you declare immutable class as final?
#          Why constructor should be the only way to create immutable object? What happens if
#          setters are provided?
#          Thread Pool
#          Thread Pool is a collection of specified number of worker threads, which exists separately
#          from the Runnable and Callable tasks.
#          A fixed thread Pool reduces the overhead of thread creation. It helps the application to
#          degrade gracefully when there is a surge of requests beyond its capacity to process, by
#          preventing application from going into a hang state or from crashing.
#          Thread Pool also enables a loosely coupled design by decoupling the creation and
#          execution of tasks.
#          Creating a fixed thread pool is easy with Executors class where you can use
#          newFixedThreadPool() factory method to create ExecutorService to execute tasks.



Questions
What is thread pool?
How a thread pool reduces the overhead of thread creation?
How a thread pool helps to prevent application from hanging or crashing?
What is fixed thread pool and how is it created?
How does thread pool enables loosely coupled design
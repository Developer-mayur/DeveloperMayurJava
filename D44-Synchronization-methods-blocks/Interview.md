#                                                      SYNCHRONIZATION
#                                            Concurrent vs Parallel vs Asynchronous
#                     Parallel processing is simultaneous execution of same task on multiple cores.
#                     Concurrent processing is simultaneous execution of multiple tasks; either on multiple
#                     cores or by pre-emptively time-shared thread on the processor.
#                     Asynchronous processing is independent execution of a process, without waiting for a
#                     return value from intermediate operations.


Questions
Explain concurrent processing?
Explain parallel processing?
Explain asynchronous processing?
Explain the difference between concurrent and parallel processing?
Does parallel processing require multiple threads?
When an application is concurrent but not parallel?
When application processes multiple operations simultaneously without dividing
these operations further into smaller tasks.
When an application is parallel but not concurrent?
When application processes one operation dividing the operation into smaller
tasks that are processed in parallel.
When an application is neither concurrent not parallel?
When application processes only one operation without dividing the operation
into smaller tasks.
When an application is both concurrent and parallel?
When application processes multiple operations simultaneously and also
dividing these operations further into smaller tasks that are processed in
parallel.






#                                     Thread Synchronization
#          Race condition occurs when multiple threads concurrently access a shared data to modify
#          it. As it is not possible to predict the order of data read and write by these threads, it may
#          lead to unpredictable data value.
#          Critical Section is the block of code that if accessed concurrently, by more than one
#          thread, may have undesirable effects on the outcome.
#          Thread Synchronization is controlling the access to critical section to prevent undesirable
#          effects in the program.
#          Synchronization creates memory barrier, known as happen-before, which ensures that all
#          the changes made by a thread to the local objects in the critical section, are available to
#          any other thread that acquires the same local objects subsequently.



Questions
Explain race condition in multi-threading?
What is critical section?
What is thread synchronization?
What is a memory barrier?
What is the concept of happen-before in thread synchronization?



#                         Synchronized Method vs Synchronized Block
#                  synchronized keyword is used to mark critical section in the code.
#                  Mutual exclusion synchronization is achieved by locking the critical section using
#                  synchronized keyword.
#                  This can be done in following two ways.
#                  Marking method as critical section
#                  public class DatabaseWrapper {
#                  Object reference = new Object();
#                  // Method marked as critical section
#                  public synchronized void writeX() {
#                  // code goes here
#                  }
#                  // Method marked as critical section
#                  public static synchronized void writeY() {
#                  // code goes here
#                  }
#                  }
#                  Marking block of code as critical section
#                  public void writeToDatabase() {
#                  // multiple threads can reach here
#                  // Code marked as critical section
#                  synchronized (this) {
#                  // only one thread can
#                  // execute here at a time
#                  }
#                  // multiple threads can execute here
#                  }



#                                        Notes
#      Minimize the scope of locking to just critical section. This will improve overall
#      performance and minimize chances for encountering a race condition.
#      Prefer synchronized block over synchronized method, as block locks only on a local
#      object as opposed to entire class object.
#      Inside synchronized, never call a method provided by the client code or the one that
#      is designed for inheritance.


Questions
How is synchronized keyword used?
What is the difference between synchronized method and synchronized block?
Why synchronized block is preferred to synchronized method?
Does synchronized method locks the entire object?
What problem you may encounter if you call a method provided by the client, from
inside the synchronized block or method?



#                             Conditional Synchronization
#                   Conditional synchronization is achieved using conditional variable along with wait() and
#                   notify() or notifyAll() methods.
#                   // conditional synchronization
#                   public void operation()
#                   throws InterruptedException {
#                   synchronized(reference) {
#                   if (condition1) {
#                   // wait for notification
#                   reference.wait();
#                   }
#                   if (condition2) {
#                   // Notify all waiting threads
#                   reference.notifyAll();
#                   }
#                   }
#                   }


1. There are two methods to signal waiting thread(s).
notify() - signals only one random thread.
notifyAll() - signals all threads in wait state.
2. wait() has an overload to pass timeout duration too, wait(long timeOut).
3. Between notify() and notifyAll() method, prefer using notifyAll() as it notifies all the
waiting threads.
4. notify() wakes a single thread, and if multiple threads are waiting to be notified, then
the choice of thread is arbitrary.
Questions
What is conditional synchronization?
What is the propose of the wait call?
What is the difference between notify and notifyAll method?
When you call notify, with multiple threads waiting for the notification, which one
will be notified?
Between notify and notifyAll, which one would you prefer? Why?



#                                         Volatile
#      In a multi-threaded application, every thread maintains a copy of variable from main
#      memory to its CPU cache. So any change made by a thread to the variable in its CPU
#      cache will not be visible to other threads.
#      A field marked volatile is stored and read directly from the main memory. As volatile field
#      is stored in the main memory, all the threads have visibility to most updated copy of the
#      volatile field’s value, irrespective of which thread modified it.
#      Consider a class Ledger, which has a member currentIndex to keep track of number of
#      entries made. In a multi-threaded environment, each thread will increment currentIndex
#      value independently.
#      public class Ledger {
#      public int currentIndex = 0;
#      }
#      If we mark currentIndex as Volatile, then each thread will use its value from the main
#      memory and will not create a copy of it.
#      public class Ledger {
#      public volatile int currentIndex = 0;
#      }

Questions
What is volatile field?
Explain the problem that volatile field solves?
Where does the volatile field gets stored?




#                                      static vs volatile vs synchronised
#               static Variable
#               static variables are used in context of class objects where only one copy of static variable
#               exists irrespective of how many objects of the class are created.
#               But if there are multiple threads accessing the same variable, each thread will make a copy
#               of that variable in its CPU cache and change made by a thread will not be visible to other
#               threads.
#               volatile Variable
#               volatile variables are used in context of threads, where only one variable exists
#               irrespective of how many threads or objects accessing it and everyone always get the
#               most recently updated value. Volatile forces all the reads and writes to happen directly in
#               the main memory and not in CPU caches.
#               synchronized
#               Both static and volatile are field modifier dealing with memory visibility related to
#               variables; whereas, synchronized deals with controlling access to a critical section in code
#               using a monitor, thus preventing concurrent access to a section of code.



Questions
What are static variables?
All the objects of a class share static variables. But in a multi-threaded environment;
why a change made by one object to the static variable is not visible to the objects on
another thread?
If both static and volatile variables are shared across objects, then what’s the problem
a volatile variable solves?
How are volatile and static variables different from synchronized, as even the
synchronized monitor guards the memory object?



#                                     ThreadLocal Storage
#      Each thread has a private memory called thread local storage, which can be used to store
#      thread’s current operation related data. Usually the ThreadLocal variables are
#      implemented as private static fields and are used to store information like Transaction
#      Identifier, User Identifiers, etc.
#      ThreadLocal declaration
#      ThreadLocal<String> threadLocal =
#      new ThreadLocal<String>();
#      Setting thread local value
#      threadLocal.set(“Account id value”);
#      Getting thread local value
#      String accountId = threadLocal.get();
#      As ThreadLocal objects are contained within a thread, you don’t have to worry about
#      synchronizing access to that object.
#      Life of ThreadLocal objects is tied to the thread it’s created for, unless there are other
#      variables referencing the same object.
#      To prevent leak, it’s a good practice to remove ThreadLocal object using remove()
#      method.
#      threadLocal.remove();


Questions
What is thread local storage?
What is the kind of information should you store in Thread Local Storage?
Why you don’t need to synchronize access to the objects that are stored in
ThreadLocal Storage?
Why should you call remove method on Thread Local Storage?



#                   wait() vs sleep()

#                   wait()
#                   Conditional Synchronization with wait().
#                   public void manageWaitFor(int timeInMs)
#                   throws InterruptedException {
#                   synchronized (reference) {
#                   if (condition1) {
#                   // wait for notification
#                   reference.wait(timeInMs);
#                   }
#                   }
#                   }

#                   sleep()
#                   Thread sleeping for specified interval.
#                   public void manageSleepFor(int timeInMs)
#                   throws InterruptedException {
#                   //Pause for timeInMs milliseconds
#                   Thread.sleep(timeInMs);
#                   //Print a message
#                   print(“Slept for :” + timeInMs + “ms.”);
#                   }
#                   wait is called on the object’s monitor; whereas, sleep is called on thread.
#                   Waiting object can be notified; whereas, sleeping thread cannot.
#                   Sleeping thread cannot release a lock; whereas, waiting object can.
#                   To wake a sleeping thread you need reference of it, which is not needed for a waiting
#                   object.


Questions
What is the difference between wait and sleep?
Why it’s possible to notify waiting object to wake but not the sleeping?
You need direct handle to wake a sleeping thread; do you need direct access to a
waiting object too? Why?
What is the mechanism to signal an object to come out of wait?



#                                 Joining Threads
#           Threads are usually joined when there is a dependency between the threads. The join()
#           method of the target thread is used to suspend the current thread. In such situations current
#           thread cannot proceed, until the target thread on which it depends, has finished execution.
#           // main thread joined with the thread
#           public void main(String[] args) {
#           Thread thread1 = new Thread(
#           ThreadMethodRef::
#           threadMethod);
#           thread1.start();
#           // current thread waits
#           // until thread1 completes
#           // execution
#           thread1.join();
#           }




Questions
What is the purpose of thread’s join method?
Why do you need to join two threads?



#                               Atomic Classes
#       Atomic classes provides ability to perform atomic operations on primitive types, such that
#       only one thread is allowed to change the value until the method call completes. Atomic
#       classes like AtomicInteger and AtomicLong wraps the corresponding primitive types.
#       There is one present for reference type too, AtomicReference.
#       There is no need to provide synchronized access to Atomic Class objects. Method
#       incrementAndGet() is AtomicInteger is often used in place of pre and post increment
#       operators.



Questions
What are atomic classes?
Why you don’t require synchronizing access to an object of atomic class?
Why pre and post increment operator are not thread safe?
Pre and post operation are multiple operations under the hood; read, increment
and write. All the three are not synchronized together, so any thread context
switch that happens in between, will result into undesired result.
What is the difference between Atomic and Volatile variables?



#                Atomic variables provide atomic access even for the compound operation like
#                pre and post increment operation, which is not possible if variable is declared as
#                Volatile. Volatile just guarantees happen-before reads.
#                Lock
#                Locking is a mechanism to control access to the shared resources in a multi-threaded
#                environment.
#                ReentrantLock class implements lock interface.
#                A lock can be acquired and released in different blocks of code.
#                Lock interface has method tryLock() to verify resource availability.
#                As a good practice, acquired lock must be released in the finally block .
#                // Thread safe class
#                public class SafeAccount {
#                // Create lock object
#                private Lock lockObject =
#                new ReentrantLock();
#                public void addMoney() {
#                // Acquire the lock
#                lockObject.lock();
#                try {
#                // add some money logic here
#                } finally {
#                // Release the lock
#                lockObject.unlock();
#                }
#                }
#                }



Questions
Explain locking mechanism in a multi-threaded environment?
Do you need to acquire and release lock in same block of code?
Why should you prefer using tryLock() instead of lock()?



#                                      ReadWriteLock
#            ReadWriteLock maintains pair of associated locks, one for writing and the other for
#            read-only operations.
#            Only one thread can acquire write lock, but multiple threads can have read lock.
#            ReadWriterLock interface is implemented by ReentrantReadWriteLock.
#            // ReentrantReadWriteLock lock
#            ReentrantReadWriteLock rwl =
#            new ReentrantReadWriteLock();
#            // read lock
#            Lock rl = rwl.readLock();
#            // write lock
#            Lock wl = rwl.writeLock();






Questions
What are the benefits of using ReadWriteLock?
In which scenario would you prefer ReadWriteLock to any other locking
mechanism ?






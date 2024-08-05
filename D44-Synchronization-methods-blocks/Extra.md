#                                  Synchronisers
#              Synchronizers synchronizes multiple threads to protect a Critical Section.
#              Sync
#              Point Threads
#              | ––––
#              | –––––-
#              | –––-
#              Synchronizer Types
#              Barriers
#              Semaphore
#              Phasers
#              Exchangers
#              Latch




Questions
What is the purpose of synchronizers?
What are the different types of synchronizers available in Java?



#                                       Barriers
#       In Barriers, set of threads waits for each other to arrive at barrier point before
#       moving ahead.
#       CyclicBarrier is concrete implementation of the Barrier synchroniser.
#       // barrier with five threads
#       CyclicBarrier barrier =
#       new CyclicBarrier(5);
#       }
#       }
#       A Barrier is called cycle because it can be reused after calling reset() on it.
#       Action can be passed to the CyclicBarrier, to execute when all the threads reach
#       barrier point.
#       // barrier with an action to run
#       // at the barrier point.
#       CyclicBarrier barrier =
#       new CyclicBarrier(5, () -> {
#       // barrier point action code.
#       });
#       If any of the thread is terminated prematurely then all the other threads waiting at the
#       barrier point will also exit.
#       Barriers are generally used when you divide an operation into multiple tasks on
#       separate threads, and wait for all the tasks to complete before moving ahead.





Questions
Explain Barrier synchronizer?
Can you reuse the same Barrier object again? How?
What happen if one of thread dies, for which other threads were waiting at the
Barrier?
For what kind of work would you use Barrier?



#                                         Semaphore
#         Semaphore maintains a specified number of permits to access a Critical Section.
#         // Semaphore created with four permit
#         // for four threads
#         Semaphore semaphore =
#         new Semaphore(4);
#         To gain permit, use acquire() method. Each call to acquire() method is blocked until
#         permit becomes available.
#         To release permit, use release() method.
#         Permit can be released by a different thread, other than the one that acquired it.
#         If release() is called more number of times than acquire(), then for each such
#         additional release, an additional permit will be added.
#         If you wish to acquire mutually exclusive lock, initialize the Semaphore with only
#         one permit.
#         Semaphore are generally used to allow limited access to an expensive resource.




Questions
Explain Semaphore synchronizer?
What happens if you call release() more number of time than acquire()?
What happens when you call acquire, but permit is not available?
How can you acquire mutually exclusive lock using Semaphore?
Where do you use Semaphore?





#                                     Phaser
#        Unlike other barriers, the number of parties registered with the Phaser can
#        dynamically change over time.
#        // Phaser with four registered parties
#        Phaser phaser =
#        new Phaser(4);
#        A phaser can also be reused again.
#        Use register() method to register a party.
#        When the final party for a given phase arrives, an optional action can be performed
#        and then the Phaser advances to the next phase.
#        Use arriveAndAwaitAdvance() method to wait for all parties to arrive before
#        proceeding to the next phase.
#        Phasers monitors count of registered, arrived and un-arrived parties. Even a caller
#        who is not a registered party can monitor these counts on a Phaser.
#        A party can be de-registered using arriveAndDeregister() method, from moving to
#        the next phase.



Questions
Explain Phasor synchronizer?
Can the number of parties registered with Phasor dynamically change over time?
Can you reuse the same Phaser object again?
Can you monitor count of registered parties with Phasor using some external object?
What is the difference between Semaphore and Phaser, with respect to number of
parties that can register with it?




#                                Exchanger
#      Exchanger lets two threads wait for each other at a Synchronization point to swap
#      elements.
#      // Exchanging array of strings
#      Exchanger<ArrayList<String>>
#      exchanger =
#      new Exchanger<ArrayList<String>>();
#      Exchangers use exchange() method to exchange information.
#      // exchanger exchanging data
#      objectToExchange =
#      exchanger.
#      exchange(objectToExchange);
#      On exchange(), the consumer empties the object to be exchanged and waits for the
#      producer to exchange it with full object again.



Questions
Explain Exchanger synchronizer?
How many thread are required with the Exchanger object?
What is the primary purpose of Exchanger synchronizer?
Does Exchanger synchronizer uses the same object to exchange every time or a
different object can be exchanged?





#                                Latch
#       Latch makes the group of threads wait till a set of operations is finished.
#       Latch cannot be reused.
#       CountDownLatch class provides implementation for Latch.
#       All threads wait calling await() method till countDown() is called as many times latch
#       counter is set.
#       // Create a countdown latch with
#       // five counter
#       CountDownLatch cdl =
#       new CountDownLatch(5);
#       // Count down on the latch after
#       // completion of thread job
#       cdl.countDown();
#       // awaiting for count down signals
#       cdl.await();


Questions
Explain Latch synchronizer?
Can you reuse the same Latch object again; like Barrier and Phaser?
What is the mechanism of signalling a job completion to Latch?



#                               Executor Framework
#            Executor framework provides an infrastructure to execute set of related tasks on thread.
#            It takes care to manage the following.
#            Creating and destroying threads.
#            Maintaining optimal number of threads for a task.
#            Parallel and sequential execution of tasks.
#            Segregating task submission and task execution.
#            Policies related to controlling task execution.
#            // Executor interface definition
#            public interface
#            Executor {
#            void execute (Runnable command);
#            }


Questions
Explain Executor framework?
What are the various capabilities of Executor framework?



#          Executor Service
#          ExecutorService inherits from Executor interface providing following additional
#          methods.
#          shutdown() - shuts down the executor after submitting the tasks.
#          shutdownNow() - interrupts the current task and discards the pending tasks.
#          submit() - adds tasks to the Executor.
#          awaitTermination() - waits for existing tasks to terminate.
#          ExecutorService provides Future object to track the progress and the status of the
#          executing task.
#          All the tasks submitted to the Executor are queued, which are executed by the thread
#          pool threads.
#          // Executor created with five threads in its thread pool
#          ExecutorService exec =
#          Executors.
#          newFixedThreadPool(5);
#          To create a thread pool with single thread, use newSingleThreadExecutor() method.
#          Handling Results
#          run() method of the Runnable interface cannot return result or throw exception.
#          Tasks, which can return result, are instance of Callable interface.
#          //tasks can return results derived from Callable using call method
#          public interface Callable<V> {
#          V call() throws Exception;
#          }
#          submit() returns Future object which helps to track task.
#          // ExecutorService example
#          public class ExecService {
#          public static void main(String[] args)
#          throws ExecutionException,
#          InterruptedException {
#          // Create executor with five threads
#          // in its thread pool.
#          ExecutorService exec =
#          Executors.newFixedThreadPool(5);
#          // Submit the callable task to executor
#          Future<String> task =
#          exec.submit(
#          new Callable<String>() {
#          @Override
#          public String call()
#          throws Exception {
#          //some logic
#          return null;
#          }
#          });
#          // waits for result
#          String result =
#          task.get();
#          // Shutdown executor
#          exec.shutdown();
#          }
#          }
#          If there is any exception during the task execution, calling get() method on the
#          ExecutorService will throw an instance of ExecutionException.
#          Scheduling Task
#          ScheduledExecutorService can be used to schedule a task to run in future.
#          Methods to schedule task.
#          • schedule(
#          task,
#          delayTime,
#          TimeUnit.SECONDS)
#          • scheduleAtFixedRate(
#          task,
#          delayTime,
#          repeatPeriod,
#          TimeUnit.SECONDS)
#          • scheduleWithFixedDelay(
#          task,
#          delayTime,
#          fixedDelay,
#          TimeUnit.SECONDS);
#          ExecutorCompletionService
#          ExecutorCompletionService uses Executor to execute the task.
#          CompletionService of Executor can be used to get results from multiple tasks.
#          ExecutorCompletionService provides concrete implementation for
#          CompletionService.
#          // Create executor with five threads
#          ExecutorService es =
#          Executors.newFixedThreadPool(5);
#          // ExecutorCompletionService returns an object
#          ExecutorCompletionService<Result> cs =
#          new ExecutorCompletionService<>(es);
#          // submit task to ExecutorCompletionService
#          cs.submit(longTask);
#          // get the result of task
#          Future<Result> completedTask =
#          cs.take();
#          Notes
#          Always associate context-based names to the threads, it immensely helps in
#          debugging.
#          Always exit gracefully, by calling either shutdown() or shutdownNow() based on your
#          use case.
#          Configure thread pool for the ExecutorService such that the number of threads
#          configured in the pool are not significantly greater than the number of processors
#          available in the system.
#          You should query the host to find the number of processor to configure thread pool.
#          Runtime.getRuntime().
#          availableProcessors();



Questions
Explain ExecutorService?
How can you track progress and status of executing task?
Does Executor service use dedicated threads to execute queued tasks?
Can you use Runnable object with the ExecutorService? Why?
How do you find if an exception is thrown in the ExecutorService?
Can you schedule a task to run in future with the ExecutorService?
With ExecutorService, how can you get results from multiple tasks?
What is the difference between submit() and execute() methods of ExecutorService?
If you use submit(), you can get any exception thrown by calling get() method on
Future; whereas, if you use execute(), exception will go to
UncaughtExceptionHandler.
How can you exit gracefully from ExecutorService?
What should be the criteria for configuring thread pool size? How can you set that?



#                                 Fork-Join
#        Fork-Join framework takes advantage of multi-processors and multi-cores systems.
#        It divides the tasks into sub-tasks to execute in parallel.
#        fork() method spawns a new sub-task from the task.
#        // spawn subtask
#        subTask.fork();
#        join() method lets the task wait for other task to complete.
#        // wait for subtask to complete
#        subTask.join();
#        Important classes in Fork-Join
#        ForkJoinPool - thread pool class is used to execute subtasks.
#        ForkJoinTask - manages subtask using fork() and join() methods.
#        RecursiveTask - task that yields result.
#        RecursiveAction - task that does not yield result.
#        Both, RecursiveTask and RecursiveAction provides abstract compute() method to be
#        implemented by the class, whose object represents the ForkJoin task.


Questions
Explain Fork-Join framework in Java?
How Fork-Join framework helps to optimize task execution?
What is the difference between RecursiveTask and RecursiveAction
class Task{
   static synchronized public void m1(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName()+"static");
                Thread.sleep(2000);
            }
         }
        catch(Exception e){
            e.printStackTrace();
        }
    }

static synchronized public void m3(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName()+"static");
                Thread.sleep(2000);
            }
         }
        catch(Exception e){
            e.printStackTrace();
        }
    }


     

       

      synchronized public void m2(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName()+"instance");
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

      synchronized public void m4(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName()+"instance");
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class First extends Thread{
    Task task;
    public First(Task task){
      this.task = task;
    }
    public void run(){
     task.m1();
  
    }
}
class Second extends Thread{
    Task task;
    public Second(Task task){
      this.task = task;
    }
    public void run(){
     task.m2();
     task.m4();

 
    }

    class Third extends Thread{
    Task task;
    public Third(Task task){
      this.task = task;
    }
    public void run(){
      task.m3();
 
    }
}

class Fourth extends Thread{
    Task task;
    public Fourth(Task task){
      this.task = task;
    }
    public void run(){
     task.m4();
  
    }
}
}
class TestMain{
    public static void main(String args[]){
      Task task1 = new Task();
    First t1 = new First(task1); 
    First t2 = new First(task1);
    Second t3 = new Second(task1);
    Second t4 = new Second(task1);

    
      t1.setName("Thread T1");
      t2.setName("Thread T2");
      t3.setName("thread T3");
      t4.setName("thread T4");

      t1.start();
      t2.start();
      t3.start();
      t4.start();

    }
}

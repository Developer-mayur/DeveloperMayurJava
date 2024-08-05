 class sy{



     public void m1(){

    try{
    synchronized(this){
               for(int i=1; i<=5; i++){
                System.out.println("syncronized");
  
                }

               for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName()+" executing m1()");
                Thread.sleep(3000);
               }
            }
       
        }
    catch(Exception e){
            e.printStackTrace();
     }}

      public void m2(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName()+" executing m2()");
                Thread.sleep(3000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class First extends Thread{
    sy sy;
    public First(sy sy){
      this.sy = sy;
    }
    public void run(){
       sy.m1();
    }
}
class Second extends Thread{
    sy sy;
    public Second(sy sy){
      this.sy = sy;
    }
    public void run(){
       sy.m2();
    }
}
class TestMain{
    public static void main(String args[]){
      sy s = new sy();
      First t1 = new First(s);        
      Second t2 = new Second(s);
    
      t1.setName("Thread T1");
      t2.setName("Thread T2");

      t1.start();
      t2.start();
    }
}

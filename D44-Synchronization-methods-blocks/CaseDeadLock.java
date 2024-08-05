 class Dead1 {
    synchronized public void m1(Dead2 dead2) {
        System.out.println(Thread.currentThread().getName() + " Dead1.m1");
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        dead2.m2(this);
    }


    
}

class Dead2 {
    synchronized public void m2(Dead1 dead1) {
        System.out.println(Thread.currentThread().getName() + "   Dead2.m2");
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
                dead1.m1(this);

     }

       

}


class First extends Thread {
    Dead1 dead1;
    Dead2 dead2;

    public First(Dead1 dead1, Dead2 dead2) {
        this.dead1 = dead1;
        this.dead2 = dead2;
    }

    public void run() {
         dead1.m1(dead2);
    }
}

class Second extends Thread {
    Dead1 dead1;
    Dead2 dead2;

    public Second(Dead1 dead1, Dead2 dead2) {
        this.dead1 = dead1;
        this.dead2 = dead2;
    }

    public void run() {
         dead2.m2(dead1);
    }
}

class TestMain {
    public static void main(String args[]) {
        Dead1 ot1 = new Dead1();
        Dead2 ot2 = new Dead2();

        First t1 = new First(ot1, ot2);
        Second t2 = new Second(ot1, ot2);

        t1.setName("Thread T1");
        t2.setName("Thread T2");

        t1.start();
        t2.start();
    }
}

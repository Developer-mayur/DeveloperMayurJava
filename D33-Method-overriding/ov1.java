class A{
    public  void m1(){
        System.out.println("A-m1()");
    }
}

class B extends A{
 @Override
    public void m1(){
        System.out.println("B-m1()");
    }
}



class c extends B{
 public void m1(){
        System.out.println("C-m1()");
    }


}
class TestMain{
    public static void main(String args[]){
        A obj = new c();
        obj.m1();
    }
}






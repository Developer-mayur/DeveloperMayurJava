public class E1 {
    public static void main(String[] args) {
    System.out.println("start");
    System.out.println("1");
    System.out.println("2");
    System.out.println("3");
    try {
    System.out.println(10/0);}
    catch(ArithmeticException e){
    System.out.println("dont/by zero");
    }
    System.out.println("4");
    System.out.println("5");
    System.out.println("end");
    }
    }
    
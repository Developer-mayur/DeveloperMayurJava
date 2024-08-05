public class E2 {
    public static void main(String[] args) throws InterruptedException,
    ArithmeticException,IOException{
    info();
    }
    private static void info() throws IOException {
    System.out.println("hello");
    throw new IOException();
    }
    
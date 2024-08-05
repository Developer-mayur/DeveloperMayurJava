
public class LambdaMethodReferenceExample {

    @FunctionalInterface
    interface StringProcessor {
        void process(String str);
    }

    public static void main(String[] args) {
        // Using a lambda expression
        StringProcessor processor = str -> System.out.println(str.toUpperCase());
        
        // Calling the process method
        processor.process("hello");
    }
}


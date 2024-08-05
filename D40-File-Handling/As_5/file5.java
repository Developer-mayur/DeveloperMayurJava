import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable {
    private String name;

    public Customer() {}

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}

public class file5 {
    public static void main(String[] args) {
        File file = new File("customer.txt");

         try (FileOutputStream fout = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fout)) {
            Customer c = new Customer("mayur rathore is a good person");
            oos.writeObject(c);
        } catch (Exception e) {
            System.out.println("Exception");
        }

         int w = 0;
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

             Customer v = (Customer) ois.readObject();
            String c = v.getName();  
            // System.out.println(v);
          
 
             String[] words = c.split("\\s+");

            w = words.length; 
            // String[] word = v.length();
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);

             }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("words: " + w);
    }
}

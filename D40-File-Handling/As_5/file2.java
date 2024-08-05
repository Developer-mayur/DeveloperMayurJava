import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Que. 2 What is Serialization ? Write a java program to store the object into the file.

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

public class file2 {
    public static void main(String[] args) {
        File file = new File("customer.txt");

         try (FileOutputStream fout = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fout)) {
            Customer c = new Customer("mayur rathore is  Object");
            oos.writeObject(c);
        } catch (IOException e) {
            System.out.println("Exception");
        }

         try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

             Customer v = (Customer) ois.readObject();
            String c = v.getName();  
            System.out.println(c);
 
  
        } catch (Exception e) {
            e.printStackTrace();
        }

     }
}

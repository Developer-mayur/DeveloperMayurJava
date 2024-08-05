import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;
 import java.io.Serializable;
    


class Customer implements Serializable {
     private String name;

    public Customer() {}

    public Customer(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class file4read {
    public static void main(String[] args) {
        File f = new File("customer.txt");

         try {
            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            Customer c = new Customer("tsttdt");
            oos.writeObject(c);
            oos.close();
        } catch (Exception e) {
            System.out.println("Exception during writing: " + e);
        }

        int cou = 0;
        try (FileInputStream fis = new FileInputStream(f);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
             Customer v = (Customer) ois.readObject();
            System.out.println(v);

             
            
            fis.getChannel().position(0);     //file input  stream data ko last me deserialize 
            int c;                                   //karte time pointer ya carser ko last per chhod deti h esliye eska use karte h
            while ((c = fis.read()) != -1) {
                if (c == 't' || c == 'T') {
                    cou++;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("The character 't' and 'T' occurred " + countT + " times.");
    }
}

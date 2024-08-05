import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
class TestMain{
    public static void main(String args[]){
        try{
          File f = new File("ex.txt");
          FileInputStream fin = new FileInputStream(f);
          ObjectInputStream ois = new ObjectInputStream(fin);
          teacher c = (teacher)ois.readObject();
          System.out.println(c);
          System.out.println("done");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
// public Object readObject();
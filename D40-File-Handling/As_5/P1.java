 import java.io.File;
 import java.io.ObjectOutputStream;
 import java.io.FileOutputStream;
public class P1 {
public static void main(String[] args) {
    try{
File f=  new File("ex.txt");
FileOutputStream fo = new FileOutputStream(f);
ObjectOutputStream of = new ObjectOutputStream(fo);
teacher t = new teacher(5,5,"name");
System.out.println("operation is success");

}catch(Exception e){
    System.out.println("handling");
}

}



    
}

package List;
import java.util.ArrayList;
import java.util.ListIterator;

 


class per{
int id ;
public per(int id, String name, int salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
}
@Override
public String toString() {
    return "per [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getSalary() {
    return salary;
}
public void setSalary(int salary) {
    this.salary = salary;
}
String name;
int salary;

}
public class C {
public static void main(String[] args) {
    

ArrayList<per> l = new ArrayList<>();
// l.add("abc");
// l.add("bc");
// l.add("c");
// l.add("bc");
// l.add("ddbc");
// l.add("ebdc");
// l.add("fbcdd");
System.out.println(l);

per v1 = new per(101, "may", 0);
per v2 = new per(102, "var",100);
per v3 = new per(103, "bar", 1000);
per v4 = new per(104, "car", 10000);
per v5 = new per(105, "har", 1000000);

// per v1 =new per(101, "Mayur", 0);



ListIterator<per>   itr = l.listIterator();
 



   
}
}
package List;
import java.util.*;

class person{
int id;
String  name;
double Salary;
public int getId() {
    return id;
}
@Override
public String toString() {
    return "person [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
}
public person(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    Salary = salary;
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
public double getSalary() {
    return Salary;
}
public void setSalary(double salary) {
    Salary = salary;
}


}

public class B {

    public static void main(String[] args) {
        List<person> l = new ArrayList<person>();
        person p1 = new person(101,"M" , 1);
        person p2 = new person(102, "A", 10);
        person p3 = new person(103, "Y", 100);

        for (person p : l) {

            if(p.getSalary()<=10)
            System.out.println(p.getName());
            // System.out.println(l);
            
        }




        
    }

}

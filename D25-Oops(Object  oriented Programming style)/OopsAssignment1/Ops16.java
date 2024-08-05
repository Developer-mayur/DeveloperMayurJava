
// 16) Create a class Person with properties (name and age) with following features.
// Default age of person should be 18.
// A person object can be initialized with name and age.
// Method to display name and age of person.

 
class Person {
    private int age;
    private String name;

     public Person() {
        this.age = 18;
    }

     public Person(int age, String name) {
         this.age = age >= 0 ? age : 18;
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Ops16 {
    public static void main(String[] args) {
         Person person1 = new Person();
        person1.display();

          Person person2 = new Person(3, "Mayur");
        person2.display();
    }
}

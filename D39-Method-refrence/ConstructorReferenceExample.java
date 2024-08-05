class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person{name='" + name + "', age=" + age + ""};
    }
}

@FunctionalInterface
interface PersonFactory {
    Person create(String name, int age);
}

public class ConstructorReferenceExample {

    public static void main(String[] args) {
        // Using a constructor reference
        PersonFactory personFactory = Person::new;

        // Creating a new Person object using the factory
        Person person = personFactory.create("Mayur", 20);

        // Printing the created Person object
        System.out.println(person);
    }
}


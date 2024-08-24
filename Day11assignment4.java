import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Person class
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Day11assignment4 {

    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 20));
        people.add(new Person("Charlie", 30));

        // Sort people by age using lambda expression
        people.sort(Comparator.comparingInt(Person::getAge));

        // Print sorted list
        System.out.println("Sorted people by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

import java.util.*;

public class custom_comparator {

    static class Person {

        String name;
        int salary;

        Person(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Rahul", 30000));
        people.add(new Person("Arun", 50000));
        people.add(new Person("Kiran", 20000));
        people.add(new Person("Vijay", 40000));

        Collections.sort(people, new Comparator<Person>() {

            public int compare(Person p1, Person p2) {
                return p1.salary - p2.salary;
            }
        });

        for (Person p : people) {
            System.out.println(p.name + " - " + p.salary);
        }
    }
}

package practice4;

import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

class ComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Charlie", 35));
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));

        System.out.println("Before sorting:");
        System.out.println(people);

        // Sort using NameComparator
        Collections.sort(people, new NameComparator());
        System.out.println("After sorting by name:");
        System.out.println(people);
    }
}

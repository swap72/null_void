
package OOP;

import java.util.Objects;

import java.util.Objects;

class Employee {
    int id;          // Removed private
    int age;         // Removed private
    String name;     // Added name attribute

    public Employee(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee e = (Employee) o;
        return this.id == e.id &&
               this.age == e.age &&
               Objects.equals(this.name, e.name); // Compare name
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", age=" + age + ", name='" + name + "'}";
    }
    public static void main(String[] args) {
        
    }
}


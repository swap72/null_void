
package FinalMock;
import java.util.Comparator;
public class Employee implements Comparable<Employee> {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    private String name;
    private int id;
    private int salary;

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id + ", salary=" + salary + '}';
    }

    
    public int compareTo(Employee e1) {
        return Integer.compare(this.salary, e1.salary);
    }   

}


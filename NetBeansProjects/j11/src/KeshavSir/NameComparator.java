package KeshavSir;

public class NameComparator implements Comparator <Employee> {
    public int compare(Employee emp1, Employee emp2){
        return emp1.name.CompareTo(emp2.name);
    }
}

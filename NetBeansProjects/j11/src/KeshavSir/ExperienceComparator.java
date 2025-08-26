package KeshavSir;

public class ExperienceComparator implements Comparator<Employee> {
    public int compare(Employee emp1, Employee emp2){
        return emp1.experience.compareTo(emp2.experience);
    }    
}

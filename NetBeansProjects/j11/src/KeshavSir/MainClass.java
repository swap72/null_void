package KeshavSir;

public class MainClass {
    public static void main(String[] args) {
        Employee e1=new Employee(1002, "Ramesh", 25000.00,4.3);
        Employee e1=new Employee(1002, "Suresh", 25000.00,4.3);
        Employee e1=new Employee(1002, "Umesh", 25000.00,4.3);
        Employee e1=new Employee(1002, "Mukesh", 25000.00,4.3);
        Employee e1=new Employee(1002, "Dinesh", 25000.00,4.3);
    
        NameComparator namewise =new NameComparator();
        SalaryComparator salaryWise = new SalaryComparator();
        ExperienceComparator expwise =new ExperienceComparator();
        
        TreeSet<Employee> empset =new TreeSet<Employee>();
        empSet.add(e1);
        empSet.add(e2);
        empSet.add(e3);
        empSet.add(e4);
        
    }    
}

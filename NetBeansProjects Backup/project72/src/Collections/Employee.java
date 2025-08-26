package Collections;

public class Employee<T,E> {
    T id;
    E name;
    double salary;
    
    public Employee(T id,E name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        
    }
    
    public T getId(){
        return id;
    }
    
    public void setId(T id){
        this.id=id;
    }
    
    public E getName(){
        return name;
    }
    
    public void setName(E name){
        this.name=name;
    }
    
    public double getSalary(){
       return salary;
    }
    
    public void setSalary(double sarlary){
        this.salary=salary;
    }
        
}

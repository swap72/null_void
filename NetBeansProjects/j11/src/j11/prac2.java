package j11;

import java.util.ArrayList;
import java.util.regex.*;
public class prac2 {
    public static void main(String[] args) {
       
       ArrayList al=new ArrayList(5);
        
       employee e1=new employee(7,"swapnil",65000);
       employee e2=new employee(5,"ankit",70000);
       employee e3=new employee(2,"abishek",60000);
       employee e4=new employee(3,"karan",40000);
       employee e5=new employee(8,"Mihir",50000);
       
       al.add(e1);al.add(e2);al.add(e3);al.add(e4);al.add(e5);
       
       for(employee d : al){
       }
    }
    
    
    
    
}

class employee{
    int id;
    String name;
    int salary;
    
    employee(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
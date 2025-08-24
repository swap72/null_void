
package Practice6;

public class Student {
String name;
int id;
double d;
boolean b;

    @Override
    public String toString() {
        return "Student Name: "+name+" Student ID: "+id+" Double : "+d+" boolean: "+b;
    }
    
        
    @Override
    public boolean equals(Object s){
        return ((Student)s.id==this.id);
    }
    
    @Override
    public int hashCode() {
        return id; 
    }

    public static void main(String[] args) {
        
        
        
    }
    
}

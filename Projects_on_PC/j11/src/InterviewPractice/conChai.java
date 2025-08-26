package InterviewPractice;

import java.util.ArrayList;

public class conChai {
    public static void main(String[] args) {
        ArrayList<employee> a1=new ArrayList<employee>(4);        
        employee e1=new employee("avi",23,true);
        employee e2=new employee("kavi",23,true);
        employee e3=new employee("ravi",23,true);
        employee e4=new employee("abhi",23,true); 
        
        a1.add(e1);a1.add(e2);a1.add(e3);a1.add(e4);
        
        int count=0;
        for(employee e: a1){
            if(e.name.startsWith("a")){
                count++;
            }
        }
        System.out.println(count);
    }
}

class employee{    
String name;
int age;
boolean isAlive;

    employee(String name, int age, boolean isAlive){
        this.name=name;
        this.age=age;
        this.isAlive=isAlive;
    }  
}

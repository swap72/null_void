package OOP;



public class StaticObjectExample {
    public static void main(String[] args) {        
        student s1=new student();
        s1.sleep();
    }
}

class Human{
    int age=9;
    void sleep(){
        System.out.println("Human needs a good sleep");
        System.out.println(age);
    }
    
}

class student extends Human{
    
}
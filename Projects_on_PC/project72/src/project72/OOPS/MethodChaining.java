package project72.OOPS;

class Person{
    
    String name;
    int age;

    String name(String name){
        this.name=name;
        return name;
    }
    
    int age(int age){
        this.age=age;
        return age;
    }
    void details(){
        System.out.println("Name is "+name+"age is "+age);
    }
}


public class MethodChaining {
    Person p1=new Person();
    p1.name("Ram").age(23).details();
}

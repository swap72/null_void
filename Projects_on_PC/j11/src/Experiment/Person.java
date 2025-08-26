package Experiment;

class phone{
    void ring(){
        System.out.println("Phone is Ringing..");
    }
}

public class Person {
    private phone iphone;
    Person(phone iphone){        
        this.iphone=iphone;
    }
    
    void talk(){
        iphone.ring();
        System.out.println("Person picked up the call..");
    }
    public static void main(String[] args) {
        
        Person p=new Person(new phone());
        p.talk();
    }    
}

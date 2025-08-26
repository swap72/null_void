package Practice2;

public class ConstructorChaining {
    public static void main(String[] args) {
        Animal a1=new Animal();
    }
}

class Animal{
    Animal(){
        this(7);
        System.out.println("Four");
    }
    Animal(int x){
        this("start");
        System.out.println("Three");
    }
    Animal(String x){
        this(7.7);
        System.out.println("Two");
    }
    Animal(Double x){
        //chain terminates here
        System.out.println("One");
    }
}
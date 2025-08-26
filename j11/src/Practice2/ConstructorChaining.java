package Practice2;

public class ConstructorChaining {
    public static void main(String[] args) {
        Animal a1=new Animal();
    }    
}

class Animal{
    Animal(){
        this(4);
        System.out.println("Chain ends");
    }
    Animal(int z){
        this(4.4f);
        System.out.println("goes to float");
    }
    Animal(float x){
        this("hello");
        System.out.println("goes to string");
    }
    Animal(String s){
        System.out.println("chain Starts");
    }
}
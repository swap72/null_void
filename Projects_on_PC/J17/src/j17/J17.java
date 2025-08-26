package j17;

public class J17 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.version"));   
        Animal a1=new Animal();        
    }    
}
class Animal{
    Animal(){        
        this(5);
        System.out.println("Blue");        
    }
        Animal(int x){        
        this("hi");
        System.out.println("Green");        
    }
        Animal(String x){        
        System.out.println("Red");
    }

}

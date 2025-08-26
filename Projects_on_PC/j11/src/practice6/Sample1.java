package practice6;

interface A{
    static void walk(){
        System.out.println("Walking...");
    }
}
interface B{
    static void walk(){
        System.out.println("Walking...");
    }
}

public class Sample1 implements A,B{    
    
    public static void main(String[] args) {
        Sample1 s=new Sample1();
        A.walk();B.walk();
        
        
    }
  
}
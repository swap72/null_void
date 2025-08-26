package project72.OOPS;

public class Practice4 {
    
    public static void main(String[] args) {
        RAM r1=new RAM();  // sub class will implicitly call super class constructor
        System.out.println(r1.intensity); // since object r1 (reference variable) of RAM class has acquired the properties and behaviour of super class Plan_A
        
        // refer https://1drv.ms/o/s!AgSd-KMBC9Vqgm2h7SsROsmeC1cQ
    }
}

class Plan_A{
    int intensity=80/40;
    
    private String key;
    
    Plan_A(){
        System.out.println("Constructor of Plan_A");
    }
    void delta(){
        System.out.println("Delta Strategy");
    }
}

class RAM extends Plan_A{
    void disp(){
        
    }

}

class SHYAM extends Plan_A{
        
}
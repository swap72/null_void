package Blocks;

public class Blocks {
    static {
        System.out.println("First");
    }    
    
    public static void main(String[] args) { 
       
        System.out.println("Hello");

        try{
            System.out.println("two");
        }
        finally{
            System.out.println("Last");
        }
        
 
    }
}

package project72.recursion;

public class recurison {
  
    static int b=5;
    static void method(int a){
      if(b>=1){
            
          if(a>=1){
          System.out.print("* ");
          method(--a);
          method(--b); 
         }
          System.out.println();
      }  
      
    }
    
    public static void main(String[] args) {
        method(5);
    }
    
}

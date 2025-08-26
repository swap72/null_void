
package project72;


public class DigitCount {
    
    static int method3(int a){
        a=a+10;
        while(a<=100){
           method3(a);
        }
        return return a;
        
    }
    
    public static void main(String[] args) {
       int x=method3(10);
        System.out.println(x);
        
    }   
    

}

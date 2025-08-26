package Practice;

public class ExceptionClass {
    public static void main(String[] args) {
        try{
            System.out.println(4/0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("");
        }
        
    }    
}

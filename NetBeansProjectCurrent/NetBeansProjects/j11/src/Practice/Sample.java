package Practice;

public class Sample {
    public static void main(String[] args) {
        try{
            int[] a={2};
            System.out.println(45/0);
            System.out.println(a[4]);
        }
        catch(Throwable e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
    }
}
// above code is example of unreachable catch block
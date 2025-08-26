package practice3;

public class CatchMultiipleExceptions {
    public static void main(String[] args) {
        int a=2,b=0;
        int[] arr={3,1,6,2};
        try{
            System.out.println(a/b);
            System.out.println(arr[4]);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}

public class Program4{
    public static void square(){
        System.out.println("Square method starts");
        int n=5;
        int result =n*n;
        System.out.println("The square of "+n+" is "+result);
        System.out.println("square() method ends");
        }
    public static void main(String[] args) {
        System.out.println("Mein() mehtod Started");
        square();
        System.out.println("main() method ends");
    }
}
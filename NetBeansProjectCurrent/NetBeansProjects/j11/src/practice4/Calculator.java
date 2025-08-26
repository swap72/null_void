package practice4;

public class Calculator {
    
    static int result(int a,int b){
        return a+b;
    }
    static Integer result(Integer a,Integer b){
        return a+b;
    }
   
    public static void main(String[] args) {
        System.out.println(Calculator.result(27, 72));
        System.out.println(Calculator.result(4, 5));
    }
    
}

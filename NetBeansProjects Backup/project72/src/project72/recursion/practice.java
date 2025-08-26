package project72.recursion;

public class practice {
    static int sum=0;
    static void meth(int a){
    sum=sum+meth(a);
    }
    public static void main(String[] args) {
      meth(5);    
    }
    
}

package project7;

public class Sample17{
//    static int a=0;
    static void meth17(int a){
        while(a<=4){         
           meth17(++a);
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        meth17(2);
        
    }
}

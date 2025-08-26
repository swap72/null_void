package javaapplication6;

public class Sample1{
    public static void main(String[] args) {
        int a=2;
        
        int b=Mymeth(a);
        System.out.println(b);
                
    }
    
    public static int Mymeth(int a){
        if (a<=40){
        
        return a* Mymeth(a-10);
    
    }
        return a;
    }
}
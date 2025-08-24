package project72;

public class Practice2 {
    
//    static void meth(int n){
//      if(n>=2){
//          meth(n-1);
//      }
//      System.out.println(n);
//    }
//    
//    public static void main(String[] args) {
//        meth(10);
//    }
    
    static void meth(int n){
        System.out.println("n");
               System.out.println(n);
               meth(--n);
               System.out.println(n);
               
    }
    
    public static void main(String[] args){
        meth(3);
    }
    
    
}

/*

always in recursion :

inside the stack memory -  >

loading takes place first

then execution execution taking place 

*/
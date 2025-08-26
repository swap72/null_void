package Practice7;

import java.util.ArrayList;
import java.util.TreeSet;

public class Sample{
    public static void main(String[] args){
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j<n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }        
}


















//public class Sample {
//    public static void main(String[] args) {
//        try{
//            Asian ob3=(Asian)new Human();
//        }
//        catch(ClassCastException e){
//            System.out.println("Caught "+e);
//        }
//        
//        
//    }
//}
//
//class Human{
//
//}
//
//class Asian extends Human{
//
//}
//

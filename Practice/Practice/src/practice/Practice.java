package practice;

import java.util.Arrays;

public class Practice{
    public static void main(String[] args) {        
        int n=391;
        System.out.println("Before Reverse: "+n);
        StringBuilder sb=new StringBuilder(String.valueOf(n));
        sb.reverse();
        System.out.println("After Reverse: "+sb);
        char[] car=sb.toString().toCharArray();
        Arrays.sort(car);
        String sorted=new String(car);
        System.out.println("Ascending sort: "+sorted);
        StringBuilder bigNum=new StringBuilder(sorted).reverse();
        System.out.println("Reverse Ascending sort: "+bigNum);
    }
}



//public class Practice{    
//    public static void main(String[] args) {
//        
//    }
//}
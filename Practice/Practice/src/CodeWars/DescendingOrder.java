package CodeWars;

import java.util.Arrays;
public class DescendingOrder {  
    public static void main(String[] args) {        
     int x=3251;
     char[] car=String.valueOf(x).toCharArray();
     Arrays.sort(car);
     StringBuilder sb=new StringBuilder(new String(car));        
     sb.reverse();     
     System.out.println(new Integer(sb.toString()));
     
    }
}
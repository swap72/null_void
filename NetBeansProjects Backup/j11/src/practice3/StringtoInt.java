package practice3;

import java.util.Arrays;
public class StringtoInt {
    
    static String rev(String x){
        StringBuilder sb1=new StringBuilder(x);
        return sb1.reverse().toString();
    }

    public static void main(String[] args) {
        String s1="345351";
        
        char[] c1=s1.toCharArray();
        Arrays.sort(c1);
        
        String ns=new String(c1);
        ns=rev(ns);
        System.out.println(ns);
    }
}

package Practice;

import java.util.Arrays;

public class AnagramPracitce {
    public static void main(String[] args) {
    String s1="listen"; String s2="silent";
    char[] car1=s1.toCharArray(); char[] car2=s1.toCharArray();  
    Arrays.sort(car1); Arrays.sort(car1); 
       
        String s3=new String(car1);
        String s4=new String(car1);
        System.out.println(s3.equalsIgnoreCase(s4));
    
    
    }
}

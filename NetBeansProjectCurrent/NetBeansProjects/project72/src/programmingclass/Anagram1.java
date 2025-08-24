package programmingclass;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram1{
    public static void main(String[] args){
       
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       String s1=String.valueOf(n);
       char[] car1=s1.toCharArray();
       Arrays.sort(car1);
       StringBuilder sb1=new StringBuilder(new String(car1));
       System.out.println(sb1.reverse());
       
    }        
}

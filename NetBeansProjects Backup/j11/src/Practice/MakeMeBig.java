package Practice;
import java.util.Arrays;
import java.util.Scanner;
public class MakeMeBig{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        String s=String.valueOf(n);
        char[] car1=new char[s.length()];
        Arrays.sort(s.toCharArray());
        System.out.println(s);
    }
}

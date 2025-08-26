package practice;

import java.util.Scanner;
import java.util.Arrays;
class Main {
    static boolean areAnagrams(String s1,String s2){
        if(s1==null||s2==null||s1.length()!=s2.length()){
            return false;
        }
        char[] car1=s1.toLowerCase().toCharArray();
        char[] car2=s2.toLowerCase().toCharArray();
        Arrays.sort(car1);
        Arrays.sort(car2);
        return Arrays.equals(car1, car2);        
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s1=input.next();
        String s2=input.next();
        System.out.println(areAnagrams(s1,s2));
    }
}

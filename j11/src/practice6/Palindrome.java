package practice6;

import java.util.Scanner;

public class Palindrome {
    static boolean flag=true;
    public static void main(String[] args){                
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your String");
        String s=input.next();       
        String scp=s.toLowerCase();
        
        //menorah approach
        for(int i=0;i<s.length();i++){            
            if(scp.charAt(i)!=scp.charAt(scp.length()-i-1)){
                flag=!flag;
                break;
            }
        }        
        System.out.println(flag? "Palindrome":"Not Palindrome");
        
    }
}

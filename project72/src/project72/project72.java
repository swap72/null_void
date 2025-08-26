
package project72;
import java.util.*;
import java.lang.String;
public class project72{
public static void main(String args[]){
    
    System.out.print("Enter your Integet: ");
    Scanner input=new Scanner(System.in);
    int i=input.nextInt();
    String s=new String();
    s= Integer.toString(i);  
    
    System.out.println(s);
    System.out.println(s.charAt(0));

//hint to Plaindrom solution
//String.valueOf()
//Integer.toString()
//String.format("%d",i);  
    
    
    
    }
}


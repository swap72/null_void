package project72;

import java.util.*;


public class test{
public static void main(String args[]){
    
Scanner input=new Scanner(System.in); 
System.out.println("Enter your integer: ");
int x=input.nextInt();

String s=String.format("%d",x); 


boolean b;

for(int i=0;i<=s.length();i++){
  for(int j=s.length();0<=j-1;j--){
      
b = s.charAt(0)==s.charAt(s.length()-j);

  if(b==true){
  System.out.print("Palindrom");
    }
  else break;
    
  }

}


    
    }
}
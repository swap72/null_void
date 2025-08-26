package javaapplication6;

import java.util.*;
public class project2{
    public static void main(String[] args) {
        
        int[] fibar={}; fibar[0]=0; fibar[1]=1;      
        System.out.print("Fibonacci Series upto : ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        
        
               
    }
    
    static int meth(int[] fibar, int n){
        
        if(fibar[0]==0||fibar[1]==1){
            return n;
        }
        return fibar[n-1]+fibar[n-2];
        
        
    }
    
    
    
}
package project72;

import java.util.*;
public class test1{
public static void main(String args[]){
    
    int fib[]=new int[23];
    
    fib[0]=0 ;fib[1]=1;
    
    for(int i=2;i<=fib.length-1;i++){
    fib[i]=fib[i-1]+fib[i-2];
    
    }
    
    for(int f : fib){
        System.out.println(f+ " ");
}
        
    
    }
 }
    
    
    
    
    
    
    
    
    
    
    
    
   
    
package practice7;

import java.io.*;
class Code{
    public static void main(String[] args) {
        int[] ar={3,5,1,4}; int[] br={6,2,5,2};
        int e=0;
            for(int j:br){
              ar[e]=j;
              e++;              
            }            
        
        for(int i:ar){
            System.out.print(i+" ");
        }
        System.out.println("-----");
        for(int k:br){
            System.out.print(k+" ");
        }
    }
}
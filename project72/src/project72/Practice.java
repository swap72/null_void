package project72;
import java.util.*;
import java.util.Scanner;
class Practice {

    static int[] sol(int[] nums){
        
     return nums;
    }
    public static void main(String[] args) {       
        int[] ar1={1,2,3};
        int[] ar2=new int[ar1.length*2];
        int j=ar1.length;
        
        for (int i = 0; i < ar1.length; i++) {
            ar2[i]=ar1[i];
            ar2[ar1.length+i]=ar1[i];
        }
        
        for(int e:ar2){
            System.out.print(e+" ");
        }
    }    
}


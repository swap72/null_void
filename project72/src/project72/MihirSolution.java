package project72;

import java.io.*;
import java.util.*;

public class MihirSolution {
    public static int addDigit(int n){
        int rem=0,sum=0;
        while (n!=0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int result= addDigit(n);
        while(result>=10){
            result=addDigit(result);
        }
        System.out.println(result);

    }
}
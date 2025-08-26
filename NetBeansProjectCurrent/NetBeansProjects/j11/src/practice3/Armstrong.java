package practice3;

import java.util.Scanner;

import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        int n=407,cpn=n,count=1; int cpA=n;
        int sum=0; int count1=count;
        while(n!=0){
            count++;
            n=n/10;
        }
        
        while(count!=0){
            sum=sum+(int)Math.pow(cpn,count1 );
            count=count/10;
            cpn=cpn/10;
        }
        
        System.out.println(sum);
        System.out.println(sum==cpA ? "Armstrong":"Not Armstrong");
    }
}
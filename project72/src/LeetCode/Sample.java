package Leetcode;
import java.util.*;
public class Sample{
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.print("Array Length: ");
            int n;
            int[] arr=new int[n=input.nextInt()];
            System.out.print("Start feeding elements and hit enter one by one: ");
            for(int a=0;a<=arr.length-1;a++){
                arr[a]=input.nextInt();
            }
            System.out.println("Elements of your array are as follows:");
            for(int z:arr){
                System.out.println(z);
            }
           
            System.out.print("Find Element: ");
            int t=input.nextInt();
            int low=0; int high=arr.length-1; 
            int result = -1;
            while(low<=high){
               int mid=(low+(high-low))/2;
               if (arr[mid] == t) {
                result = mid;
                high = mid - 1; // Move left to find the first occurrence
                } 
               else if (arr[mid] < t) {
                low = mid + 1;
               }
               else {
                high = mid - 1;
               }
            }
             
        if (result != -1) {
            System.out.println("The first occurrence of " + t + " is at index: " + result);
            }
        else {
            System.out.println("Element " + t + " not found in the array.");
            }
            
    }
}

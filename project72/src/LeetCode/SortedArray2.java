package LeetCode;
import java.util.*;
import java.io.*;
public class SortedArray2{
    
    public static int BinarySearch(int[] SoAr,int a){
        
        
        int low=0;int high=SoAr.length-1;int mid=(low+high)/2;
        
        while(low<=high){
            if(a==SoAr[mid]){
                System.out.println("Element found at: "+mid);
                break;
            }
            else if(a<SoAr[mid]){
                high=mid-1;
                mid=(low+high)/2;
            }
            else if(a>SoAr[mid]){
                low=mid+1;
                mid=(low+high)/2;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Total Elements in Array: ");
        int n=input.nextInt();
        System.out.print("\nNow Enter Elements");
        int[] SoAr=new int[n];
        for(int i=0;i<n;i++){
            SoAr[i]=input.nextInt();
        }

        System.out.print("\nFind Element: ");
        int a=input.nextInt();
        
        int result=BinarySearch(SoAr,a);
        if(a==0){
            System.out.print("\nElement Not Found!");
        }
        else{
            System.out.println("Element Found At "+result);
        }
    }
}
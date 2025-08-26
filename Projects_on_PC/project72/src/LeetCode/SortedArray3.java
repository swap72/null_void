package LeetCode;
import java.util.*;
public class SortedArray3{
    public static void main(String[] args) {
        int[] SoAr={1,22,31,46,51,64,77,80,91,100,120};
        Scanner input=new Scanner(System.in);
        System.out.print("Target Element: ");
        int a=input.nextInt();
        int low=0;int high=SoAr.length-1;int mid=(low+high)/2;
        
        try {
            int i=0;
            while(a!=SoAr[i]){
            i++;
            }
        } 
        catch (Exception e) {
            System.out.printf("\nThis Array Does Not Contain %d! ",a);
        }
        
        //Throws exception if element is out of the scope of the Array.
        
        while(low<=high){
            if(a==SoAr[mid]){
                System.out.println("Element found at: "+mid);
                return;
            }
            else if(a<SoAr[mid]){
                high=mid-1;
                mid=(low+high)/2;
            }
            else if(a>SoAr[mid]){
                low=mid+1;
                mid=(low+high)/2;
            }
            else{
                System.out.println(low);
            }
        }
        
        
        
    }
}
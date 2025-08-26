package LeetCode;
import java.util.*;
public class SortedArray{
    
    public int bSearch(){
        
        int[] SoAr={91,83,76,51,47,39,23,19,17,11};
        System.out.print("\nFind Element: ");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int low=0;int high=SoAr.length-1;int mid=low+(high-low)/2;
        while(low<=high){
            if(a==SoAr[mid]){
            System.out.println("Element Found at: "+mid);
            return mid;
            }
            else if(a<mid){
                low=mid+1;
            }
            else if(a>mid){
                high=mid-1;
            }
            else{
                return 404;
            }
        }
        return 1;
        
    }
   public static void main(String[] args) {
        SortedArray obj=new SortedArray();
        int z=obj.bSearch();
        if(z==1){
            System.out.println("Element Not Found!\n");
        }
    }
}
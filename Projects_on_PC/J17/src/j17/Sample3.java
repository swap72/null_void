package j17;

import java.util.LinkedHashSet;
public class Sample3 {    
    public static void main(String[] args) {
        int[] nums={3,5,2,4,6,2,6,9,4,6,0,2,5,43,58};
        int i=0; int count=0; 
        while(nums[nums.length-i-1]!=4){
            ++count;
             i++;
        }
        System.out.println(count);
        int[] ar=new int[count];  
        int j=0;
        while(nums[nums.length-j-1]!=4){
            ar[ar.length-j-1]=nums[nums.length-j-1];
            j++;
        }
        for(int e:ar){
            System.out.print(e+" ");
        }
    }
}

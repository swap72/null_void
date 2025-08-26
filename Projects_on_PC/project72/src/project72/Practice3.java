package project72;
import java.util.ArrayList;
import java.util.HashSet;
public class Practice3 {  
    
        static int[] nums={0,0,1,1,1,2,2,3,3,4};
        static void shifter(int i){
            for (int j = 0; j < 10; j++) {
                nums[j]=nums[j+1];
            }
            
        }

    public static void main(String[] args) {
        
        
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                shifter(i);
            }
        }
        
        
        for(int e:nums){
            System.out.print(e+" ");
        }
    }
}

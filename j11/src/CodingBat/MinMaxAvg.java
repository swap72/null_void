package CodingBat;

public class MinMaxAvg {
    public static void main(String[] numsgs) {
        int[] nums={22,1,5,23,5};
        int sum=0, count=0;
        int max=nums[0]; int min=nums[0];
        
        for (int i = 0; i < nums.length-1; i++) {
            if(max<Math.max(nums[i],nums[i+1])){
                max=Math.max(nums[i],nums[i+1]);
            }
            if(min>Math.min(nums[i],nums[i+1])){
                min=Math.min(nums[i],nums[i+1]);
            }
        }
        
        for(int e:nums){
            sum=sum+e;
            count++;
        }        
        sum=sum-max-min;        
        count=count-2;
        System.out.println(sum);
        System.out.println(sum/count);
    }
}

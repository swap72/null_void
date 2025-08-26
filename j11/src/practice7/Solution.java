package practice7;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
            else if(nums[i]>target && nums[i]-target==1){
                return i;
            }
            else return 0;
        }
        return 0;        
    }
    
    public static void main(String[] args) {
        Solution s=new Solution();
        int res=s.searchInsert(new int[]{1,3,5,6}, 5);
        System.out.println(res);
    }
}
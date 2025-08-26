package programmingclass;

public class Solution {
    static void reverse(int[] arr){
        int l=0, h=arr.length-1;
        while(l<h){
            int tmp=arr[l];
            arr[l]=arr[h];
            arr[h]=tmp;
            l++;h--;
        }
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                
            }
        }
    
        for (int i = 0; i < arr.length; i++) {
            reverse(arr[i]);
        }
    
    
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        
    }    
}

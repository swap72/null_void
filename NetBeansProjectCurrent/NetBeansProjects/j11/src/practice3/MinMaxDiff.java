package practice3;

public class MinMaxDiff {
    public static void main(String[] args) {
        int[] arr={2,5,4,56,22,6,23,45};
        int min=arr[0],max=arr[0];  
        for(int i=0;i<arr.length;i++){
            min=Math.min(min, arr[i]);
            max=Math.max(max, arr[i]);
        }
        System.out.println(max-min);
    }
    
}

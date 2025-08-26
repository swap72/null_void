package CodingBat;

public class MinMax2 {
    public static void main(String[] args) {
        int[] ar={2,5,2,34,32,345,1,43};
        
        int max=ar[0];
        for (int i = 0; i < ar.length-1; i++) {
            if(max<Math.max(ar[i],ar[i+1])){
                max=Math.max(ar[i],ar[i+1]);
            }
        }
        System.out.println(max);
        
    }
}

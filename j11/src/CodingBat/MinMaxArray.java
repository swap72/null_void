package CodingBat;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] ar={2,5,1,46,12,54,12,34,23};
        int max=ar[0]; int min=ar[0]; 
        for (int i = 0; i < ar.length-1; i++) {
            if(max<=Math.max(ar[i],ar[i+1])){
                max=Math.max(ar[i],ar[i+1]);
            }
            if(min>Math.min(ar[i],ar[i+1])){
                min=Math.min(ar[i],ar[i+1]);
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(max-min);
    }
}

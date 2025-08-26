package programmingclass;

public class BubleSort {
    public static void main(String[] args) {
        int[] ar={3,6,1,9,3,4,1}; int tmp=0;
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = 0; j < ar.length-1; j++) {
                if(ar[i]>=ar[j]){
                    tmp=ar[i];
                    ar[i]=ar[j+1];
                    ar[j+1]=tmp;
                }
            }
        }
        for(int e:ar){
            System.out.print(e+" ");
        }
    }
    
}

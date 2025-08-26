package Practice;

public class SelectionSort {
    public static void main(String[] args) {
        int index; int small;
        int[] ar={2,8,7,9,1,3}; 
        for (int i = 0; i < 5; i++) {            
            for (int j = 0; j < 6; j++) {
                if(ar[i]>=ar[j]){
                    int tmp;
                    tmp=ar[j];
                    ar[j]=ar[i];
                    ar[i]=tmp;
                }
            }
        }
        
        for(int e:ar){
            System.out.print(e+" ");
        }
    }
}

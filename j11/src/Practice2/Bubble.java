package Practice2;

public class Bubble {
    public static void main(String[] args) {
        int[] array={26,1,6,9,34,387,5,284,45,39,985,3,554,45};
        
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]<array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
        for (int e : array) {
            System.out.print(e+" ");
        }
    }
}


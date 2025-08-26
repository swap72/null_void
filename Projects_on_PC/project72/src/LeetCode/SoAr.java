package LeetCode;
public class SoAr {
    public static void main(String[] args) {
        int[] Array={2,8,6,10,12,36,4,5,7};
        int temp=0;
        for(int i=0;i<=Array.length-1;i++){
            if(Array[i+1]>Array[i]){
                
            }
            else{
                temp=Array[i];
                Array[i]=Array[i+1];
                Array[i+1]=temp;
            }
        }
        for (int b:Array){
            System.out.print(Array[b]+" ");
        }
    }
}

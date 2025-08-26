package practice3;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1={2,8,11,14};
        int[] arr2={6,9,10,15,16};
        
        int[] tmp=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length || j<arr2.length){
            if(arr1[i]>arr2[j]){
                tmp[k]=arr1[j];
                k++; j++;
            }
            else{
                tmp[k]=tmp[i];
                k++; i++;
            }
        }
    }
}

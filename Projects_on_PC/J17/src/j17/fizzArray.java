package j17;

public class fizzArray {
    static int[] C_shift(int[] ar){        
        int first=ar[0];
        for(int i=0;i<ar.length-1;i++){            
            int tmp=ar[i];
            ar[i]=ar[i+1];
        }        
        ar[ar.length-1]=first;               
        return ar;
    }
    public static void main(String[] args) {                
        int[] ans={3,1,7,5,0,9};
        for(int i=0;i<2;i++){
            fizzArray.C_shift(ans);
        }
        for(int e:ans){
            System.out.print(e+" ");
        }
    }
}

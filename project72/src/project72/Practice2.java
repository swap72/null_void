package project72;

public class Practice2 {
    static int i=0;
    public static void main(String[] args) {
        int[] ar={4,0,3,1,2,5}; int[] ar2=new int[6];
        System.out.println(ar[ar[0]]);
        
        for(int i=0;i<ar2.length;i++){
            ar2[i]=ar[ar[i]];
        }
        for(int x:ar2){
            System.out.print(x+" ");
        }
    }
}

package Practice;
import java.util.Scanner;
public class PatternPractice {
        
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m,n;
        int[][] ar=new int[m=input.nextInt()][n=input.nextInt()];
        
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                
                if(i+j==n-1){
                    sum+=ar[i][j];
                }
            }
            
        }
        
        
        int sum2=0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                
                if(i==j){
                    sum2+=ar[i][j];
                }
            }
            
        }
        
        System.out.println("Primary Diagonal: "+sum2);
        System.out.println("Secondary Diagonal: "+sum);
        
        
        
        
    }
}













//public class PatternPractice {
//    public static void main(String[] args) {
//        for (int i = 90; i >= 87; i--) {
//            for (int j = 90; j >= i; j--) {
//                System.out.print((char)j+" ");
//            }
//            System.out.println();
//        }
//    }
//}

package TrashCan;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
     int tmp;
    Scanner input=new Scanner(System.in);
    int m=input.nextInt(); int n=input.nextInt();
    int[][] ar=new int[m][n];
    
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
               ar[i][j]=input.nextInt();
            }
        }
        
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                tmp=ar[j][i];
                ar[j][i]=ar[i][j];
                ar[j][i]=tmp;
            }
            System.out.println("  ");
        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println("  ");
        }
    
    }    
}












//        for (int i = 0; i < ar.length; i++) {
//            for (int j = 0; j < ar[i].length; j++) {
//                System.out.print(ar[i][j]+" ");
//            }
//            System.out.println("  ");
//        }

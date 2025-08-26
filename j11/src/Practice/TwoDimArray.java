//package Practice;
//import java.util.Scanner;
//public class TwoDimArray {
//    public static void main(String[] args) {
//        int[][] ar = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int n = ar.length;
//
//        System.out.println("Original Matrix:");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(ar[i][j] + "  ");
//            }
//            System.out.println();
//        }
//
//        
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                // Swap ar[i][j] and ar[j][i]
//                int temp = ar[i][j];
//                ar[i][j] = ar[j][i];
//                ar[j][i] = temp;
//            }
//        }
//
//        
//        System.out.println("\nTransposed Matrix (In-Place):");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(ar[i][j] + "  ");
//            }
//            System.out.println();
//        }
//    }
//}

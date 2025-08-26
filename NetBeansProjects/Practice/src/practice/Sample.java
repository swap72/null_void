package practice;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        int n=9;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j<n; j++) {
                if(j<i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

















//ABC081B - Shift only Draft 1
//
//public class Sample{
//    static Scanner input=new Scanner(System.in);
//    static int size=input.nextInt();
//    public static int oddChecker(int[] ar){
//        boolean oddFound=false; int count=0;
//        while(oddFound==false || count<size){
//            for (int i = 0; i < ar.length; i++) {
//                if(ar[i]%2!=0){
//                    oddFound=true;
//                    return count;
//                }
//            }
//            count++;
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        int[] ar=new int[size];
//        for (int i = 0; i < size; i++) {
//            ar[i]=input.nextInt();
//        }
//        System.out.println(oddChecker(ar));
//    }
//}

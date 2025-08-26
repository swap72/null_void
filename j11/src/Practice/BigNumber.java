//package Practice;
//
//import java.util.Arrays;
//import java.util.Scanner;
//public class BigNumber {
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        int n=input.nextInt(),cpn2=n,cpn=n;int count=1; int num=0;
//        while(n/10!=0){
//            count++;
//            n=n/10;
//        }
//        int[] ar=new int[count];
//        for (int i = 0; i < ar.length; i++) {
//            ar[i]=cpn%10; cpn=cpn/10;
//        }
//        int tmp;
//        for (int i = 0; i < ar.length; i++) {
//            for (int j = 0; j < ar.length; j++) {
//                if(ar[i]>=ar[j]){
//                    tmp=ar[i];
//                    ar[i]=ar[j];
//                    ar[j]=tmp;
//                }
//            }
//        }
//        int sum=0;
//        String sr="";
//        for(int e:ar){
//            sr=sr+e;
//        }
//     
//        System.out.println(Integer.parseInt(sr));
//        
//    }    
//}

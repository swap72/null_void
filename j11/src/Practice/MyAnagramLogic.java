//package Practice;
//
//import java.util.Arrays;
//
//public class MyAnagramLogic {
//    public static void main(String[] args) {
//        String s="silent"; int[] ar=new int[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            ar[i]=(int)s.charAt(i);
//        }
//        
//        String s2="";
//        int tmp;
//        for (int i = 0; i < ar.length; i++) {                        
//            for (int j = 0; j < ar.length; j++) {
//                if(ar[i]>ar[j]){
//                    tmp=ar[i];
//                    ar[i]=ar[j];
//                    ar[j]=tmp;
//                }
//            }
//        }
//
//        String t="listen"; int[] ar2=new int[t.length()];
//        for (int i = 0; i < t.length(); i++) {
//            ar2[i]=(int)t.charAt(i);
//        }
//        
//        String t2="";
//        int tmp2;
//        for (int i = 0; i < ar2.length; i++) {                        
//            for (int j = 0; j < ar2.length; j++) {
//                if(ar2[i]>ar2[j]){
//                    tmp2=ar2[i];
//                    ar2[i]=ar2[j];
//                    ar2[j]=tmp2;
//                }
//            }
//        }
//
//        for(int b:ar2){
//            System.out.print(b+" ");
//        }
//        System.out.println("\n========");
//        for(int c:ar){
//            System.out.print(c+" ");
//        }
//        
//        
//        System.out.println(Arrays.equals(ar, ar2) ? "\nAnagram":"\nNot Anagram");
//        
//    }
//}

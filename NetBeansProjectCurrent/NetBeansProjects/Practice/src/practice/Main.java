package practice;


public class Main {
    static int add(int a){
     int sum=0;
     if(a>=1){
      sum=sum+add(a);
     }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(5));
    }
}



//class Main{
//    static int SumNatural(int x){
//        int sum=1;
//        if(x==1){
//            return 1;
//        }
//        else if(x==2){
//            return 3;
//        }
//        return sum=sum+SumNatural(x-1)+SumNatural(x-2);
//    }
//    public static void main(String[] args) {
//        System.out.println(SumNatural(5));
//    }
//}
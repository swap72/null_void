package project72;
import java.util.Scanner;
class NthFib{  
    static int method2(int n){
        int sum=0;
        while(n%10!=n){
            sum=sum+n%10;
            n=n/10;
        }
//        System.out.println(n);
        sum=sum+n;
        return sum;
    }
    
    public static void main(String[] args) { 
        Scanner input=new Scanner(System.in);
         int n=input.nextInt();
         int sum2=method2(n);
         
          while(sum2>=10){
              method2(sum2);
          }
          if(sum2<=10){
              System.out.println(sum2);
          }
    }
}

package project72;

public class SumofDigits {
    public static void main(String[] args) {
        int n=9005; int count=1; int p=0;int res; int on=n;
        while(n/10!=0){
            count++;
            n=n/10;
        }
        if(count%2==0){
             res=(on/(int)Math.pow(10, count/2)) + (on%(int)Math.pow(10, count/2));
             System.out.println(res);
        }
        else{
            System.out.println("Odd Digit Nubmer Not Allowed!");
        }
        
    }
}

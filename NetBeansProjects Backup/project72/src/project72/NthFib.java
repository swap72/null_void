
package project72;

public class NthFib {
    public static void main(String[] args) {
        int n=12; int n1=0; int n2=1; int sum=0;
        for(int i=0;i<=n;i++){
            if(i==n){
                System.out.println(n+"th Fibonacci Number is "+ n1);
            } 
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }
        
    }
}


package project72;


public class Test7 {
    
    static int method3(int n){
        int sum=0;
        while(n%10!=n){
        
            sum=sum+(n%10);
            n=n/10;
        }
        sum=sum+n;
        
        while(sum>=10){
           return method3(sum);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int m=method3(1236417111);
        System.out.println(m);
    }
}
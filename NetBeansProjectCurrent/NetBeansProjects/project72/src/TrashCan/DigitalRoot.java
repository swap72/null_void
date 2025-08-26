package TrashCan;


public class DigitalRoot {
    
    static int method3(int n){
        int sum=0;
        while(n/10!=n){
            sum=sum+(n%10);
            n=n/10;
        }
        
        while(sum>10){
           sum=method3(sum);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int m=method3(234516);
        System.out.println(m);
    }
}
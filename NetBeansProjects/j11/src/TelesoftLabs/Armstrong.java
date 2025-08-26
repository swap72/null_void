package TelesoftLabs;

public class Armstrong {
    
    public static void main(String[] args) {
        int n=153; int cpn=153; int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }    
}

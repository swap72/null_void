package practice3;

public class Strong {
    static int fact(int a){
        if(a==0||a==1){
            return 1;
        }
        else{
            return a*fact(--a);
        }
    }
    public static void main(String[] args) {
        int n=40585,cpn=n;
        int sum=0;
        while(n!=0){
            sum=sum+fact(n%10);
            n=n/10;
            
        }
        System.out.println(sum);
        System.out.println(cpn==sum ? "Strong":"Not Strong");
    }
}

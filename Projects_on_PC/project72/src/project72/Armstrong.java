
package project72;


public class Armstrong {
    public static void main(String[] args) {
        
        int n=407; int sum=0; int cp=n,g=n; int count=1;
        while(cp/10!=0){
            cp=cp/10;count++;
        }
        
       
        while(n!=0){
            int power=1;
            for(int i=1;i<=count;i++){
                int digit=n%10;
                power=power*digit;
            }
            sum=sum+power;
            n=n/10;
        }
        System.out.println(sum);
        System.out.println(sum==g ?"Armstrong":"Not Armstrong");

    }
}

package Practice;
// Digital Root of a number
public class DigitalRoot {
    static int sum; 
    static int DigRoot(int a){
        int cpa=a;
        while(cpa%10!=0){
           sum=sum+cpa%10;
           cpa=cpa/10;
        }
        while(sum<10){
           DigRoot(sum);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(DigitalRoot.DigRoot(9485));
    }    
}
/*
93845

5+4+8+3+9
0=0+9
9=+


29

2+9

11

1+1

*/

package project72;

class sample3{
    public static void main(String[] args) {
        int n1=0; int n2=1; int sum=0;
        for(int i=1;n1<=13;i++){
            if(n1>=5){
            System.out.println(n1);
            }
            
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }

    }
}

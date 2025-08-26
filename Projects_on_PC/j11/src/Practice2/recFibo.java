package Practice2;

public class recFibo {
    static int fib(int a){
	 if(a==0){
	   return 0;
	  }
	 else if(a==1){
	   return 1;
	 }
	else{
	   return fib(a-1)+fib(a-2);
	 }
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(fib(i)+" ");
        }        
    }
}

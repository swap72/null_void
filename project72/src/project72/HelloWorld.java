
package project72;

//class HelloWorld{
//   public static void main(String[] args){
//    int n=153; int cp1=n,cp2=n; int count=1; int sum=0;
//    while(cp1/10!=0){
//	count++;
//	cp1=cp1/10;
//	}
//    System.out.println(count);
//
//    while(n!=0){
//	 int power=1;
//	for(int i=1;i<=count;i++){
//            int digit=n%10;
//            power=power*digit;
//	}
//	sum=sum+power;
//	n=n/10;
//    }
//
//
//	System.out.println(sum);
//        System.out.println(sum==cp2 ? "Armstrong":"Not Armstrong");
//  }
//}
        


class HelloWorld{
public static void main(String[] args){
	int n=9474,cp1=n,cp2=n; int sum=0; int count=1;
	while(cp1/10!=0){
	count++; cp1=cp1/10;
	}
	
	System.out.println(count);

	while(n!=0){

	int digit=n%10; int power=1;
	for(int i=1;i<=count;i++){
	power=power*digit;
	
	}
	sum=sum+power;
	n=n/10;
	}

	System.out.println(sum);
	System.out.println(sum==cp2 ?"Armstrong Number":"Not A");

   }

}
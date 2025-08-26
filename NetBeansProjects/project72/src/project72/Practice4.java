package project72;

public class Practice4 {
    
    void multiply(int...args){
      int result=1;
      for(int e:args){
          result*=e;
      }
        System.out.println(result);
    }
//    
//    void test(long arg){
//         System.out.println("Value: "+arg);
//        }
//        
    public static void main(String[] args) {
        
        // Up casting or data type widening
        
//        int a=10;
//        double b=a;// widening : int ------> double
//        System.out.println(b);
//        
//        char c='a';
//        int d=c; // widening : char ------> int
//        System.out.println(d);
//        
//        long e=+1234512345L;
//        double f=e; // widening : long ------> float
//        System.out.println(f);
//        
//        // Casting though method
//     Practice4 d1=new Practice4();
//     d1.test(1234512345L);
//     d1.test(420);
//     d1.test('A');


// down casting or data type narrowing
//     float val=4.f;
//     int num=(int)val; // Narrowing from float data type to int data type lossy conversion, here the data loss will take place
//        System.out.println(num);
//     double a=2.5;
//     int b=(int)a;
//        System.out.println(b);
//   

       Practice4 p1=new Practice4();
       p1.multiply(2,3,4,1);
     

    }
}

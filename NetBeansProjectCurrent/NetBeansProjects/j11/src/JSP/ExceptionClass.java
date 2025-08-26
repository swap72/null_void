package JSP;

/*
CharacterStics : 

Catch block will execute only if there is risky code in the try block

Multiple risky code within same try block :

even if we have multiple risky code inside the try block, at a time we can catch and hold only one exception 

Even when we have multiple risky code within the same try block at a time we can expect only one exception occuring and that will be the first occured risky code 

when we have multiple risky code within the same try block in order to handle multiple risky coe
we go for nested try catch
wherein it is possible to write try and catch block inside the try and the catch block indivisually
also known as nested try-catch 
*/

// we can also use fully qulified exception name : java.lang.ArithmeticException

// Simple Try Catch :
//public class ExceptionClass {
//    public static void main(String[] args) {
//        try{
//            int x=4, y=0;
//            System.out.println(x/0);
//            int[] ar ={};
//            System.out.println(ar[7]);
//        }
//        catch(ArithmeticException e){
//            System.out.println(e);
//        }
//    }
//    
//}

 // Nested Try Catch Block

//public class ExceptionClass {
//    public static void main(String[] args) {
//        try{
//            try{
//                System.out.println("From Nested Try Catch");
//                int[] ar ={};
//                System.out.println(ar[7]);
//            }
//            catch(ArrayIndexOutOfBoundsException e){
//                System.out.println(e);
//            }
//            
//            int x=4, y=0;
//            System.out.println(x/0);
//        }
//        catch(ArithmeticException e){
//            System.out.println(e);
//        }
//    }
//}

/*
It is possible to write try block with multiple catch blocks
when we write multiple catch block we are trying to handle
multiple different exceptions wichever occurs first
*/

/* Try Block with multiple catch block
so that whichever occures first we can catch and display 
it or say handle it
*/

//
/*
Throwable class will act as the supermost class in the exveption hierarchy
In java all the exceptions are available in the form of class hence exception can be both 
pre-defined and user defined
therefore catch block with throable type can handle all the exceptions
i.e pre-defined and user defined

This will also act as a generalized catch block
*/
public class ExceptionClass {
    public static void main(String[] args) {
        try{
            System.out.println(100/0);
            int a[]= {};
            System.out.println(a[2]);
        }
        catch(Throwable e){
            System.out.println(e);
        }
        
        
    }
}





































// =+ (dead key)
package project72;


   class mynewclass {
    static void mymeth(){
        myclass1 obj=new myclass1();
        obj.write();
    // from this class or from the method of this class we are instantiating another class
        }
    }
public class test2{
public static void main(String args[]){
    
    mynewclass.mymeth();
        
    }
}


        class myclass1{
        void write(){
        System.out.println("Wrtie method executed!");
//        return write();
        }
    }


//Here a class is being instantiated from another class, 
//technically a class is being instantiated from inside a method of another class
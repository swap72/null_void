//package TrashCan;
//
//public class Sample {
//    public static void main(String[] args) {
//        Test t1=new Test();
//        t1.method1();
//        System.out.println("3rd :"+t1.d);
//        System.out.println(t1.d.getClass());        
//    }
//}
//
///*
//d is an instance variable:
//
//Inside the Test class, 
//d is an instance variable (also called a field) of type Test. 
//This means d can hold a reference to an object of type Test
//
//
//Data Type: The type of d is Test, 
//meaning it can hold a reference to another object of type Test.
//
//
//1. Can only d hold a reference to an object of type Test? If yes, why?
//
//Yes, only d (and other variables with the same data type) can hold a reference to an object of type Test. 
//This is because d is declared as:
//
//Test d;
//
//
//The data type of d is Test, which is a non-primitive (reference) type. 
//It means that d can hold the memory address 
//(or reference) of any object that is an instance of the Test class.
//
//
//2. Can't x hold a reference to an object of type Test? If no, why not?
//No, x cannot hold a reference to an object of type Test because x is declared as: int x;
//
//x is of type int, which is a primitive type in Java. Primitive types (int, double, boolean, etc.) 
//store actual values, not references to objects. 
//This means x can only store an integer value like 10, 0, or -5.
//
//
//3. Is the answer to my first two questions related to the data type of these variables?
//Yes, the answer to your first two questions is entirely related to the data types of the variables.
//
//d has a reference type (Test), which allows it to hold the memory address (or reference) of an object created from the Test class.
//x has a primitive type (int), which only allows it to hold an actual value like an integer, not an object reference.
//
//
//Summary:
//
//d can hold a reference to an object of type Test because d is of type Test, which is a reference type.
//
//x cannot hold a reference to an object of type Test because x is of type int, which is a primitive type, and primitive types store values, not object references.
//
//The ability to hold references or values is determined by the data type of the variable.
//
//
//
//Reference types (like Test) can hold references to objects of that class.
//
//Primitive types (like int) can only hold actual values, not references to objects.
//
//
//*/
//
//
//class Test{
//Test d;
//int x;
//void method1(){
//        System.out.println("1st: "+d);
//        System.out.println("2nd: "+this);                
//    }    
//}
//

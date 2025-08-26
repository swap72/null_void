//package TrashCan;
//
///*
//This keyword: 
//
//This keyword is current calling object reference, 
//since the reference variable of the object is declared and initialized from inside the main method, 
//it's scope remains upto that method or say it's scope is limited to that particular main method only 
//and if we want to use this object reference variable outside the main method 
//we use this keyword (This keyword acts as current object reference variable), 
//This keyword is basically current object calling reference
//
//This is a very powerful keyword, there are many uses of this kwyrod 6 of them are:
//
//this refers to the current instance of the class. 
//this can be used to resolve variable shadowing when method parameters have the same names as instance variables. 
//You can use this() to call another constructor from within a constructor (constructor chaining). 
//this can be used to pass the current object as an argument to another method or constructor. 
//this can return the current object from a method, allowing method chaining. 
//this cannot be used in static methods or static blocks. 
//
//(for more on this keyword refer my E Notes of Java in OneNotes synced in Cloud)
//
//*/
//
//public class Sample2 {
//    public static void main(String[] args) {
//        Test t1=new Test();
//        t1.method1();
//        System.out.println("3rd :"+t1.d);
//        System.out.println(t1.d.getClass());        
//    }
//}
//
///*
//example of recursive method call without base case condition (infinite recursion) 
//using this keyword
//*/
//class Test{
//Test d;
//void method1(){
//        System.out.println("1st: "+d);
//        System.out.println("2nd: "+this);     
//        this.method1();        // recursive call without base case condition;
//    }    
//}
//
//
///*
//class Test{
//Test d=this;
//void method1(){
//        System.out.println("1st: "+d);
//        System.out.println("2nd: "+this);     
//        d.method1();        // recursive call without base case condition;
//    }    
//}
//
////above Test class code is same as this code
//
//*/

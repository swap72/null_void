//package TrashCan;
//
//public class Sample5 {
//    
//    public static void main(String[] args) {                
//        A z1=new A();
//        System.out.println(z1);
//        z1.meth1();
//        System.out.println(z1.d2+" Alpha");
//    }
//}
//
//class A{
// A d2;
// String s;
// Object o;
//    void meth1(){
//        System.out.println(d2 +" Alpha");
//        System.out.println(s);
//        System.out.println(o +" Beta");
//        System.out.println(this.o+" Beta");
////      System.out.println(null); 
//        /*        
//        this is why compiler gets ambiguous, it does not know which null is what
//        hence compiler goes into the state of ambiguity and throws NPE
//        */ 
//        
//        /*
//        When you try to run System.out.println(null); 
//        in Java, it throws a compilation error 
//        because the Java compiler is confused 
//        about which overloaded version of println() to call.
//        
//        Why the Error Happens:
//        The println() method is overloaded to handle different types of arguments 
//        (e.g., String, int, Object, etc.). Here are some common overloads:
//        
//        println(String s)
//        println(Object o)
//        println(char[] chars)
//        
//        When you pass null to System.out.println(null);, 
//        the compiler doesn't know whether you're trying to call:
//        
//        println(String s) with a null string, or
//        println(Object o) with a null object.
//        
//        Since null can be a valid value for both String and Object, 
//        the compiler cannot resolve the ambiguity and throws an error like:
//        
//        How to Fix It:
//        You can resolve this ambiguity by explicitly casting null to the type you intend to pass, 
//        like this:
//
//        Passing null as a String:
//        
//        System.out.println((String) null);  // This works fine
//        
//        Passing null as an Object:
//        
//        System.out.println((Object) null);  // This works fine too
//
//        Both will print null to the console without any errors, 
//        but the casting removes the ambiguity for the compiler.
//        
//        Summary:
//        The error happens 
//        because the compiler can't decide whether null is meant to be a String or an Object, 
//        and you need to explicitly cast null to clarify your intent.
//        
//        refer to ResolveNull.java program in this same package
//        
//        */
//    }
//}
//

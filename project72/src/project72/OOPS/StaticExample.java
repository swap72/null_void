package project72.OOPS;

public class StaticExample {
    static int x=10;
    void info(){
        System.out.println(this.x); // at this point in time object was not created hence we are using this keyword as refference purpose, here this means cuurent class memory address
        System.out.println(StaticExample.x); // one static variable will be shared in the entire class no new memory address will be allocated
        ++StaticExample.x;
        ++x; /* we can directly increment this variable x right here within this class because it's scope limited within this class only , but this same thing is not possible from outside this class */
    }
}

class MainClass{
    public static void main(String[] args) {
        StaticExample o1=new StaticExample();
        System.out.println(StaticExample.x++);
        System.out.println(o1.x);
        System.out.println(o1.x);
        o1.info();                        
        System.out.println(StaticExample.x++);
        System.out.println(StaticExample.x);
        
        // ++x; not possible because of x is outisde it's scope 
    }
}

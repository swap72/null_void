package project72.OOPS;

public class Code3 {

    public static void main(String[] args) {
        Demo d1=new Demo();
        System.out.println();
        System.out.println();
        d1.disp();
        // This keyword is current calling object reference, since the refference variable of the object declared and initialized from inside the main method it's scope remains upto that method or it's scope is limited to that particular main method only if we want to use this object reference variable outside the main method we use this keyword, (This keyword acts as a current calling object reference)//
        
    }
    
}

class Demo{
    int x=10; int y=20;
    Demo d2=this;
    void disp(){
        Demo d3=this;
        System.out.println(this);
        System.out.println(d2);
        System.out.println(d3);
        
    }
}

/*
In Java, the this keyword is a reference variable that refers to the current object of the class. 
It is primarily used within an instance method or a constructor to refer to the object on which the method or constructor was invoked.
*/
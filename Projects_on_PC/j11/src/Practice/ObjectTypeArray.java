package Practice;

public class ObjectTypeArray {
    static int x=10;  //static variable
    int  y=2;    //instance variable
    public static void main(String[] args) {
        int x=11; //local variable
        ObjectTypeArray ob1=new ObjectTypeArray();
        System.out.println(ob1.x); /*or*/ System.out.println(ObjectTypeArray.x); //static variables can be access via object or by classname since they are also class memebers
        System.out.println(x);
        System.out.println(ob1.x);
    }
}



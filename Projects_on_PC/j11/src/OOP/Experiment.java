package OOP;

public class Experiment {
    public static void climb(){
        System.out.println("Climbing");
    }
    public static void main(String[] args) {
        System.out.println("Main method");
    }
    
    public void climb(){
        System.out.println("Instance method");
    }
}




class MyClass {
    // Static method
    static void display() {
        System.out.println("This is the static display method.");
    }

    // Instance method
    void display() {
        System.out.println("This is the instance display method.");
    }

    public static void main(String[] args) {
        // Call the static method using the class name
        MyClass.display();

        // Call the instance method using an object
        MyClass obj = new MyClass();
        obj.display();
    }
}








//class Service_A{
//    void task1(){
//        System.out.println("Performing task1...");
//    }
//}
//
//class Service_B extends Service_A{
//    void task1(int b){
//        System.out.println("Performing another task...");
//    }
//}

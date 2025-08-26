package Project7;

interface Design1{
    void method1();
}

//class sampleclass implements Design1{
//    public void method1(){
//        System.out.println("Hello");
//    }
//}

public class AnonInnerClass {
    public static void main(String[] args) {
        Design1 nd=()->System.out.println("Om namah Shivaay!");
        nd.method1();
    }
}

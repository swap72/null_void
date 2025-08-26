package Experiment;

class Test {
    void method(int a, double b) {
        System.out.println("int, double method");
    }

    void method(double a, int b) {
        System.out.println("double, int method");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.method(5, 5); // Which method is called?
    }
}

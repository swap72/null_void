package project72.OOPS;

public class Sample {
    public static void main(String[] args) {
        car c1=new car();
        c1.run().runfast();
    }
}

class car{
    int run(){
        System.out.println("Running");
        return 0;
    }
    int runfas(){
        System.out.println("Running Fast!");
        return 1;
    }
}
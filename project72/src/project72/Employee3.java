package project72;

public class Employee3 {
    final static String prefix="TCS";
    static int num=11;
    String eID=prefix+num++;;    
}

class Main {
    public static void main(String[] args) {
        Employee3 e1=new Employee3();
        Employee3 e2=new Employee3();
        System.out.println(e1.eID);
        System.out.println(e2.eID);
    }
}

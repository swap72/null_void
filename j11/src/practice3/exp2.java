package practice3;

public class exp2 {
    public static void main(String[] args) {
        Asian a1=(Asian)new Human();
        System.out.println(a1.age);
    }
}

class Human{
    int age=34;
}

class Asian extends Human{
    
}
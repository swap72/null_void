package Practice2;

public class Exp {
    public static void main(String[] args) {
        LivingBeing lb= new LivingBeing();
        Human h1= new Human();
        lb=h1;
        System.out.println(lb==h1);

    }
}

class LivingBeing{
    
}

class Human extends LivingBeing{
}

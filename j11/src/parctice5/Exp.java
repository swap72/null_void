package parctice5;

public class Exp{

    public static void main(String[] args) {        
        goodboy bb=new boy();
        bb.dance();bb.sing();bb.fly();       
    }
}


class goodboy{
    public void sing(){
        System.out.println("Singing");
    }
    public void dance(){
        System.out.println("dancing");
    }
    
    public void fly(){
        System.out.println("Flying");
    }
}

class boy extends goodboy{
    public void sing(){
        System.out.println("Singing");
    }
    public void dance(){
        System.out.println("dancing");
    }
    public void think(){
        System.out.println("Thinking");
    }
}
package project7;

public class exp{
    
    public static void main(String[] args) {
        exp3.shout();
        exp2 behenji;
        
    }
}

class exp2 {
    static void shout(){
        System.out.println("AHhhhhhhhhhhhhhh!");
    }
}

class exp3 extends exp2{
    static void shout(){
        System.out.println("Bol bhai! method overriden from class exp3");
    }
}


       
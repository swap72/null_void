package jsp.test.project72;

public class SimCard {
    String operator;
    int number;
    int year;
    
    SimCard(String o,int n,int y){
        operator=o; number=n; year=y;
    }
    void details(){
        System.out.println("Sim Operator: "+operator);
        System.out.println("Sim Year: "+year);
        System.out.println("Sim Number: "+number);
    }
}
class main{
public static void main(String args[]){
     SimCard jio =new SimCard("Jio",6300958,2024);
     jio.details();
    }
}
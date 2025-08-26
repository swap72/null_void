package j17;

enum Constants{
Pi, Phi, Li
}

public class SwitchExample {
    public static void main(String[] args) {
        int day=4;
        Constants t=Constants.Li;
        switch(t){
            case Li : System.out.println("Monday");
            break;            
            case Pi: System.out.println("Tuesday");
            break;            
            case Phi: System.out.println("Wednesday");
            break;
            default: System.out.println("Default");           
        }
    }
}

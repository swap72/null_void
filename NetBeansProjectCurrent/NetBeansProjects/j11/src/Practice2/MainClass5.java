package Practice2;

public class MainClass5 {
    public static void main(String[] args) {
        System.out.println("main method started");
        NumberGenerator ng1= new NumberGenerator(1,25);
        NumberGenerator ng2= new NumberGenerator(101,125);
        
        NumberGenerator Thread ngt1= new NumberGeneratorThread(ng1);
        NumberGenerator Thread ngt1= new NumberGeneratorThread(ng1);
        ngt1.start();
        ngt2.start();
        
        System.out.println("Main ends");   
        
    }    
}

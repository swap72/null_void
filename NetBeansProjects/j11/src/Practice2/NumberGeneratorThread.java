package Practice2;

public class NumberGeneratorThread extends Thread{
    private NumberGenerator ng;
    
    public NumberGeneratorThread(NumberGenerator ng){
        this.ng=ng;
    }
    
    public void run(){
        ng.generate();
    }
}

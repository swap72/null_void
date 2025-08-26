package Practice.ObjectOrientedParadigm;

class dog implements Runnable{
    @Override
    public void run(){
        System.out.println("Winning!");
    }
}

public class Sample4{
    public static void main(String[] args) {
        dog d=new dog();
        
    }
    
}

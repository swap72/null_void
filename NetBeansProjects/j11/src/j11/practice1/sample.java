package j11.practice1;


public class sample {    
    public static void main(String[] args) {
        try{
            throw new myException();
        }
        catch(myException e){
            System.out.println("Caught "+e);
        }
    }
}

class myException extends Exception{
    
}
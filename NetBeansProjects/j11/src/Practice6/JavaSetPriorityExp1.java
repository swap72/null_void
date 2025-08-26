package Practice6;

public class JavaSetPriorityExp1 extends Thread  
{    
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
        System.out.println("Thread Name: "+Thread.currentThread().getName());
    }   
    public static void main(String args[])  
    {    
        JavaSetPriorityExp1 t1=new JavaSetPriorityExp1();    
        t1.setPriority(1);   
        t1.setName("Joker");
        t1.start();    
    }    
}
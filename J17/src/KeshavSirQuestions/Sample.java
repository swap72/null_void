package KeshavSirQuestions;

package practice6;

class Task1 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(0);
        }
    }
}
class Task2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(1);
        }
    }
}
public class Sample{
	public static void main(String[] args){
            Task1 t1=new Task1();
            Task2 t2=new Task2();
            t1.start();
            
            try{
                t1.wait(1000);
            }
            catch(InterruptedException e){
                System.out.println("Waiting for Task1, Reason: "+e);
            }
            t2.start();
	}
}



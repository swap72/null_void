package practice6;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();
        AddThread at=new AddThread(pq,0,5);
        Thread t=new Thread(at);
        t.start();
        
    }
}

class AddThread implements Runnable{
    private PriorityQueue pq;
    private int start;
    private int end;

    AddThread(PriorityQueue pq, int start, int end) {
        this.pq = pq;
        this.start = start;
        this.end = end;
    }
    
    @Override
    public void run(){
        for (int i = start; i < end; i++) {
            pq.add(i);
            System.out.println("added "+i);
        }
    }
}
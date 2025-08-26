
package FinalMock;
import java.util.Collections;
import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args) {
        
        PriorityQueue<Employee> pq=new PriorityQueue<Employee>();
        
        pq.add(new Employee("Swapnil",17,20000));
        pq.add(new Employee("Ramesh",17,20000));
        pq.add(new Employee("Suresh",17,20000));
        
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        
    }
}

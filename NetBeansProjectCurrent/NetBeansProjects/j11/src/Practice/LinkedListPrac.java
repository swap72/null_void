package Practice;
import java.util.LinkedList;
import java.util.ArrayDeque;
public class LinkedListPrac {
    public static void main(String[] args) {
        LinkedList<Integer> numList=new LinkedList<Integer>();
        ArrayDeque<Integer> numList2=new ArrayDeque<Integer>();
        
        numList.add(12);
        numList.add(22);
        numList.add(52);
        numList.add(62);
        numList.add(72);
        
        numList.addFirst(0);
        numList.addLast(99);
        System.out.println(numList.poll());
        
        
        System.out.println(numList);
        
    }
}

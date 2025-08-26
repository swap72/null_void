package LearningCollectionsFramework;
import java.util.*;
public class MainClass1 {
    public static void main(String[] args) {
        System.out.println("Main starts");
        
        ArrayList l1=new ArrayList();        
        
        /*
        this object internally has an array of object type
        will have default capacity 10
        the arrayList object is initially empty
        */ 
        
        l1.isEmpty(); // return type boolean
        l1.size(); // returns the element count
        l1.add(100); // internally the 100 will be conveted to integer wrapper class
        // (autoboxing)
        System.out.println(l1.size());
        ArrayList l2=new ArrayList(100);
        l2.add(17);
    }
}

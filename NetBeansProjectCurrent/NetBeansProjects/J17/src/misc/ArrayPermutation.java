package misc;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import java.util.*;
public class ArrayPermutation {
    public static void main(String[] args) {
        Set<Integer> lhs = new LinkedHashSet<Integer>(10);
        lhs.add(1);
        lhs.add(2);
        
        System.out.println(lhs);
        List lh=new ArrayList(lhs);
        Collections.shuffle(lh);
        System.out.println(lh);
        
        
    }
}


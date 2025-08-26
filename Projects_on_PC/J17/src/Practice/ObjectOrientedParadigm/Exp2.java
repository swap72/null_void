package Practice.ObjectOrientedParadigm;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.*;
public class Exp2 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("keshav");
        al.add("bhrigu");
        al.add("bhairav");
        
        for(Object e:al){
            System.out.println(e.toString().toUpperCase()+" "+e.toString().length());
        }
        
    }
}

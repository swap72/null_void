package Practice2;
import java.util.ArrayList;
public class Practice {
    public static void main(String[] args) {

        String s="";
        ArrayList al=new ArrayList();
        al.add(2);
        al.add(2);
        al.add("WonderWoman");
        al.add(2);
        al.add("Flash");
        al.add("BatMan");
        al.add(true);
        al.add(3.4);
        al.add("TheMask");
        
        for(Object e:al){
            if(e instanceof String){
                s=s+e;
            }
        }
        
        System.out.println(s);
    }
}

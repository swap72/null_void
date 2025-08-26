package j11;

import java.util.ArrayList;
public class Prac {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(true);
        al.add('d');
        al.add("d");
        al.add(5);
        al.add(4.5);
        al.add(7);
        int count=0;
        for(Object e:al){
            if( e instanceof Integer){
                count++;
            }
        }
        System.out.println(count);
                
    }
}

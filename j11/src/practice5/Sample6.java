/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice5;

/**
 *
 * @author swapn
 */
import java.util.ArrayList;
public class Sample6 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("hi");
        al.add(7);
        al.add(false);
        al.add(3.14);
        al.add('c');
        al.add("hello");
        for(Object e:al){
            if(e instanceof String){
                System.out.println(((String)e).toString().length()+" "+((String)e).toString().toUpperCase());
            }
        }
    }
}

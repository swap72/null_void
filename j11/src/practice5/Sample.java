/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice5;

/**
 *
 * @author swapn
 */

import java.util.Map;
import java.util.TreeMap;
public class Sample {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
        tm.put(4, "ramesh");
        tm.put(2, "suresh");
        tm.put(14, "jagesh");
  
        for (Map.Entry<Integer, String> entry : tm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    
        }   
    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Hashtable;
import java.util.Map;
        

import java.util.TreeMap;

public class Exp{
	public static void main(String[] args){
                Hashtable ht=new Hashtable();
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(99, "Ashwin");
		tm.put(7, "Dhoni");
		tm.put(18, "Kohli");
		tm.put(45, "Rohit");

		for(Map.Entry<Integer, String> m: tm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}
}
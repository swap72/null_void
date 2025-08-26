/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice4;

/**
 *
 * @author swapn
 */
import java.util.ArrayList;

public class Exp{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		al.add('c');
		al.add("string");
		al.add(false);
		al.add(3.5);
                al.add("bingo");
		al.add(172);
                al.add("spartan");
	
	for(Object e:al){
            if(e instanceof String){
                System.out.println(((String)e).toUpperCase()+" "+((String)e).length());


            }
            
	}
		
	}
}
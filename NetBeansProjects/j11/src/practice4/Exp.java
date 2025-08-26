package practice4;

import java.util.ArrayList;
import java.util.ArrayList;

public class Exp{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		al.add(6);
		al.add("Hello");
		al.add(false);
		al.add(4.632);
		al.add('c');
		al.add("skyfall");
		al.add("om");
		
		for(Object e:al){
			if(e instanceof String){
			System.out.println(((String)e).toUpperCase()+" "+((String)e).length());
			}
		}
	}
}
package practice3;

import java.util.Arrays;
public class MakeMeBig{
	static String rev(String a){
		StringBuilder sb=new StringBuilder(a);
		return sb.reverse().toString();
        }
	
	public static void main(String[] args){
		int n=3451974;
		String s=String.valueOf(n);
		
		char[] c=s.toCharArray();
		Arrays.sort(c);
		
		String s2=new String(c);
		s2=rev(s2);
		System.out.println(s2);
		
	}
}
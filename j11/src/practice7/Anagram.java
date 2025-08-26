package practice7;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram{

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String s1=input.nextLine();
		String s2=input.nextLine();
		if(s1.length()!=s2.length()){
		System.out.println("Not anagram");
		return;
		}
		System.out.println(AreAnagram(s1,s2) ? "Anagram":"Nope, Not Anagram");
		
	}


	static boolean AreAnagram(String s1, String s2){
		char[] c1=s1.toLowerCase().toCharArray();
		char[] c2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1,c2);
	}

}

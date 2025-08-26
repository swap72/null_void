package Practice;
import java.util.HashMap;
public class CorePractice{
    public static void main(String[] args) {
        String s="hello";
        char[] letters=new char[26];
        for (int i = 0; i <26; i++) {
            letters[i]=(char)(97+i);
        }
        s.toCharArray();
        for (int i = 0; i < s.length(); i++) {            
            for (int j = 0; j < letters.length; j++) {
                if(s.charAt(i)==letters[j]){
                    System.out.print(letters[j]+" ");
                }
            }
            
        }
        
   }
}
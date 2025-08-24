package practice3;
import java.util.HashSet;
public class LetterPlay {
    public static void main(String[] args) {
        String s1="chocolate";
        HashSet<Character> hs=new HashSet<Character>();
        HashSet<Character> hsd=new HashSet<Character>();
        
        for(char c:s1.toCharArray()){
            if(!hs.add(c)){
                hsd.add(c);
            }
        }
        System.out.println(hsd);
        hs.removeAll(hsd);
        System.out.println(hs);
        
    }
}

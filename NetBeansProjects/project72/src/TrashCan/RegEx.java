package TrashCan;
import java.util.regex.*;
public class RegEx {
    public static void main(String[] args) {
        String s="helloBBEO"; String re="[A-Z]"; 
        System.out.println(Pattern.matches(s, re) ? "True":"False");
    }    
}

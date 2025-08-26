package RegEx;
import java.util.regex.*;
public class Practice {
    public static void main(String[] args) {
        String reg="[A].*";
        String reg1="A.*";
        String reg3="[A,a].*";
        String enWsp = "[^A-Z,^0-9].*";
        System.out.println(Pattern.matches(reg,"Apple"));
        System.out.println(Pattern.matches(reg1,"Apple"));
        System.out.println(Pattern.matches(enWsp,"@Apple"));
    }
}

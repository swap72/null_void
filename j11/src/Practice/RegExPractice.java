//package Practice;
//
//import java.util.regex.Pattern;
//
//public class RegExPractice {
//    public static void main(String[] args) {
//        String s = "Awa0pnil4";                 
//        System.out.println(Pattern.matches(".*\\d.*", s));
//        System.out.print("Even this will work: ");
//        System.out.println(Pattern.matches(".*[0-9].*", s));
//    }
//}





//public static void main(String[] args) {
//        String s = "Awapnil"; 
//        String regex1 = "A.*"; // Regex pattern of a String regex1 to match if String starts with A and has any character any no. of times after it.
//        
//        System.out.println(Pattern.matches(regex1, s));
//    }

//public static void main(String[] args) {
//        String s = "Awapnil";                 
//        System.out.println(Pattern.matches("A.*", s));
//    }

/*

The regular expression ".*[0-9].*" has the following meaning:

.*: This means "zero or more of any character." It allows any characters (or none) to appear before and after the digit.

[0-9]: This matches any single digit from 0 to 9.

.*: Again, this allows zero or more of any character to appear after the digit.

Full Meaning:

This pattern matches any string 
that contains at least one digit (0-9), 
regardless of what characters (if any) appears before or after the digit. 
The .* parts ensure that the digit can be anywhere in the string.

Example:
"abc123def" will match, as it contains digits (123).
"hello42" will match, as it contains 42.
"justletters" will not match, as there are no digits, hence will spit false.

//*/
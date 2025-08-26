package practice3;

public class PalindromeString{
    public static void main(String[] args) {
        String s="Sahas";
        boolean flag=true;
        s=s.toLowerCase();
        for(int i=0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                flag=!flag;
                break;
            }
        }
        
        System.out.println(flag ? "Palindrome":"Not Palindrome");
    }
}
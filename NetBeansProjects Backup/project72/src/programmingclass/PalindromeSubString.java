package programmingclass;

public class PalindromeSubString {
    public static void main(String[] args) {
      String s1="hi aba hello level nnn hkl";
      String[] ar=s1.split(" ");
      
      for(String e:ar){
          String x=new StringBuilder(e).reverse().toString();
          if(e.equalsIgnoreCase(x)){
             System.out.println(e);
          }
          
          else{
             System.out.println("Not Palindrome");
          }
      }
    
    }
}

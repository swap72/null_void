import java.util.*;
public class countValidWords {
    
    public static int countValidWords(String input){
        int count=0;
        input = input.toLowerCase();
        String[] str = input.split(" ");
        for(String word : str){
        if(word.length()>=3 && word.matches("[a-z0-9]+")){
            if(word.matches(".*[aeiou.*]") && word.matches(".*[^aeiou].*")){
                count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        String input = "This is Form16 submis$ion date";
	System.out.println(countValidWords(input));

    }
}

package Practice;
import java.util.LinkedHashMap;

public class LinkedHashMapPractice {
    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> lhm=new LinkedHashMap<Character, Integer>();
        String s="hello";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(lhm.containsKey(ch)){
               lhm.put(ch,lhm.get(ch)+1); 
            }
            else{
                lhm.put(ch,1);
            }
        }
        for(char e:lhm.keySet()){
            System.out.println(e+"-->"+lhm.get(e));
        }
    }
}

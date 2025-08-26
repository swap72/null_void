//package Practice;
//
//import java.util.HashMap;
//
//public class HashMapPractice {
//    public static void main(String[] args) {
//        HashMap<Character, Integer> hm = new HashMap<>();
//        
//        // Loop through the letters A-Z
//        for (int i = 0; i < 26; i++) {
//            // Add 'A' (65) + i to the HashMap as the key, and position (i + 1) as the value // When you add i to 'A', Java implicitly converts 'A' (which has a value of 65) to its integer value and adds i to it. The result of 'A' + i is an integer (because Java automatically promotes characters to integers in arithmetic operations).
//            hm.put((char) (90 + i), i + 1); // (char) ('A' + i) is also fine 
//        }
//        
//        // Print the HashMap
//        System.out.println(hm);
//    }
//}

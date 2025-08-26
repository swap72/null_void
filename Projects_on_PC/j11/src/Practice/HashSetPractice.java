//package Practice;
//
//import java.util.HashSet;
//
//public class HashSetPractice {
//    public static void main(String[] args) {       
//        String s="chocolate";
//        HashSet<Character> hs=new HashSet<Character>();
//        HashSet<Character> hsd=new HashSet<Character>();
//        for (char c : s.toCharArray()) {
//            if(!hs.add(c)){
//                 hsd.add(c);
//            }
//        }
//        System.out.println("duplicate letters are "+hsd);
//        hs.removeAll(hsd);
//        System.out.println("Unique letters are "+hs);
//    }
//}

/*
All, Duplicate and Unique (Set Theory in Action / Deductive appraoch)

first we create hashset of all elements,
then we create hashset of duplicate elements,
then we remove duplicate elements from our all element hashset
now in the end what we are left with is hashet of unique elements
*/
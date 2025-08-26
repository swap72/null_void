package jutge.org;

import java.util.HashMap;


public class Main{
    public static void main(String[] args) {
        int[] ar={2,34,42,74,2,12,1,1,2,74,74,74};
        int[] res=new int[ar.length];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int e : ar) {
            hm.put(e, hm.getOrDefault(e, 0)+1);
        }
        
    }
}


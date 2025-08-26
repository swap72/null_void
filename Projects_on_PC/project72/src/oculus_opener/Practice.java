package oculus_opener;
import java.util.*;
class Practice{

    public static void main(String[] args) {
        
//        ArrayList<Integer> ar=new ArrayList<Integer>();
//        ar.add(32);ar.add(320);ar.add(3);
//        
//        int m=12;
//        ar.set(0, 1);
//        
//        System.out.println(ar);
//        
            ArrayList<Integer> ar=new ArrayList<Integer>();
            int[] ar1={10, 20, 20, 10, 10, 30, 50, 10, 20};
            ar.add(10);ar.add(20);ar.add(20);ar.add(10);ar.add(10);ar.add(30);ar.add(50);ar.add(10);ar.add(20);
            System.out.println(ar);
            
            int dup=0;
            for(int i=0;i<ar.size()-1;i++){
                if(ar.contains(ar.get(i))){
                    dup++;
                    ar.get(i)=i;
                }
            }
            System.out.println(dup);
            
    }
}


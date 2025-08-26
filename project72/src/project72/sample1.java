package project72;

import java.util.*;

public class sample1{
//    public static void main(String[] args) {
//        LinkedList<Integer> lili = new LinkedList<>();
//        lili.add(1);
//        lili.add(2);
//        lili.add(3);
//        lili.add(4);
//        lili.add(5);
//        
//        
//        System.out.println(lili);
//        
//        
//
//        
//    }
    
    public static int add(int a, int b) {
        while (b != 0) {
            // Carry now contains common set bits of a and b
            int carry = a & b;

            // Sum of bits of a and b where at least one of the bits is not set
            a = a ^ b;

            // Carry is shifted by one so that adding it to a gives the required sum
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int sum = add(num1, num2);
        System.out.println("Sum: " + sum); // Output: Sum: 47
    }
    
}
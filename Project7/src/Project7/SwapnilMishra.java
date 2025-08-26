/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project7;

public class SwapnilMishra {
 
    private static String indent = "   ";
 
    static void meth17(int a, int level) {
        var inspring = indent.repeat(level);
        System.out.println(inspring + "in method17, with a = " + a + " and level " + level);
 
        while (a <= 4) {
            System.out.println(inspring + "invoking meth17 with a = " + (a + 1) + " and level " + (level + 1));
            meth17(++a, level + 1);
 
        }
        System.out.println(inspring + "printing a = " + a + " finished meth17 with level " + level);
//        System.out.println(a);
 
    }
 
    public static void main(String[] args) {
 
        meth17(4, 1);
 
    }
}

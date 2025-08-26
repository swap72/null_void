/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author swapn
 */
public class Factorial {

    public static void main(String[] args) {
        int num = 5;
        long factorial = multiplyNumbers(num);    
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    
    
    public static long multiplyNumbers(int num){
        if (num >= 1){
                return num * multiplyNumbers(num - 1);
        }
        
        else
            return 1;
    }
    
    
}
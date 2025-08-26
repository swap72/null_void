/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice6;

class NegativeAgeException extends RuntimeException{
    NegativeAgeException(String msg){
        super(msg);        
    }
}

public class Example{
    public static void main(String[] args) {
        int age=-4;
        if(age<0){
            throw new NegativeAgeException("Age Cannot be Negative");
        }
        System.out.println("Valid Age!");
    }
}
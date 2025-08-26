/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author swapn
 */
public class Rec{
    
    public static void main(String[] args) {
        int a=7;
        int b= mymeth(a);
        System.out.println(a+""+b);
    }
    
    static int mymeth(int a){
        if(a>=3){
            return 2*mymeth(a);
        }
        return 4;
    }


}
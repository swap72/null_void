/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice5;

/**
 *
 * @author swapnil
 */
public class OverloadingExample{
    public void phone(String x){
            System.out.println("Phone can make a call");
    }
    public void phone(Integer x){
            System.out.println("Phone can dial");
    }
    public static void main(String[] args) {
        OverloadingExample e=new OverloadingExample();
        e.phone(3);
        e.phone("Hi");
    }
}
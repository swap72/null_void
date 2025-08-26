/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice4;

/**
 *
 * @author swapn
 */
public class Verify {
    public static void main(String[] args) {
        Singleton ob1=Singleton.getInstance();
        Singleton ob2=Singleton.getInstance();
        System.out.println(ob1.hashCode()==ob2.hashCode());
    }
}

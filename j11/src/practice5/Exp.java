/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice5;

/**
 *
 * @author swapn
 */
public class Exp {
    public static void main(String[] args) {
        Human h=new Human();
        h.kill();
    }
}

class killer{
    protected void kill(){
        System.out.println("Killing");
    }
}

class Human extends killer{
    @Override
     void kill(){
        System.out.println("Human is killing...");
    }
}
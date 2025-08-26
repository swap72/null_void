/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice4;

/**
 *
 * @author swapn
 */

class Animal{
    public void sound(){
        System.out.println("Generic animal sound");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog sound");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat sound");
    }
}
public class Poly {
    public static void main(String[] args) {
        Animal a=new Animal();
        Animal b=new Dog();
        Animal c=new Cat();
        a.sound(); b.sound(); c.sound();
    }
}

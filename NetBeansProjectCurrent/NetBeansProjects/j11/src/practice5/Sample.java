/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice5;

/**
 *
 * @author swapnil
 */
public class Sample {
    public static void main(String[] args) {
        Animal a;
        a=new Animal();
        a.sound();
        a=new Cat();
        a.sound();
        a=new Dog();
        a.sound();
    }
}

class Animal{
    public void sound(){
        System.out.println("Generic Animal sound");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Dog sound");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("Cat sound");
    }
}


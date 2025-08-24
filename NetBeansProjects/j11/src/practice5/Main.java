/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice5;

/**
 *
 * @author swapnil
 */


public class Main{
    public static void main(String[] args) {
        Task1 t1=new Task1();
        Task2 t2=new Task2();
        t1.start();
        t2.start();
    }
}

class Task1 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(0);
        }
    }
}
class Task2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(1);
        }
    }
}
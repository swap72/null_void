/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice6;


class Task1 implements Runnable{
    @Override
    public void run(){
        System.out.println("Task1...");
    }
}
public class ThreadViaInterface {
    public static void main(String[] args) {
        Task1 t1=new Task1();
        Thread t=new Thread(t1);
        t.start();
    }
}

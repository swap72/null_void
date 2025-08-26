/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

class Task1 extends Thread{
    {
        Thread.currentThread().setName("Bingo");
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is running first");
    }
}

public class Test{
    public static void main(String[] args) throws InterruptedException {                        
        Task1 t1=new Task1();
        t1.start();        
        t1.join();        
        System.out.println("main thread...");
    }
}
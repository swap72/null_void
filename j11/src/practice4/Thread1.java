/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice4;

/**
 *
 * @author swapn
 */

class EvenThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                System.out.print(i);
            }
        }
    }
}

class OddThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            if(i%2!=0){
                System.out.print(i);
            }
        }
    }
}

public class Thread1 {
    public static void main(String[] args) {
        EvenThread t1=new EvenThread();
        OddThread t2=new OddThread();
        t1.start();t2.start();
    }
}

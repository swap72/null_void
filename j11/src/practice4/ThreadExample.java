/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice4;

/**
 *
 * @author swapn
 */
public class ThreadExample extends Thread{
    @Override
    public void run(){
        for (int i = 0; i<100; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {        
        ThreadExample te=new ThreadExample();  
        te.start();        
    }
}

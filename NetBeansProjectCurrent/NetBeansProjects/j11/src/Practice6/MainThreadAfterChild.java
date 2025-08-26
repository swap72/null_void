/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice6;

class MyThread extends Thread {
    public void run() {
        System.out.println("Child thread is running");
    }
}

public class MainThreadAfterChild {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();  // Start the child thread

        // Main thread waits for the child thread to finish before continuing
        t1.join();

        // Now that t1 is complete, main thread continues
        System.out.println("Main thread is running after child thread completes.");
    }
}

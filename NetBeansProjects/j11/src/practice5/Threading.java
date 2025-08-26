/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice5;

/**
 *
 * @author swapnil
 */
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;

import java.util.concurrent.ConcurrentHashMap;

public class Threading {
    public static void main(String[] args) {
        // Create a shared ConcurrentHashMap
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Thread to add elements
        Thread addThread = new Thread(() -> {
            map.put(1, "Value1");
            System.out.println("Added: 1 -> Value1");
        });

        // Thread to remove elements
        Thread removeThread = new Thread(() -> {
            map.remove(1);
            System.out.println("Removed: 1");
        });

        // Start both threads
        addThread.start();
        removeThread.start();
    }
}

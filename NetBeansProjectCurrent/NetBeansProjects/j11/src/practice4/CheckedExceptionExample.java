/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice4;

import java.io.IOException;

public class CheckedExceptionExample {
    
    // Method that throws a checked exception
    public void throwIOException() throws IOException {
        // Throw a new IOException
        throw new IOException("This is a checked exception!");
    }

    public static void main(String[] args) {
        CheckedExceptionExample example = new CheckedExceptionExample();
        
        try {
            example.throwIOException();  // Call the method that throws the exception
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}

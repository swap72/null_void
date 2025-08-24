/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice5;

/**
 *
 * @author swapnil
 */
public class Sample2{
    public static void main(String[] args) {
        Demo.demo();
    }
}

class Demo{
    private Demo(){
        for(int a=1;a<=5;a++){
            new Demo();
        }
    }
    static void demo(){
        
    }
}

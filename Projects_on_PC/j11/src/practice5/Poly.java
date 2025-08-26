/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice5;

/**
 *
 * @author swapn
 */

class Poly{
    public static void main(String[] args) {
        EV v=new EV();        
    }
}

class Vehicle{
    Vehicle(){
        System.out.println("One");
    }
}

class TwoWheeler extends Vehicle{
    TwoWheeler(){
        super();
        System.out.println("Two");
    }
}

class EV extends TwoWheeler{
    EV(){
        super();
        System.out.println("Three");
    }
}

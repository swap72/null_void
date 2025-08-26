/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice5;

/**
 *
 * @author swapnil
 */
public class Main2{
    public static void main(String[] args) {
        Payment pay1=new UPI();
        Payment pay2=new CreditCard();
        Payment pay3=new NetBanking();
        
        pay1.Payment();
        pay2.Payment();
        pay3.Payment();
    }
}

class Payment{
    public void Payment(){
        System.out.println("General Paying method");
    }
}

class UPI extends Payment{
    public void Payment(){
        System.out.println("Paying through UPI..");
    }
}

class CreditCard extends Payment{
    public void Payment(){
        System.out.println("Paying through Credi Card..");
    }
}

class NetBanking extends Payment{
    public void Payment(){
        System.out.println("Paying through Net Banking...");
    }
}
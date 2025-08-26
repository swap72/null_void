/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice6;

/**
 *
 * @author swapnil
 */
public class Exo {
    public static void main(String[] args) {
     killer k=new killer();
     John j=new John();
     
     
    }
}

class killer{
    private void kill(){
        System.out.println("Kiling");
    }
}
class John extends killer{
    @Override
    private void kill(){
        System.out.println("killing with kindness..");
    }
}
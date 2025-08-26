/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice5;

/**
 *
 * @author swapnil
 */
public class Phone{
static void feature(String msg){

		System.out.println("Dialing message "+msg);
	}

static void feature(long num){

		System.out.println("Dialing number...");
	}

static void feature(boolean flag){

		System.out.println(flag? "Battery Low":"Battery High");
	}

    public static void main(String[] args) {
        Phone.feature(63016565);
        Phone.feature("urget");
        Phone.feature(true);
    }
}
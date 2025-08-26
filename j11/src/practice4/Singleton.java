/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice4;

/**
 *
 * @author swapn
 */
public class Singleton{
	private static Singleton instance;

	Singleton(){
	System.out.println("Singleton instance created");
	}

	public static Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}

}
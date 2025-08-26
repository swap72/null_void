/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice6;

/**
 *
 * @author swapnil
 */
public class Main {
    public static void main(String[] args) {
        Singleton ob1=Singleton.getInstance();
        Singleton ob2=Singleton.getInstance();
        System.out.println(ob1.hashCode()==ob2.hashCode());
    }
}

class Singleton{
private static Singleton instance;

	private Singleton(){
		System.out.println("Singleton instance created");
	}

	public static Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice5;

/**
 *
 * @author swapnil
 */
interface JPA{

public void start();
public void get();
public void load();
public void stop();

}

public class Hibernate implements JPA{
    public static void main(String[] args) {
        Hibernate h=new Hibernate();
        h.start();
        h.get();
        h.load();
        h.stop();
    }
	@Override
	public void start(){
		System.out.println("Hibernate's implementation of start method");
	}

	@Override
	public void get(){
		System.out.println("Hibernate's implementation of get method");
	}

	@Override
	public void load(){
		System.out.println("Hibernate's implementation of load method");
	}
	@Override
	public void stop(){
		System.out.println("Hibernate's implementation of stop method");
	}


}
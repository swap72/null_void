/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice5;

/**
 *
 * @author swapnil
 */
class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
}

public class CustomException{
	static void verify(int age) throws InvalidAgeException{
	if(age<18){
		throw new InvalidAgeException("Not Eligible");
	}
	
	else{
	System.out.println("Eligible!");
	}
	
	
	public static void main(String[] args){
		int age=17;
		try{
		verify(age);
		}
		catch(InvalidAgeException e){
			System.out.println("Caught "+e);
		}
	
	}
}
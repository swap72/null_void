package practice4;

class InvalidAgeException extends Exception{
	InvalidAgeException(String x){
	super(x);
	}
}


public class CustomException{
	static void verify(Integer age) throws InvalidAgeException{
		if(age<18){
		throw new InvalidAgeException("Cannot Vote");
			}
		else{
		System.out.println("Must Vote");
		}
	}
	public static void main(String[] args){
		Integer age=120;
		try{
		verify(age);
		}
		catch(InvalidAgeException e){
			System.out.println("Caught "+e);
		}
		
		}
}
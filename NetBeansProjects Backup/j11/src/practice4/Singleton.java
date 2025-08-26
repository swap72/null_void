package practice4;

public class Singleton{
	private static Singleton instance;

	private Singleton(){
	System.out.println("Single Instance Created");
	}
	
	public static Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}

		return instance;
	}
}
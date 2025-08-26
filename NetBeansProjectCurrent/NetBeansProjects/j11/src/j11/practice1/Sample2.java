package j11.practice1;

class dog implements Runnable{
	@Override
	public void run(){
		System.out.println("Winning");
	}
}

public class Sample2{
	public static void main(String[] args){
            dog d=new dog();	
            Thread t=new Thread(d);
            t.start();
	}
}
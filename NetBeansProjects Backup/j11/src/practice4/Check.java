package practice4;

public class Check{
    public static void main(String[] args){
      Singleton a=Singleton.getInstance();
      Singleton b=Singleton.getInstance();
      
        System.out.println(a.hashCode()==b.hashCode());
    }
}
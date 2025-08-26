package practice3;

public class Bean{
    public static void main(String[] args){
        POJO p1=new POJO();
        p1.setName("Rahul");
        p1.setAge(24);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}

class POJO {

private int age;
private String name;

    public void setName(String x){
        name=x;
    }
    
    public String getName(){
      return name;
    }
    
    public void setAge(int y){
        age=y;
    }
    
    public int getAge(){
        return age;
    }
        
}

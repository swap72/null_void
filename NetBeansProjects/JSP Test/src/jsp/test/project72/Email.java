package jsp.test.project72;

public class Email {
    
    String owner;
    int inbox;
    int spam;
    int all;
    
    Email(String o,int i,int s,int a){
        owner=o;
        inbox=i;
        spam=s;
        all=a;
    }
    
    void details(){
        System.out.println("Email belongs to : "+owner);
        System.out.println("inbox :"+inbox);
        System.out.println("spam :"+spam);
        System.out.println("All :"+all);
    }
}

class main{
  public static void main(String args[]){
      Email e1=new Email("Ram",172,72,899);
      e1.details();
      
  }
  
}
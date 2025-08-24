package jsp.test.project72;

public class PhoneContact {

   String name;
   long number;
   char gender;


   
   PhoneContact(String n,long num,char c){
       name=n; number=num; gender=c;
   }
   void details(){
       System.out.println("Name: "+name);
       System.out.println("number: "+number);
       System.out.println("Gender: "+gender);
   }
}

class main{
  public static void main(String args[]){
     PhoneContact c1=new PhoneContact("Ram",43598395,'M');
      c1.details();
  }
}

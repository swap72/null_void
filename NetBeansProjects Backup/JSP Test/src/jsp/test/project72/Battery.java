package jsp.test.project72;

public class Battery {
   String brand;
   int capacity;
   int year;
   
   Battery(String b,int c,int y){
       brand=b; capacity=c; year=y;
   }
   void details(){
       System.out.println("Brand: "+brand);
       System.out.println("Year: "+year);
       System.out.println("Capacity: "+capacity);
   }
}

class main{
  public static void main(String args[]){
      Battery b1=new Battery("Toshiba",8000,2024);
      b1.details();
  }
}

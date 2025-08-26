package jsp.test.project72;

public class WaterBottle {
String color;
int capacity;
String metal;

WaterBottle(String c,int cap,String met){
  color=c;capacity=cap;metal=met;
}
void details(){
    System.out.println("Color: "+color);
    System.out.println("Metal: "+metal);
    System.out.println("Capacity: "+capacity);
   }
}

class main{
   public static void main(String args[]){
       WaterBottle wb=new WaterBottle("Blue",2,"Copper");
       wb.details();
   }
   
}
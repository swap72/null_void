package OOP;

public class Type {
       public static void main(String[] args) {
       BluePrint1 bp=new BluePrint1();
           System.out.println(bp);
           System.out.println(bp.j1);
           bp.meth1();
    }
}

class BluePrint1{
    BluePrint1 j1=this;
    BluePrint1 meth1(){
      System.out.println(j1);
      System.out.println("hi");
      return null;  
    } 
}
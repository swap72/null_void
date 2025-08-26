package javaapplication6;

public class Sample2{
    public static void main(String[] args) {
        
        zigsaw.myMeth();
        }
    
    public static class zigsaw {
        
        static int b=0;
        static void myMeth(){
        
        if(b<=3){
        b++;
        System.out.println(b);
        myMeth();
        }
       
        
        
        }

    }
}



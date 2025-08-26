package javaapplication6;
import java.util.*;
//
//class sample5{
//static void method1(){
//    System.out.println("Hi How are You? ");
//    }
//}

class sample4{
    
    public static void main(String args[]){
//        sample5.method1();
        ArrayList al=new ArrayList();
        al.add(2);al.add(4);al.add(6);al.add(8);
        
        
        
        ListIterator itr=al.listIterator(al.size());
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        } 
    }   
}

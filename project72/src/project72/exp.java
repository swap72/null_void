package project72;
import java.util.*;
public class exp{
public static void main(String args[]){
    
    ArrayList al=new ArrayList();
    // <Integer> specifies that the elements are of Integer Object types
    // remove <Integer> and the elements will be treated as raw object types
    //if this happens al.add(al.get(i-1)+al.get(i-2)) will be treated as 
    // error because addition can not be directly performed on raw object types
    // and al.add(al.get(i-1)+al.get(i-2))  will give error
             
            al.add(0);al.add(1);
            al.add(al.get(0)+al.get(1));
//            for(int i=2;i<=8;i++){
//              
//                al.add(al.get(i-1)+al.get(i-2)); 
//            }
        
            
//    System.out.println(al.get(1)+al.get(0));
    
        
    }
}
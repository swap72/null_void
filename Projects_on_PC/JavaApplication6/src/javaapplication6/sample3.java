package javaapplication6;

class abc{
    
    int method1(int d[]){
    int result=0;
    for(int z:d){
    result= result+z;
    }
    return result;    
    }    
}
// alternate loop option
//for(int i=0;i<=d.length-1;i++){
//    z= z+d[i];
//    }
//    return z;    
//    }    





public class sample3{
public static void main(String arr[]){
     
    abc obj1=new abc();
    System.out.println(obj1.method1(new int[]{2,3,5,7,11}));
    
    }
}

/*
passing an anonymous array as an argument into the array parameter in the method1 method 
set by the user

return statement is used to return a value from the method 

*/
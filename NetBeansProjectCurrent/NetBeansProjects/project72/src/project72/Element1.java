
package project72;

class Element{
    int Element_Atomic_Weight;
    int Element_Atomic_Number;
    String Element_Symbol;
    
    Element(int w,int n,String s){
        Element_Atomic_Weight=w;
        Element_Atomic_Number=n;
        Element_Symbol=s;
    }
}



public class Element1 {  
    
    public static void main(String arr[]){
        
        Element Tungsten=new Element(183,74,"w");
        Element Plutonium=new Element(244,94,"Pu");
        Element Neodymium=new Element(144,60,"Nd");
        
        System.out.println(Neodymium.Element_Atomic_Number+" "+Neodymium.Element_Atomic_Weight+" "+Neodymium.Element_Symbol);
        System.out.println(Plutonium.Element_Atomic_Number+" "+Plutonium.Element_Atomic_Weight+" "+Plutonium.Element_Symbol);
        System.out.println(Tungsten.Element_Atomic_Number+" "+Tungsten.Element_Atomic_Weight+" "+Tungsten.Element_Symbol);
    }   
}


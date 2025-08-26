//
//package TrashCan;
//
//public class Constructor {
//    public static void main(String[] args) {
//        Animal a1=new Animal();   
//        System.out.println(a1.speed+" "+a1.name+" "+a1.height+" "+ a1.weight+" "+a1.visibility);
//    }
//}
//
//class Animal{
//    int speed,visibility;
//    String name;
//    int height,weight;
//    Animal(){
//        this(173,98); //this() must be the first statement in the constructor, according to Java's rules for constructor chaining
//        //this(8); only 1 constructor call per line is allowed because Java restricts the constructor to a single constructor chaining call. and this is why chaining makes sense because alpha calls beta, beta calls gama, gama calls delta.. and so on...
//        speed=17;
//        name="Swan";
//        
//    }
//    Animal(int height,int weight){
//        this(8);
//        this.height=height;this.weight=weight;
//    }
//    Animal(int visibility){
//        this.visibility=visibility;
//    }
//    
//}
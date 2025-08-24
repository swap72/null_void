package j11;

public class overLoad {
    public static void main(String[] args) {
        overLoad o1=new overLoad();
        o1.move("t");
        o1.move(4);
        o1.move(4.5);
    }
    
    void move(String x){
        System.out.println("walking");
    }
    
    void move(int y){
        System.out.println("running");
    }
    
    void move(double z){
        System.out.println("sprinting");
    }
    
    
}

package j17;

public class Exp2{

    public static void main(String[] args) {
        good g=new good();
        g.play();
    }
}


interface gang{
    void play();
    
}
interface bang{
    void play();
}

class good implements bang, gang{
    public void play(){
        
    }
}


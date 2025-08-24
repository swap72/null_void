package Practice2;

public class NumberGenerator {
    private int startNum;
    private int endNum;
    
    public NumberGenerator(int startNum, int endNum){
        this.startNum= startNum;
        this.endNum=endNum;
    }
    
    public void generate(){
        System.out.println("Generating numbers from "+startNum+"to"+endNum);
        for (int i = startNum; i <= endNum; i++) {
            System.out.println(i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

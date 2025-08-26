package practice3;

public class CharFreq{
    public static void main(String[] args){
        String s="chocolate";
        char[] c1=s.toCharArray();
        char[] c2=s.toCharArray();
        
        for(int i=0;i<c1.length;i++){
            int count=0; char c=c1[i];
            for(int j=0;j<c2.length;j++){
                if(c==c2[j]){
                    count++;
                    c2[j]='\0';
                }
            }
            if(count!=0){
                System.out.println(c+"-"+count);
            }
        }
    }
}
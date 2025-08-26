package Practice2;

public class Pattern{
    public static void main(String[] args){
        String s1="chocolate";
        char[] car1=s1.toCharArray();
        char[] car2=s1.toCharArray();
        char c; 
        for (int i = 0; i < car1.length; i++) {
            c=car1[i]; int count=0;
            for (int j = 0; j < car1.length; j++) {
               if(c==car2[j]){
                   count++;
                   car2[j]='\0';
               }
            }
            if(count!=0){
                System.out.println(c+"-"+count);
            }
            
        }        
    }
}

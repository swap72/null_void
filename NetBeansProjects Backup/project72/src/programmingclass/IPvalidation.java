package programmingclass;

public class IPvalidation {
    public static void main(String[] args) {
        String s1="123.44.56.413";
        String[] ar=s1.split("[.]");
        for(String e:ar){
            int i=Integer.parseInt(e);
            if(i>=0&&i<=255){
                System.out.println("Valid!");
                break;
            }
            else{
                System.out.println("invalid");
            }
            
        }
        
        
        
    }    
}

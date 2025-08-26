
public class fiftythree {
    public static void main(String[] args) {
        int a=70,b=72,c=332,d=41,e=332;
       if((a>=b)&&(a>=c)&&(a>=d)&&(a>=e)){
           System.out.println(a);
       }
       else if((b>=c)&&(b>=d)&&(b>=e)){
           System.out.println(b);
       }
       else if((c>=a)&&(c>=d)&&(c>=e)){
           System.out.println(c);
       }
       else if((d>=a)&&(d>=c)&&(d>=e)&&(d>=b)){
           System.out.println(d);
       }
       else{
           System.out.println(e);
       }
       
    }
}

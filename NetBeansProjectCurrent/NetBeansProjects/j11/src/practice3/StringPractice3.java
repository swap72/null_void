
package practice3;

public class StringPractice3{
    static String rev(String str){
        StringBuilder sb1=new StringBuilder(str);
        str=sb1.reverse().toString();
        return str;
    }
    public static void main(String[] args){
      String s1="hello hi bye welcome"; String s3="";
  String[] s2=s1.split(" ");             
    
  for(int i=0;i<s2.length/2;i++){
            String tmp = s2[i];
            s2[i]=s2[s2.length-i-1];
            s2[s2.length-i-1]=tmp;
  }
        for (int i = 0; i < s2.length; i++) {
            if(i%2==0){
               s2[i]=rev(s2[i]);
            }
        }
        s3=String.join(" ",s2);        
        System.out.println(s3);
    }    
}

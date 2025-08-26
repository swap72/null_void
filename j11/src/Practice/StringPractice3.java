package Practice;

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

//	for(int i=0;i<s2.length;i++){
//            if(i%2==0){
//                StringBuilder s3=new StringBuilder(s2[i]);
//                s3.reverse();
//            }			
//	}



//public class StringPractice3 {
//    public static void main(String[] args) {
//        String s="hello hi bye welcome"; char[] sar=s.toCharArray();
//        for (int i = 0; i < sar.length/2; i++) {
//            char tmp;
//            tmp=sar[i];
//            sar[i]=sar[sar.length-i-1];
//            sar[sar.length-i-1]=tmp;
//        }
//        String s1="";
//        for(char e:sar){
//            s1=s1+e;
//            System.out.print(e);
//        }
//    }
//}

// Above code same as :

//public class StringPractice3 {
//    public static void main(String[] args) {
//        String s="hello hi bye welcome"; String s1="";
//        for (int i = s.length()-1; i>=0; i--) {
//            s1+=s.charAt(i);
//        }
//        System.out.println(s1);
//    }
//}
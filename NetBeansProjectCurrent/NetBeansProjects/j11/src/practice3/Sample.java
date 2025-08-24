package practice3;

public class Sample{
	static String rev(String s1){
		StringBuilder sb1= new StringBuilder(s1);
		s1=sb1.reverse().toString().toLowerCase();
		return s1;
	}
	public static void main(String[] args){
            String s2="Jahaj",s3="jahaj";
            System.out.println(rev(s2).equalsIgnoreCase(s3));
	}
}
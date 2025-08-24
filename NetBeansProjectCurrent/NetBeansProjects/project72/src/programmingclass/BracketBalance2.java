package programmingclass;

public class BracketBalance2 {
        static char[] stack;
        static int top=-1;
        
        static void push (char ele){
            top++;
            stack [top]=ele;
        }
        static void pop(){
            top--;
        }
    public static void main(String[] args) {
        String s="((()))";
        stack =new char[s.length()];
        boolean flag=true;
        
        for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='('){
                    push('(');
                }
                
                else if(s.charAt(i)=='('&&top!=-1){
                    pop();
                }
                else if(s.charAt(i)=='('&&top==-1){
                    flag=false; break;
                }
                
        }
        
    }
    
}

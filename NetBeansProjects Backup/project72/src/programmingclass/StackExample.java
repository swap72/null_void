package programmingclass;
import java.util.Scanner;
public class StackExample {
    
    static void pop (){
        if(top==-1){
            System.out.println("Stack underflow error");
        }
        else{
            stack[top]=-1
            System.out.println("Stack has been deleted");
        }
    }
    
    static int peek(){
        if(top=-1){
            return -1;
        }
        return stack[top];
    }
    
    static boolean isEmpty(){
    return top==-1;
    }
    
    static boolean isFull(){
        return top==stack.length-1;
    }
    
    static void clear(){
        System.out.println("All data has been deleted..!");
        top==-1;
    }
    
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
            
    }
}

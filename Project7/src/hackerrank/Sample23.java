
package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Sample23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your integer :");
        int n=input.nextInt();
        if((n%2==1)||(n>=6&&n<=20)){
            System.out.println("Weird");
        }
        else {
            System.out.println("Not Weird");
        }
    }
}

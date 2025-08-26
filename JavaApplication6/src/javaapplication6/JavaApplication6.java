package javaapplication6;

public class JavaApplication6{
public static void main(String arr[]){

//int a[][]=new int[2][3];

//a[0][0]=3 ;a[0][1]= 17;a[0][2]= 2;
//a[1][0]=11 ;a[1][1]=23 ;a[1][2]= 19;
// can also be written in nested fashion
// which also shows how exactly it is showed in memory as well

int a[][]=

    {
    {23,17,2},{3,19,11},
    {2,5,7}
    };

/*
In case of jagged array the length property of the object array can be used.
*/


for(int m=0;m<=a.length-1;m++){
for(int l=0;l<=a.length-1;l++){
System.out.print(a[m][l]+" ");
    }
System.out.println("");
}
       
        
        
    }
}
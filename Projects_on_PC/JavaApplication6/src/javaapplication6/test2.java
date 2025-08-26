package javaapplication6;

public class test2{

public static void main(String args[]){
	int z=Mymeth(93);
        int  b=5;
	System.out.println(z);
	}


static int Mymeth(int z){
        z++;
	while (z==3008){
            return z+=z ;
            }
        return Mymeth(z++);
	}

}
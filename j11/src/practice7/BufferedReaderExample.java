package practice7;

import java.io.*;

class BufferedReaderExample{
    public static void main(String[] args) {
        try{
            BufferedReader bf=new BufferedReader(new FileReader("feb.txt"));
            String line;
            while((line=bf.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
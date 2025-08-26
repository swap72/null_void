package programmingclass;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] ar={{11,12,13},{21,22,23},{31,32,33}};
        
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+"  ");
            }
            System.out.println();
        }
        int sum=0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if(i==j){
                  sum= ar[i][j]+ar[i][j];
                }
            }
            
        }
    
        System.out.println("sum of diagnols is "+sum);
        
    
    }    
}

package programmingclass;

public class TwoDArray2 {
    public static void main(String[] args) {
        int[][] ar={{1,2,3},{4,5,6},{7,8,9}};

        int sum=0;
        
        int tmp=0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                
                if(i==j){
                 tmp=ar[i][j];
                 ar[i][j]=ar[j][i];
                 ar[j][i]=tmp;    
                }
                
                
            }
            
        }
        
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+"  ");
            }
            System.out.println();
        }
        
        
    }
    
}

package practice3;

public class PraciceP1 {
    public static void main(String[] args) {
        int[] arr={5,10,2,11,14,6,8,10,6,13};
        int l=arr[2]; int m=arr[4]; int h=arr[7];
        int[] arr1=new int[];
    }    
}

static void merge(int[] arr,int sp,int ep,int m){
  int[] l=new int[m-sp+1];
  int[] r=new int[ep-m];
  int i=0;j=0;k=sp;
  
  for(int x=m+1; x<=ep;x++){
    r[j]=arr[x];
    j++;
  }
 i=0;j=0;
 while(i<l.length&& j<r.length){
  if(l[i]>r[j]){
  arr[k]=l[i];
  i++; k++;
  }
else{

}
 }
}

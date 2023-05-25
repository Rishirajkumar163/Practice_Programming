import java.util.Arrays;

public class Pair_Sum {
    public static void main(String[] args) {
        int []a={603,10,1,0,5,71,90,4209,75,32,2,3,40,66};
        int n=a.length;int key=137;
        Arrays.sort(a);
        int k=0,j=n-1;
        for(int i:a)System.out.print(i+" ");
        System.out.println();
        sum(a,key,k,j);}
    public  static void sum(int []a,int key,int k,int j){
      while(k<j) {
          if (a[k] + a[j] < key) {
              k++;
          } else if (a[k] + a[j] > key) {
              j--;
          } else {
              System.out.println(k + " " + j);
              break;
          }
      }

    }
    }


import java.util.ArrayList;
import java.util.Scanner;
public class Array_reverse {
   public static ArrayList<Integer> reverse(int []a, int k){
        ArrayList<Integer>list=new ArrayList<>();
        int i;
        for(i=a.length-1;i>k;i--)
            list.add(a[i]);
        return list;
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8,9};
        int n=a.length;
        Scanner sc =new Scanner(System.in);
        int k=sc.nextInt();
        for(int i=0;i<=k;i++){
            if(i==k){
               reverse(a,k);
            }

            System.out.println(a[i]);
        }
    }
}

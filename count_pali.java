import java.util.*;

public class count_pali {
    public static void heapsort(int a[],int n){
        for(int i=n/2-1;i>=0;i--){
            heapify(a,n,i);
        }
        for(int i=n-1;i>=0;i--){
            //swap(a[0],a[i]);
            int temp=a[0];
            a[0]=a[i];
            a[i]=temp;
            heapify(a,i,0);
        }
    }

    private static void heapify(int[] a, int n, int i) {
        int large=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n&&a[l]>a[large])
            large=l;
        if(r<n&&a[r]>a[large])
            large=r;
        if(large!=i){
            //swap(a[i],a[large]);
            int temp=a[i];
            a[i]=a[large];
            a[large]=temp;
            heapify(a,n,large);
        }

    }

    public static void main(String[] args) {
            int a[] = {6,5,8,9,16,10,23};
            count_pali sort=new count_pali();
            heapsort(a,a.length);
        for (int i = 0; i < a.length-1 ; i++) {
            System.out.print(a[i]+" ");
        }
        }}


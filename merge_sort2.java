public class merge_sort2 {
    static void merge(int[] a, int l, int mid, int h){
        int indx1=mid-l+1;
        int indx2=h-mid;

        int[] LS =new int[indx1];
        int[] RS =new int[indx2];

        System.arraycopy(a, l , LS, 0, indx1);
        System.arraycopy(a,(mid+1),RS,0,indx2);
//        for(int i=0;i<indx1;i++)
//            LS[i]=a[l+i];
//        for (int j=0;j<indx2;j++)
//            RS[j]=a[mid+1+j];


        int i=0,j=0;
        int k=l;
        while(i<indx1&&j<indx2){
            if(LS[i]<=RS[j])
                a[k++]=LS[i++];
            else
                a[k++]=RS[j++];
        }
        while (i < indx1) {
          a[k] = LS[i];
           i++;
           k++;
       }

        while (j < indx2) {
            a[k] = RS[j];
            j++;
            k++;
        }

    }
    static void sort(int[] a, int l, int h){
        if(l<h){
            int mid=l+(h-l)/2;

            sort(a,l,mid);
            sort(a,mid+1,h);
            merge(a,l,mid,h);
        }
    }
    public static void main(String[] args) {
        int []a={6,9,8,3,2,12,65,42,57,96,81};
        int n=a.length,l=0,h=n-1;
       // int h=n-1;
        int mid=l+(h-l)/2;
        sort(a,l,h);
        for(int i:a) System.out.print(i+" ");
        System.out.println();

        for(int i=0;i<=mid;i++)
            System.out.print(a[i]+" ");
        System.out.println();

        for (int j=h;j>mid;j--)
            System.out.print(a[j]+" ");
    }
}

public class Quick_Sort2 {
    static int partition(int []a,int l,int h){
        int pivot=a[l];
        int i=l;
        int j=h;

        while(i<j){
            while (a[i]<=pivot){
                i++;
            }
            while (a[j]>pivot){
                j--;
            }
            if(i<j){
            int temp =a[i];
                a[i]=a[j];
                a[j]=temp;}
        }
        a[l]=a[j];
        a[j]=pivot;

        return j;
    }

    static void quicksort(int []a,int l,int h){
        if(l<h){
            int indx=partition(a,l,h);
            quicksort(a,l,indx-1);
            quicksort(a,indx+1,h);
        }
    }

    public static void main(String[] args) {
        int []a={5,8,3,7,9,21,45,12,1,32,58,10,17,16};
        int n=a.length;
        quicksort(a,0,n-1);
        for(int j:a) System.out.print(j+" ");
    }
}
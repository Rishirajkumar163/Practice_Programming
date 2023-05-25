public class Merge_sort{

  static void divide(int []a,int l,int h){
        if(l>=h)
            return;
        int mid=l+(h-l)/2;
        divide(a,l,mid);
        divide(a,mid+1,h);
        conquer(a,l,mid,h);
    }

    private static void conquer(int[] a, int l, int mid, int h) {
      int []merge=new int[h-l+1];
      int indx1=l;
      int indx2=mid+1;
      int x=0;
      while (indx1<=mid&&indx2<=h){
          if(a[indx1]<=a[indx2]){
              merge[x++]=a[indx1++];
          }
          else {
              merge[x++]=a[indx2++];
          }
      }
      while (indx1<=mid){
           merge[x++]=a[indx1++];
      }
      while (indx2<=h){
          merge[x++]=a[indx2++];
      }
      for(int i=0,j=l;i<merge.length;i++,j++){
          a[j]=merge[i];
      }
    }

    public static void main(String[] ris) {
        int []a={12,7,3,4,8,5,9,6,1,26};
        int n=a.length;
        int l=0;
        int h=n-1;
        divide(a,l,h);
        for (int i : a) System.out.print(i + " ");
    }
}

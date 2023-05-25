public class arrSUM {
    public static int sumLH(int []a){
        /*Arrays.sort(a);
        int l=a[0];
        int h=a[a.length-1];
        int sum =l+h;*/
        int i;
        int max=a[0],min=a[0];
        for(i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        int sum = max+min;
        System.out.println(i);
        return sum;
    }

    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7,8,9,10};
        System.out.print(sumLH(a));

    }
}

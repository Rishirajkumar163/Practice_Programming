import java.util.*;
public class Union {
    /* public static void doUnion(int a[], int n, int b[], int m)
     {
         Set<Integer> s= new HashSet<>();
         for(int i = 0 ; i < n ; i++)
             s.add(a[i]);
         for(int i = 0 ; i < m ; i++)
             s.add(b[i]);

         int k = s.size();
         System.out.println(k+"");
         Object[] arr=s.toArray();
         Arrays.sort(arr);
         for(int i=0;i<k;i++)
             System.out.println(arr[i]+" ");
     }
     public static void main(String args[])
     {
         int arr1[] = { 1, 2, 4,8,11,72,32,9, 5, 6 };
         int arr2[] = { 2, 3, 5,15,61,37,6,12 };
         int m = arr1.length;
         int n = arr2.length;
         doUnion(arr1,m,arr2,n);*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        int[] price = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            price[i] = sc.nextInt();
        }
        int max = 0;
        int max1 = 0;
        for (int i = N - 1; i > 0; i--) {
            if (arr[i] == K) {
                max = price[i];
                break;
            }
            for (int j = N - 2; j >= 0; j--) {
                int sum = arr[i] + arr[j];
                if (sum <= K && sum > max1) {
                    max1 = sum;
                    max = price[i] + price[j];
                }
            }
        }
    }
}
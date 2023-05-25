import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class find_unique {
    public static void main(String[] args) {
        int []arr ={6,10,5,4,9,120,4,6,10};//{1,5,6,5,5,6,7,1,6,5,2,1,1,5,6,2,1};
        int n=arr.length;
      // 4th Method
         HashMap<Integer,Integer> list=new HashMap<>();
       for(int i=0;i<n;i++){
           list.put(arr[i],i);
       }
        System.out.println(list.keySet()+"Size="+n);
       //3rd Method
        HashSet<Integer> arr1=new HashSet<>();
        for(int i=0;i<n;i++){
            arr1.add(arr[i]);
        }
        System.out.println(arr1);


     //   2nd Method
      Arrays.sort(arr);
       for(int i=0;i<n;i++){
           while (i<n-1 && arr[i]==arr[i+1])
               i++;
           System.out.print(arr[i]+" ");
       }

       //1st Method
        System.out.println();
        for(int i=0;i<n;i++){
            int j;
            for(j=0;j<i;j++){
                if(arr[i]==arr[j])
                    break;}
                if(i==j)
                    System.out.print(arr[i]+" ");
        }

    }

}

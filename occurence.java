import java.util.*;

import static java.lang.System.exit;

//System.out.print((char)2384+" "+(char)2332+""+(char)2351+" "+(char)2352+""+(char)2366+""+(char)2350+" ");}
public class occurence {

    public static void main(String[] args) {
       int arr[] = {28, 7, -36, 21 ,-21, -50, 9 ,-32};//arr[] = {0,-10,1,3,-20}//8,9,10,11,13,
        Arrays.sort(arr);int N=arr.length;
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
            if(arr[i]>=0){
               a.add(arr[i]);
            }
        }
        System.out.println();
        for(int i:a) System.out.print(i+" ");
        int n=a.size();
        int f=a.get(0);
        int x=0;
       for(int i=0;i<n;i++){
            if(a.get(i)==1)
           if(i<=n){
               if(a.get(i)==f){
               f++;
           }
           else{
               x=f;
           break;}
           }
           x=f;
       }
        System.out.println();
        System.out.println(x);
}}

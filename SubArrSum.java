import java.util.ArrayList;

public class SubArrSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int []a={1,2,3,7,5};
        int s=10;
        int n=a.length;
        int j=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
            if(sum==s){
                list.add(j+1);
                list.add(i+1);
                break;
            }
            if(s<sum){
                i=j;
                j++;
                sum=0;

            }
        }
        if(list.size()==0){
            list.add(-1);
        }
        System.out.println(list);

    }
}

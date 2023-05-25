import java.util.Stack;
public class Stack_Permuntation {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int n =a.length;
        int []p={3,4,5,1,2};
        permuntation(a,p,n);
    }
   public static void permuntation(int []a,int []p,int n){
       Stack<Integer> stack=new Stack<>();
        int i=0;int j=0;
       while(i<n){
           //System.out.println(stack.push(a[i]));
           stack.push(a[i]);
           while (!stack.isEmpty()&&stack.peek()==p[j]){
               System.out.println(stack.pop());
               j++;
           }
           i++;
       }
       if(! stack.isEmpty()){
           System.out.println(stack);
       }
   }
}

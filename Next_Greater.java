import java.util.Stack;
import java.util.Arrays;

public class Next_Greater {
    public static void main(String[] args) {
        int []a={1,3,2,-5,-3,4};
        int n=a.length;
        int arr[]=new int[n];
        Stack<Integer>stack=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=a[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr[i]=-1;
            }
            else {
                arr[i]=stack.peek();
            }
            stack.push(a[i]);
        }
        for(int i:a) System.out.println(i);


        }
    }
    /*Given a string S. The task is to find the first repeated character in it. We need to find the character that occurs more than once and whose index of second occurrence is smallest. S contains only lowercase letters.



        Example 1:

        Input: S="geeksforgeeks"
        Output: e
        Explanation: 'e' repeats at third position.


        Example 2:

        Input: S="hellogeeks"
        Output: l
        Explanation: 'l' repeats at third position.*/
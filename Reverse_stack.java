import input.user;

import java.util.Stack;

public class Reverse_stack {
    public static void main(String[] args) {
        Stack stack= new Stack();
       String s= user.string();
       int n= s.length(),i=0;
       while(i<n){
           stack.push(s.charAt(i));i++;
           }
       while (!stack.isEmpty())
        System.out.print(stack.pop());

    }
}

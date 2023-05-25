import input.user;

import java.util.Stack;

public class Split_Reverse {
    public static String reverse(String s){
        String S="";
        int n=s.length();
        if(n<=1)
            return s;
        else{
        for(int i=n-1;i>=0;i--){
            S=S+s.charAt(i);
        }
        return S;
        }
    }
    public static String split(String s){
        String a="";
        s=s.replace("."," ");
        String []S;
        S = s.split(" ");
        int n=S.length;
        StringBuilder st=new StringBuilder(S[n-1]);
        for(int i=0;i<n-1;i++){
            StringBuilder sb=new StringBuilder(S[i]);
            sb.reverse();
           a=a+sb+".";
        }
        st.reverse();
        a=a+st;
        return a;
    }
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        String s = user.string();
        String S="";
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='.'){
                while(!stack.isEmpty()){
                    S=S+stack.pop();
                }
                S=S+".";
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        while (!stack.isEmpty()){
            S=S+stack.pop();
        }
        System.out.println(stack);
        System.out.println(S);

    }


}

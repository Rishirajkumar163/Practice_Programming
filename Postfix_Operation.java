import java.util.Stack;

public class Postfix_Operation {
    public static void main(String[] args) {
        int sum=0;
        Stack <Integer> stack = new Stack();
        String str="abcd+**-";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='+'&& str.charAt(i)!='*'&&str.charAt(i)!='-'&&str.charAt(i)!='/'){
                stack.push(str.charAt(i)-'0');
            }
            else
            {
                int a=stack.pop();
                int b=stack.pop();
                switch (str.charAt(i)){
                    case '+':
                       sum=b+a;
                       stack.push(sum);
                       break;
                    case '*':
                        sum=b*a;
                        stack.push(sum);
                        break;
                    case '-':
                        sum= b-a;
                        stack.push(sum);
                        break;
                    case '/':
                        sum=b/a;
                        stack.push(sum);
                        break;



                }
            }
        }
        System.out.print(stack.pop());


    }
}

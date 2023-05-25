import input.user;
public class palidrom {
    public static void main(String[] args) {
        String string=user.string();//level
        int n=string.length()-1,i=0;
        while(i<n) {
            if(string.charAt(i) != string.charAt(n)) {
                System.out.println(string + " is not a palindrom");
                System.exit(0);
            }
            n--;
            i++;
        }
                System.out.println(string+" is a palindrom");

    }
}

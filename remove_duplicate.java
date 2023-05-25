import java.util.HashSet;


public class remove_duplicate {
    public static void main(String[] args) {
        HashSet<Character> set=new HashSet<>();
        String s="geeksforgeeks";
        String S="";
        for (int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
            set.add(s.charAt(i));
            S=S+s.charAt(i);
        }}
        System.out.println(S);

    }
}

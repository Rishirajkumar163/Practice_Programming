import java.util.*;

public class cont_vowel {
    public static void main(String [] rds) {

        HashMap<String, Integer> dict = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] sum ={1,1,1,1,1};
        char[] ch = new char[str.length()];
        for (int i = 0; i <str.length(); i++) {
            ch[i] = str.charAt(i);
            if (ch[i] == 'o' || ch[i] == 'O') {
                dict.put("o", sum[0]++);
            }
            if (ch[i] == 'i' || ch[i] == 'I') {
                dict.put("i", sum[1]++);
            }
            if (ch[i] == 'a' || ch[i] == 'A') {
                dict.put("a", sum[2]++);
            }
            if (ch[i] == 'E' || ch[i] == 'e') {
                dict.put("e", sum[3]++);
            }
            if (ch[i] == 'u' || ch[i] == 'U') {
                dict.put("u", sum[4]++);
            }
        }
        System.out.println(dict);


       /* convert char to int
       1. char a=ch[0];
        2. int _a=a-'0';  simple use these two point;*/
       /* ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element");
        int N = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == N) {
                System.out.println("Indx No =" + i);
            } else if (i == n - 1)
                System.out.println("Element Not found");*/

        }
    }


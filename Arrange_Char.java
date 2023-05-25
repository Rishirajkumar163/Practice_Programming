import input.user;

import java.util.HashMap;
import java.util.Map;

class Arrange_Char {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap();
        String s = user.string();
        s = s.replace(" ", "");
        int n = s.length();
        char[] a = s.toCharArray();
        int count = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            x = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    x++;
                }
            }
            map.put(a[i], x);

        }
        if (x == 2) {
            count++;
        }
        System.out.println(map);
        System.out.println(count);
    }}
        class count_no {

            public static void count(String S, int N) {
                HashMap<Character, Integer> map = new HashMap<Character, Integer>();
                int cou = 0;
                char[] a = S.toCharArray();
                for (int i = 0; i < a.length; i++) {
                    if (!map.containsKey(a[i])) {
                        map.put(a[i], 1);
                    } else {
                        if (a[i - 1] != a[i]) {
                            int count = map.get(a[i]);
                            count++;
                            map.put(a[i], count);

                        }
                    }
                }
                for (Map.Entry<Character, Integer> e : map.entrySet()) {
                    if (e.getValue() == N)
                        cou++;
                }
            }
        }

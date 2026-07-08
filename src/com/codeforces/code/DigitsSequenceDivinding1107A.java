package com.codeforces.code;

import java.util.*;

public class DigitsSequenceDivinding1107A {

    static boolean greater(String a, String b) {
        if (a.length() != b.length())
            return a.length() > b.length();
        return a.compareTo(b) > 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while (q-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            List<String> ans = new ArrayList<>();

            String prev = s.substring(0, 1);
            ans.add(prev);

            int i = 1;
            boolean ok = true;

            while (i < n) {
                StringBuilder cur = new StringBuilder();

                while (i < n) {
                    cur.append(s.charAt(i));
                    i++;

                    if (greater(cur.toString(), prev))
                        break;
                }

                if (!greater(cur.toString(), prev)) {
                    ok = false;
                    break;
                }

                prev = cur.toString();
                ans.add(prev);
            }

            if (!ok || ans.size() < 2) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(ans.size());

                for (String x : ans)
                    System.out.print(x + " ");

                System.out.println();
            }
        }
    }
}
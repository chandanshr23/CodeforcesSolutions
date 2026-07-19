package com.codeforces.code;

import java.util.*;

public class GoodArrays1777A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int ans = 0;
            int cnt = 1;

            int prev = sc.nextInt();

            for (int i = 1; i < n; i++) {
                int curr = sc.nextInt();

                if ((prev & 1) == (curr & 1)) {
                    cnt++;
                } else {
                    ans += cnt - 1;
                    cnt = 1;
                }

                prev = curr;
            }

            ans += cnt - 1;

            System.out.println(ans);
        }

        sc.close();
    }
}
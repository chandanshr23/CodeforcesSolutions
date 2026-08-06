package com.codeforces.code;

import java.io.*;
import java.util.*;

public class YetAnotherComparision2247B {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            long m = Long.parseLong(st.nextToken());

            if (m == 1) {
                if (k != 1) {
                    out.append("NO\n");
                } else {
                    out.append("YES\n");
                    for (int i = 0; i < n; i++) {
                        out.append(1).append(" ");
                    }
                    out.append("\n");
                }
                continue;
            }

            if (k > m) {
                out.append("NO\n");
                continue;
            }

            out.append("YES\n");

            long[] pref = new long[n + 1];

            for (int i = 0; i <= n; i++) {
                if (i < k)
                    pref[i] = i;
                else
                    pref[i] = pref[i - k];
            }

            for (int i = 1; i <= n; i++) {
                long d = (pref[i] - pref[i - 1] + m) % m;
                if (d == 0) d = m;
                out.append(d).append(" ");
            }
            out.append("\n");
        }

        System.out.print(out);
    }
}
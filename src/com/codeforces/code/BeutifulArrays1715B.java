package com.codeforces.code;

import java.io.*;
import java.util.*;

public class BeutifulArrays1715B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder out = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long s = Long.parseLong(st.nextToken());

            long min = b * k;
            long max = min + (long) n * (k - 1);

            if (s < min || s > max) {
                out.append("-1\n");
                continue;
            }

            long[] ans = new long[n];
            ans[0] = min;

            long extra = s - min;

            for (int i = 0; i < n && extra > 0; i++) {
                long add = Math.min(extra, k - 1);
                ans[i] += add;
                extra -= add;
            }

            for (int i = 0; i < n; i++) {
                out.append(ans[i]).append(" ");
            }
            out.append("\n");
        }

        System.out.print(out);
    }
}
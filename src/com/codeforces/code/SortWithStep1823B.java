package com.codeforces.code;

import java.io.*;
import java.util.*;

public class SortWithStep1823B {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreElements())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int T = fs.nextInt();

        while (T-- > 0) {
            int n = fs.nextInt();
            int k = fs.nextInt();

            ArrayList<Integer> bad = new ArrayList<>();

            int[] p = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                p[i] = fs.nextInt();
                if ((i - 1) % k != (p[i] - 1) % k)
                    bad.add(i);
            }

            if (bad.size() == 0) {
                out.append(0).append('\n');
            } else if (bad.size() != 2) {
                out.append(-1).append('\n');
            } else {
                int a = bad.get(0);
                int b = bad.get(1);

                boolean ok =
                        ((a - 1) % k == (p[b] - 1) % k) &&
                        ((b - 1) % k == (p[a] - 1) % k);

                out.append(ok ? 1 : -1).append('\n');
            }
        }

        System.out.print(out);
    }
}
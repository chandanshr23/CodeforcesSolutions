package com.codeforces.code;

import java.io.*;
import java.util.*;

public class EqualizeByDivide1799B {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
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
            int[] a = new int[n];

            boolean hasOne = false;
            boolean allEqual = true;

            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
                if (a[i] == 1) hasOne = true;
                if (i > 0 && a[i] != a[0]) allEqual = false;
            }

            if (allEqual) {
                out.append(0).append('\n');
                continue;
            }

            if (hasOne) {
                out.append(-1).append('\n');
                continue;
            }

            ArrayList<int[]> ops = new ArrayList<>();

            while (true) {
                int mn = Integer.MAX_VALUE;
                int id = -1;

                for (int i = 0; i < n; i++) {
                    if (a[i] < mn) {
                        mn = a[i];
                        id = i;
                    }
                }

                boolean done = true;

                for (int i = 0; i < n; i++) {
                    if (a[i] > mn) {
                        done = false;
                        a[i] = (a[i] + mn - 1) / mn;
                        ops.add(new int[]{i + 1, id + 1});
                    }
                }

                if (done) break;
            }

            out.append(ops.size()).append('\n');
            for (int[] op : ops)
                out.append(op[0]).append(' ').append(op[1]).append('\n');
        }

        System.out.print(out);
    }
}
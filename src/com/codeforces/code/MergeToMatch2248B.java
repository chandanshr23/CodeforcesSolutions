package com.codeforces.code;

import java.util.*;
import java.io.*;

public class MergeToMatch2248B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int t = (int) st.nval;
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st.nextToken();
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;

            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < n; i++) { st.nextToken(); a[i] = (int) st.nval; }
            for (int i = 0; i < m; i++) { st.nextToken(); b[i] = (int) st.nval; }

            if (n < 2L * m) {
                sb.append("NO\n");
                continue;
            }

            Arrays.sort(a);
            Arrays.sort(b);

            boolean ok = true;

            // Low pool: smallest m elements of a, must be <= b[k]
            for (int k = 0; k < m; k++) {
                if (a[k] > b[k]) { ok = false; break; }
            }

            // High pool: largest m elements of a, must be >= b[k]
            if (ok) {
                for (int k = 0; k < m; k++) {
                    if (a[n - m + k] < b[k]) { ok = false; break; }
                }
            }

            sb.append(ok ? "YES" : "NO").append('\n');
        }

        System.out.print(sb);
    }
}
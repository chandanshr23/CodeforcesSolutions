package com.codeforces.code;
import java.io.*;
import java.util.*;

import java.util.*;
import java.io.*;

public class AnnoyingTheGhost2237B {
    static int[] bit;
    static int n;

    static void update(int pos) {
        pos++; // 1-indexed
        for (; pos <= n; pos += pos & (-pos)) bit[pos]++;
    }

    static long query(int pos) {
        pos++; // 1-indexed
        long s = 0;
        for (; pos > 0; pos -= pos & (-pos)) s += bit[pos];
        return s;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int t = (int) st.nval;
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st.nextToken();
            n = (int) st.nval;

            long[] a = new long[n];
            long[] b = new long[n];
            for (int i = 0; i < n; i++) { st.nextToken(); a[i] = (long) st.nval; }
            for (int i = 0; i < n; i++) { st.nextToken(); b[i] = (long) st.nval; }

            long[] as = a.clone();
            Arrays.sort(as);
            boolean feasible = true;
            for (int k = 0; k < n; k++) {
                if (as[k] > b[k]) { feasible = false; break; }
            }

            if (!feasible) {
                sb.append(-1).append('\n');
                continue;
            }

            Integer[] order = new Integer[n];
            for (int i = 0; i < n; i++) order[i] = i;
            Arrays.sort(order, (x, y) -> Long.compare(a[x], a[y]));

            PriorityQueue<Integer> heap = new PriorityQueue<>();
            int[] orig = new int[n];
            int ptr = 0;

            for (int j = 0; j < n; j++) {
                while (ptr < n && a[order[ptr]] <= b[j]) {
                    heap.add(order[ptr]);
                    ptr++;
                }
                orig[j] = heap.poll();
            }

            // inversion count via BIT, scanning right to left
            bit = new int[n + 2];
            long inv = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (orig[j] - 1 >= 0) inv += query(orig[j] - 1);
                update(orig[j]);
            }

            sb.append(inv).append('\n');
        }

        System.out.print(sb);
    }
}
package com.codeforces.code;
import java.io.*;
import java.util.*;

public class MarkTheDustSWeeper1705B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            long ans = 0;
            boolean started = false;

            for (int i = 0; i < n; i++) {
                long x = Long.parseLong(st.nextToken());

                if (i == n - 1) continue; // ignore last room

                if (x > 0) {
                    started = true;
                    ans += x;
                } else if (started) {
                    ans++;
                }
            }

            out.append(ans).append('\n');
        }

        System.out.print(out);
    }
}
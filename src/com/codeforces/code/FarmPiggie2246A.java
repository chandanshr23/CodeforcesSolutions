package com.codeforces.code;

import java.io.*;
import java.util.*;

public class FarmPiggie2246A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int[] p = new int[n + 1];
            int even = 2;
            int odd = 1;

            for (int i = 1; i <= n; i++) {
                if ((i & 1) == 1) {
                    p[i] = even;
                    even += 2;
                } else {
                    p[i] = odd;
                    odd += 2;
                }
            }

            for (int i = 1; i <= n; i++) {
                out.append(p[i]).append(' ');
            }
            out.append('\n');
        }

        System.out.print(out);
    }
}
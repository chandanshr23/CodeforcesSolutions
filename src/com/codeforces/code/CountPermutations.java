package com.codeforces.code;

import java.io.*;

public class CountPermutations {

    static final long MOD = 1000000007L;
    static final long INV2 = 500000004L; // modular inverse of 2
    static final int MAX = 200000;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        long[] fact = new long[MAX + 1];
        fact[0] = 1;

        for (int i = 1; i <= MAX; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            long ans = (fact[2 * n] * INV2) % MOD;

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}
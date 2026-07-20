package com.codeforces.code;
import java.io.*;
import java.util.*;
 
public class Emordnilap1777B {
    static final long MOD = 1_000_000_007L;
    static final int MAX = 100000;
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        long[] fact = new long[MAX + 1];
        fact[0] = 1;
        for (int i = 1; i <= MAX; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
 
        int T = Integer.parseInt(br.readLine());
        StringBuilder out = new StringBuilder();
 
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
 
            long ans = fact[n];
            ans = (ans * n) % MOD;
            ans = (ans * (n - 1)) % MOD;
 
            out.append(ans).append('\n');
        }
 
        System.out.print(out);
    }
}


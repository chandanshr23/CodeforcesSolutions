package com.codeforces.code;
import java.io.*;
import java.util.*;

public class AnotherPopcountProblem2240A {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());

            // Give every number a 1-bit first.
            long ans = Math.min(n, k);

            if (n < k) {
                System.out.println(ans);
                continue;
            }

            long remaining = n - k;

            // Additional bits cost 2, 4, 8, ...
            long cost = 2;

            while (remaining >= cost && cost <= n) {
                long canTake = Math.min(k, remaining / cost);

                ans += canTake;
                remaining -= canTake * cost;

                cost *= 2;
            }

            System.out.println(ans);
        }
    }
}
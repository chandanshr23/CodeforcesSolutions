package com.codeforces.code;
import java.util.*;

public class UncowedForces604A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = {500, 1000, 1500, 2000, 2500};
        int[] m = new int[5];
        int[] w = new int[5];

        for (int i = 0; i < 5; i++) {
            m[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            w[i] = sc.nextInt();
        }

        int hs = sc.nextInt();
        int hu = sc.nextInt();

        int ans = 0;

        for (int i = 0; i < 5; i++) {
            int score = Math.max(
                3 * x[i] / 10,
                x[i] - x[i] * m[i] / 250 - 50 * w[i]
            );

            ans += score;
        }

        ans += 100 * hs - 50 * hu;

        System.out.println(ans);
    }
}
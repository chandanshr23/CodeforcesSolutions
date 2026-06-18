package com.codeforces.code;

import java.util.*;

public class Greed892A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long total = 0;
        long[] b = new long[n];

        for (int i = 0; i < n; i++) {
            total += sc.nextLong();
        }

        long max1 = 0, max2 = 0;

        for (int i = 0; i < n; i++) {
            long cap = sc.nextLong();

            if (cap >= max1) {
                max2 = max1;
                max1 = cap;
            } else if (cap > max2) {
                max2 = cap;
            }
        }

        if (max1 + max2 >= total) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
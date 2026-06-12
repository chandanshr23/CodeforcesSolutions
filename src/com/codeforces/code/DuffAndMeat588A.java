package com.codeforces.code;

import java.util.*;

public class DuffAndMeat588A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long ans = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); // meat needed
            int p = sc.nextInt(); // price per kg today

            minPrice = Math.min(minPrice, p);
            ans += (long) a * minPrice;
        }

        System.out.println(ans);
    }
}
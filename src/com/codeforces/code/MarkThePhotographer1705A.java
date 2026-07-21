package com.codeforces.code;

import java.util.*;

public class MarkThePhotographer1705A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] h = new int[2 * n];

            for (int i = 0; i < 2 * n; i++)
                h[i] = sc.nextInt();

            Arrays.sort(h);

            boolean ok = true;

            for (int i = 0; i < n; i++) {
                if (h[i + n] - h[i] < x) {
                    ok = false;
                    break;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}
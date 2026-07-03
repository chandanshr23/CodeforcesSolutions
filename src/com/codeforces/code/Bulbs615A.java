package com.codeforces.code;

import java.util.*;

public class Bulbs615A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[] on = new boolean[m + 1];

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();

            for (int j = 0; j < x; j++) {
                int bulb = sc.nextInt();
                on[bulb] = true;
            }
        }

        for (int i = 1; i <= m; i++) {
            if (!on[i]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
package com.codeforces.code;

import java.util.*;

public class OathOfNightsWatch768A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Read input and find min & max
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }

        int count = 0;

        // Count elements strictly between min and max
        for (int i = 0; i < n; i++) {
            if (a[i] > min && a[i] < max) {
                count++;
            }
        }

        System.out.println(count);
    }
}
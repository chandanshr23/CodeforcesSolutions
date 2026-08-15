package com.codeforces.code;

import java.util.*;

public class ThreeNumbers2256A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long[] arr = {a, b, c};
            Arrays.sort(arr);

            long min = arr[0];
            long mid = arr[1];
            long max = arr[2];

            long originalRange = max - min;
            long newRange = mid;

            System.out.println(Math.min(originalRange, newRange));
        }

        sc.close();
    }
}
package com.codeforces.code;

import java.util.*;

public class ACharacteristics1823A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            boolean found = false;

            for (int ones = 0; ones <= n; ones++) {
                int minus = n - ones;

                int pairs = ones * (ones - 1) / 2
                          + minus * (minus - 1) / 2;

                if (pairs == k) {
                    found = true;
                    System.out.println("YES");

                    for (int i = 0; i < ones; i++)
                        System.out.print("1 ");

                    for (int i = 0; i < minus; i++)
                        System.out.print("-1 ");

                    System.out.println();
                    break;
                }
            }

            if (!found)
                System.out.println("NO");
        }
    }
}
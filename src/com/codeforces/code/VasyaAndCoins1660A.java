package com.codeforces.code;

import java.util.*;

public class VasyaAndCoins1660A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a == 0)
                System.out.println(1);
            else
                System.out.println(a + 2 * b + 1);
        }

        sc.close();
    }
}
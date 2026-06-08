package com.codeforces.code;
import java.util.*;

public class kRounding858A {
    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        long tenPow = 1;
        for (int i = 0; i < k; i++) {
            tenPow *= 10;
        }

        long ans = n / gcd(n, tenPow) * tenPow;
        System.out.println(ans);
    }
}
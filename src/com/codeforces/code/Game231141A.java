package com.codeforces.code;

import java.util.*;

public class Game231141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        if (m % n != 0) {
            System.out.println(-1);
            return;
        }

        long x = m / n;
        int moves = 0;

        while (x % 2 == 0) {
            moves++;
            x /= 2;
        }

        while (x % 3 == 0) {
            moves++;
            x /= 3;
        }

        if (x == 1)
            System.out.println(moves);
        else
            System.out.println(-1);
    }
}
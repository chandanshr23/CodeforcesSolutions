package com.codeforces.code;


import java.util.*;

public class MinimalQuares1360A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a > b) {
                long temp = a;
                a = b;
                b = temp;
            }

            long side = Math.max(2 * a, b);
            System.out.println(side * side);
        }
    }
}
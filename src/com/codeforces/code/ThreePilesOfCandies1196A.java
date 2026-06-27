package com.codeforces.code;

import java.util.*;

public class ThreePilesOfCandies1196A {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while (q-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            System.out.println((a + b + c) / 2);
        }
    }
}
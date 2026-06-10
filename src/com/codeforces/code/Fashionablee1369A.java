package com.codeforces.code;

import java.util.*;

public class Fashionablee1369A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while (t-- > 0) {
            long n = scan.nextLong();

            if (n % 2 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
package com.codeforces.code;

import java.util.*;

public class DisplayTheNumbers1295A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            StringBuilder ans = new StringBuilder();

            if (n % 2 == 1) {
                ans.append('7');
                n -= 3;
            }

            while (n > 0) {
                ans.append('1');
                n -= 2;
            }

            System.out.println(ans);
        }
    }
}
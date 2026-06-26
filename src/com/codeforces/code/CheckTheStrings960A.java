package com.codeforces.code;

import java.util.*;

public class CheckTheStrings960A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = s.length();
        int i = 0;

        int a = 0, b = 0, c = 0;

        while (i < n && s.charAt(i) == 'a') {
            a++;
            i++;
        }

        while (i < n && s.charAt(i) == 'b') {
            b++;
            i++;
        }

        while (i < n && s.charAt(i) == 'c') {
            c++;
            i++;
        }

        if (i != n || a == 0 || b == 0 || c == 0) {
            System.out.println("NO");
            return;
        }

        if (c == a || c == b)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
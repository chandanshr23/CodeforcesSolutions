package com.codeforces.code;

import java.util.*;

public class VitalyAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        char[] arr = s.toCharArray();

        int i = arr.length - 1;

        while (i >= 0) {
            if (arr[i] == 'z') {
                arr[i] = 'a';
                i--;
            } else {
                arr[i]++;
                break;
            }
        }

        String next = new String(arr);

        if (next.equals(t))
            System.out.println("No such string");
        else
            System.out.println(next);
    }
}